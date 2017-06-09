import com.google.gson.Gson
import java.net.URL

fun main(args: Array<String>) {
    var amount = 0

    do {
        print("How many fortune cookies do you want? [1-5] ")

        try {
            amount = readLine()!!.trim().toInt()
        } catch (e: NumberFormatException) {
            continue
        }
    } while (amount < 1 || amount > 5)

    val fortuneCookies = Gson().fromJson(
            URL("http://fortunecookieapi.herokuapp.com/v1/cookie?limit=$amount").readText(),
            Array<FortuneCookie>::class.java
    )

    for ((fortune, lesson, lotto) in fortuneCookies) {
        println()
        println(fortune)
        println(lesson)
        println(lotto)
    }
}
