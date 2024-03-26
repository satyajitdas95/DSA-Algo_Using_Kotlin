package datastructures

fun main() {

    //immutable arrays
    val arr = arrayOf(1,2,3,4,5) //will accept any data type
    val arr2 = Array(50) { i -> "arrNum $i" }

    val arrOfInt = intArrayOf(1,2,3,4)
    val arrayChar= charArrayOf('a','v','s')
    val arrayOfBoolean = booleanArrayOf(true,false,false)

    val a = arrOfInt[0]  // O(1)
    arrOfInt[1] = 121    // O(1)



}