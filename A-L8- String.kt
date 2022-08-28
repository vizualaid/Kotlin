fun()
{
  //Access a String
var txt = "Hello World"
println(txt[0]) // first element (H)
println(txt[2]) // third element (l)
//String Length
println("The length of the txt string is: " + txt.length)
//String Functions
var t = "Hello World"
println(t.toUpperCase())   // Outputs "HELLO WORLD"
println(t.toLowerCase())   // Outputs "hello world"
//Comparing Strings
var txt1 = "Hello World"
var txt2 = "Hello World"
println(txt1.compareTo(txt2))  // Outputs 0 (they are equal)
//Finding a String in a String
var txtf = "Please locate where 'locate' occurs!"
println(txtf.indexOf("locate"))  // Outputs 7
//Quotes Inside a String
var txt1 = "It's alright"
var txt2 = "That's great"
  //String Concatenation
  println(txt1+" "+txt2)
  var firstName = "John "
  var lastName = "Doe"
  println(firstName.plus(lastName))
  
  //String Templates/Interpolation
//   Instead of concatenation, you can also use "string templates", 
//which is an easy way to add variables and expressions inside a string.
// Just refer to the variable with the $ symbol:
  println("My name is $firstName $lastName")
  

}
