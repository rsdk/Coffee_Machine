class Player(val id: Int, val name: String, val hp: Int) {
    companion object {
        var id: Int = 0
        fun create(name: String): Player {
            val hp: Int = 100
            return Player(id++, name, hp)
        }
    }
}