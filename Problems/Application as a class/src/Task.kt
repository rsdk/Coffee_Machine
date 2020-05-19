class Application(val name: String) {

    // write the run method here
    fun run(args: Array<String>) {
        println(name)
        args.forEach {
            println("$it")
        }
    }
}