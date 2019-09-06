package ifExpressions1

fun checkSign(number: Int): String {
    if (number == 0) {
        return "zero"
    }

    if (number > 0) {
        return "positive"
    }

    return "negative"
}


fun main(args: Array<String>) {
    println(checkSign(-19))  // negative
}