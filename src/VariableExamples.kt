/**
 * @author Alexander Kuleshov
 * @version 1.0
 * @since 24.10.2017
 *
 * Here are examples of declaring variables
 */

//examples of declaring variables without declaring type
//declaring String variable
val text = "Hello!"
//declaring Int variable
val num = 10
//declaring Double variable
val pi = 3.14
val googol = 1.0e100

//declaring variable with declaring type
val num2: Int = 10;

//declaring variable without init value
fun declareVariableWithoutInitValue() {
    val num3: Int
    //...
    num3 = 10
}

fun mutableAndImmutableVariables() {
    //example of mutable variable
    //Java equivalent 'int x = 7'
    var x = 7
    x = 8
    x = num

    //example of immutable variable
    //Java equivalent 'final int x = 7'
    val y = 7
    //must not!
    //y = 8
}

