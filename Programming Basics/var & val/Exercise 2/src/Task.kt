package varandval2

fun main(args: Array<String>) {
    var x = 1;
    var y = 2;
    var temp: Int;

    temp = x
    x = y
    y = temp

    println(x)
    println(y)
}