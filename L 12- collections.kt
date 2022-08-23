/*List<T> stores elements in a specified order and provides indexed access to them.
Indices start from zero – the index of the first element – and go to lastIndex which is the (list.size - 1).
List elements (including nulls) can duplicate: a list can contain any number of equal objects or occurrences of a single object.
Two lists are considered equal if they have the same sizes and structurally equal elements at the same positions.


LIST- unordered, duplicates allowed, 
SET- Ordered, unique elements,
*/
fun printAll(strings: Collection<String>) {
    for(s in strings) print("$s ")
    println()
}

fun main() {
   
    //Collection
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

//MutableCollection<T> is a Collection with write operations, such as add and remove.
    
    
    //MutableList<T> is a List with list-specific write operations, 
    //for example, to add or remove an element at a specific position.
     val numbers = mutableListOf(1, 2, 3, 4)
    numbers.add(5)
    numbers.removeAt(1)
    numbers[0] = 0
    numbers.shuffle()
    println(numbers)
    
    
    
}
