data class Fortune(
        val id: String,
        val message: String
) {
    override fun toString() = "Message: $message"
}
