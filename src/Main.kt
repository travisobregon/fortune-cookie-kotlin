import com.google.gson.Gson
import java.net.URL

fun main(args: Array<String>) {
    val fortuneCookies = Gson().fromJson(
            URL("http://fortunecookieapi.herokuapp.com/v1/cookie?limit=${getInput()}").readText(),
            Array<FortuneCookie>::class.java
    )

    for ((fortune, lesson, lotto) in fortuneCookies) {
        println()
        println(fortune)
        println(lesson)
        println(lotto)
    }
}

fun getInput(): Int {
    print("How many fortune cookies do you want? [1-5] ")

    return try {
        val amount = readLine()!!.trim().toInt()

        if (amount < 1 || amount > 5) throw Exception() else amount
    } catch (e: Exception) {
        getInput()
    }
}
