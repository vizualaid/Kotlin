fun printAll(strings: Collection<String>) {
    for(s in strings) print("$s ")
    println()
}

fun main() {
    val stringList = listOf("one", "two", "one")
    println(stringList)
 //  stringList = listOf("one","two", "two", "one")
  //  println(stringList)
    val stringSet = setOf("one", "two", "three","four","one")
    printAll(stringSet)
     val theList = listOf(1,2,3,4,5)
//    val itr= theList.listIterator()
//    while(itr.hasNext())
//        println(itr.next())

    theList.forEach { println(it) }
   println("Size= "+ theList.size)

    if(theList.contains(2)){
        print("Yees")

    }
    else {
        print("No")
    }
       if(theList.isEmpty())
           print("Yees")
        else
           print("No")
    println("Index of 2:"+ theList.indexOf(2))

}
