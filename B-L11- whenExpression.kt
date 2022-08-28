// Kotlin When Expression is similar to c,c++,and Java

fun main(args:Array<String>){
    var day=  readLine()!!.toInt()
    val res=when(day){
        1->"Monday"
        2->"Tuesday"
        3->"wednesday"
        4->"Thursday"
        5->"Friday"
        6->"saturday"
        7->"Sunday"
        else->"Invalid Input"

    }
    println(res)
 
    val a = 12
    val b = 5



//The when construct in Kotlin can be thought of as a replacement for Java switch Statement. 
//It evaluates a section of code among many alternatives.
val operator = readLine()

    val result = when (operator) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> a / b
        else -> "$operator operator is invalid operator."
    }  println(result)
    
    //In the above example, we used when as an expression. However, it's not mandatory to use when as an expression. For example,
     val aa = 12
    val bb = 5

    println("Enter operator either +, -, * or /")
    val operator = readLine()

    when (operator) {
        "+" -> println("$aa + $bb = ${aa + bb}")
        "-" -> println("$aa - $bb = ${aa - bb}")
        "*" -> println("$aa * $bb = ${aa * bb}")
        "/" -> println("$aa / $bb = ${aa / bb}")
        else -> println("$operator is invalid")
    }


}
