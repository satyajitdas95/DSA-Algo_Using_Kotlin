package bigo

fun main() {
    val collectionOfItems = Array<Int>(1000) { index -> index * 2 } // Creating array of 1000 Items
    constantTime(collectionOfItems)
    linearTime(collectionOfItems)
}

/*
O(1) - This function represent the Constant time complexity.
Does not matter whatever the Input size is the number of Operation will be same.
So the Big O of the function is O(1)
*/
fun constantTime(collectionOfItem:Array<Int>) {
    println(collectionOfItem[0])
    println(collectionOfItem[1])
    println(collectionOfItem[3])
}

/*
O(n) - This function represent the Linear time complexity.
If Input size increase is the number of Operation will be increase too in a linear way.
So the Big O of the function is O(n)
*/
fun linearTime(collectionOfItem: Array<Int>){
    for(item in collectionOfItem){
      println(item)
    }
}