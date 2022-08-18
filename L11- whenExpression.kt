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
}
