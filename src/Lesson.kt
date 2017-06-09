data class Lesson(
        val id: String,
        val english: String,
        val chinese: String,
        val pronunciation: String
) {
    override fun toString() = "Lesson: English: $english, Chinese: $chinese (pronounced $pronunciation)"
}
