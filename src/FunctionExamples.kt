/**
 * @author Alexander Kuleshov
 * @version 1.0
 * @since 24.10.2017
 *
 * Here are examples of declaring functions
 */

//example of function with return value
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b;
}

//simplified version of max()
fun simpleMax(a: Int, b: Int): Int = if (a > b) a else b

//type inference - another option of simplified version of max()
fun simpleMax2(a: Int, b: Int) = if (a > b) a else b

fun main(args: Array<String>) {
    println(max(1, 2))
    println(simpleMax(1, 2))
    println(simpleMax2(1, 2))
}