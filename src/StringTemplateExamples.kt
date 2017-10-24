/**
 * @author Alexander Kuleshov
 * @version 1.0
 * @since 24.10.2017
 *
 * Here are examples of string templates
 */

fun main(args: Array<String>) {
    //sample string template using '$'
    val name = if (args.isNotEmpty()) args[0] else "Boss"
    println("Hello, $name!")

    //init String variable
    val welcome = "Hello $name!"
    println(welcome)

    //more complex expression
    println("Hello, ${if (args.isNotEmpty()) args[0] else "Boss"}!")
}
