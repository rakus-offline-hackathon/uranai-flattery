import java.time.ZonedDateTime
import java.util.Scanner

fun main(args: Array<String>) {
    println(welcome)
    val scanner = Scanner(System.`in`)

    println(nameScan)
    val name = scanner.next()
    if (!isValidName(name)) {
        println(errorMessage)
        System.exit(1)
    }

    println(birthdayScan)
    val birthday = scanner.next()
    if (!isValidBirthday(birthday)) {
        println(errorMessage)
        System.exit(1)
    }

    val salt = ZonedDateTime.now().dayOfMonth;
    val destiny = calc(name.length, birthday.toInt(), salt)
    val result = getDivine(destiny)
    println(seeya)
    println(result)
}