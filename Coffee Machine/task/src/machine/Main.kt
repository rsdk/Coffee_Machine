package machine

import java.util.Scanner

fun main() {
    val cf = CoffeeMachine()
    cf.fill(400, 540, 120, 9)
    cf.moneyStock = 550
    val scanner = Scanner(System.`in`)

    do {
        cf.printQuestion()
        val action = scanner.next()
        cf.order(action)
    } while (action != "exit")

}


class CoffeeMachine {
    var waterStock: Int = 0
    var milkStock: Int = 0
    var coffeeStock: Int = 0
    var cupStock: Int = 0
    var moneyStock: Int = 0
    var machineState: status = status.MAIN

    enum class status {
        MAIN,
        BUY,
        FILL_WATER,
        FILL_MILK,
        FILL_COFFEE,
        FILL_CUPS
    }

    fun fill(water: Int, milk: Int, coffee: Int, cups: Int) {
        waterStock += water
        milkStock += milk
        coffeeStock += coffee
        cupStock += cups
    }

    fun takeMoney() {
        println("I gave you \$$moneyStock")
        moneyStock = 0
    }

    fun state() {
        println("The coffee machine has:")
        println("$waterStock of water")
        println("$milkStock of milk")
        println("$coffeeStock of coffee beans")
        println("$cupStock of disposable cups")
        println("$moneyStock of money")
        println()
    }

    fun printQuestion() {
        when (machineState) {
            status.MAIN -> println("Write action (buy, fill, take, remaining, exit):")
            status.BUY -> println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:")
            status.FILL_WATER -> println("Write how many ml of water do you want to add:")
            status.FILL_MILK -> println("Write how many ml of milk do you want to add:")
            status.FILL_CUPS -> println("Write how many disposable cups of coffee do you want to add:")
            status.FILL_COFFEE -> println("Write how many grams of coffee beans do you want to add:")
        }
    }

    fun espresso() {
        val water = 250
        val milk = 0
        val coffee = 16
        val money = 4
        if (check(water, milk, coffee, 1)) {
            println("I have enough resources, making you a coffee!")
            println()
            produce(water, milk, coffee, 1, money)
        }
    }

    fun latte() {
        val water = 350
        val milk = 75
        val coffee = 20
        val money = 7
        if (check(water, milk, coffee, 1)) {
            print("I have enough resources, making you a coffee!\n")
            produce(water, milk, coffee, 1, money)
        }
    }

    fun cappuccino() {
        val water = 200
        val milk = 100
        val coffee = 12
        val money = 6
        if (check(water, milk, coffee, 1)) {
            print("I have enough resources, making you a coffee!\n")
            produce(water, milk, coffee, 1, money)
        }
    }

    fun produce(water: Int, milk: Int, coffee: Int, cups: Int, money: Int) {
        waterStock -= water
        milkStock -= milk
        coffeeStock -= coffee
        cupStock -= cups
        moneyStock += money
    }

    fun check(water: Int, milk: Int, coffee: Int, cups: Int): Boolean {
        when {
            waterStock < water -> println("Sorry, not enough water!\n")
            milkStock < milk -> println("Sorry, not enough milk!\n")
            coffeeStock < coffee -> println("Sorry, not enough coffee!\n")
            cupStock < 1 -> println("Sorry, not enough cups!\n")
        }
        return waterStock >= water && milkStock >= milk && coffeeStock >= coffee && cupStock >= cups
    }

    fun order(action: String) {
        when (machineState) {
            status.MAIN -> {
                when (action) {
                    "remaining" -> state()
                    "buy" -> {
                        machineState = status.BUY
                    }
                    "take" -> takeMoney()
                    "fill" -> {
                        machineState = status.FILL_WATER
                    }
                    "1" -> espresso()
                    "2" -> latte()
                    "3" -> cappuccino()
                    "back" -> {
                        machineState = status.MAIN
                        println("Write action (buy, fill, take, remaining, exit):")
                    }

                }
            }
            status.BUY -> {
                when (action) {
                    "1" -> {
                        espresso()
                        machineState = status.MAIN
                    }
                    "2" -> {
                        latte()
                        machineState = status.MAIN
                    }
                    "3" -> {
                        cappuccino()
                        machineState = status.MAIN
                    }
                    "back" -> machineState = status.MAIN
                }
            }
            status.FILL_WATER -> {
                waterStock += action.toInt()
                machineState = status.FILL_MILK
            }
            status.FILL_MILK -> {
                milkStock += action.toInt()
                machineState = status.FILL_COFFEE
            }
            status.FILL_COFFEE -> {
                coffeeStock += action.toInt()
                machineState = status.FILL_CUPS
            }
            status.FILL_CUPS -> {
                cupStock += action.toInt()
                machineState = status.MAIN
            }
        }
    }

}
