package problems.array

fun main() {
    val itemArray = intArrayOf(1,2,3,4)
   /* Print all the pairs possible in the array
   * [1,2] , [1,3] , ....
   * [2,1] , [2,3] ...
   * */

    printPairsInArray(itemArray)

}

fun printPairsInArray(itemArray:IntArray){
    //This will return the initial item of the array
    for(index1 in itemArray.indices){
        for(index2 in itemArray.indices){
            if(index1 != index2){
                println("[${itemArray[index1]},${itemArray[index2]}]")
            }
        }
    }
}

/*
This code's Big O is O(n^2)*/
