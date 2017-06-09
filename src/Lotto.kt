data class Lotto(
        val id: String,
        val numbers: IntArray
) {
    override fun toString() = "Lotto numbers: ${numbers.joinToString()}"
}
