package manipulatingLists2

import atomictest.eq

fun <T> List<T>.zipWithIndex(): List<Pair<T, Int>> =
        TODO("mapIndexed { ??? }")

fun main(args: Array<String>) {
    val list = listOf('a', 'b', 'c')
    list.zipWithIndex() eq
            "[(a, 0), (b, 1), (c, 2)]"
}