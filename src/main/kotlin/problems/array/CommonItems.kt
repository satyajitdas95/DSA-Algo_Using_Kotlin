package problems.array

import kotlin.system.measureNanoTime

// Find if two arrays have any items in common
// [a,b,c,d] [z,x,c,q] true
// [p,l,k] [q,a,i] false
fun main() {
    val array1 = arrayOf("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r")
    val array2 = arrayOf("s","t","u","v","w","x","y","h")

    val time1 = measureNanoTime {
        val isCommonExists = findCommon(array1,array2)
        println("Common item exists : $isCommonExists")
    }
    println("Time taken in 1st approach $time1")

    val time2 = measureNanoTime {
        val isCommonExists2 = findCommon2(array1,array2)
        println("Common item exists2 : $isCommonExists2")
    }
    println("Time taken in 2nd approach $time2")

}

// Simple solution would be this
// The time complexity is O(n^2)
fun findCommon(arr:Array<String>,arr2:Array<String>):Boolean{
    for (item1 in arr){
        for(item2 in arr2){
            if(item1== item2){
                return true
            }
        }
    }
    return false
}

// Better Approach with time complexity of O(n+n) => O(2n) => O(n)
fun findCommon2(arr: Array<String>, arr2: Array<String>):Boolean{
    //Create a map which will store all unique items for arr1
    val setOfItems = mutableSetOf<String>()

    // loop through the first array and store all the unique items in the map
    for(item in arr){
        if (!setOfItems.contains(item)){
            setOfItems.add(item)
        }
    }

    //loop through the 2nd array to find if the set have any item of the 2nd array
    for (item in arr2){
        if(setOfItems.contains(item)){
            return true
        }
    }

    return false
}

