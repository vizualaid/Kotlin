/* 
  Kotlin Operators
  Operand	Operator	Operand
     100	    +     	50
     Kotlin divides the operators into the following groups:

Arithmetic operators + - * / % ++ -- 
Assignment operators = += -= *= /= %=
Comparison operators ==  !=  >   <   >=    <=
Logical operators && || !




*/
fun()
{

  //////////////////////////////////////////////////////
  var sum = 100 + 50       // 150 (100 + 50)
  var sub = sum - 250    
  var mul = sum * sub    
  var div = sub / sum
  var mod = sum % 2
  div++
  div--
  //////////////////////////////////////////////////////
  var x = 10
    x += 10
    x -= 10
    x *= 10
    x /= 10
    x %= 10
  ///////////////////////////////////////////////////////
   var x = 5
  var y = 3
  println(x == y) 
    println(x != y) 
      println(x > y)
        println(x < y) 
          println(x >= y) 
            println(x <= y) 
      
  //////////////////////////////////////////////////////
   var x = 5
  println(x > 3 && x < 10) 
   var y = 5
  println(y > 3 || y < 4)
  var myBool = true
  println(!myBool) 
}
