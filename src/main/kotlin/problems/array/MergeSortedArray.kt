package problems.array

import kotlin.system.measureNanoTime
import kotlin.system.measureTimeMillis

/*Merge Sorted Array
* [0,2,4,4,5,7] [1,3,4,7,9]
* Output will be  [0,1,2,3,4,4,4,5,7,7,9]
* */
fun main() {
    val array1 = IntArray(50) { index -> index * 2 }
    val array2 = IntArray(50) { index -> index * 5 }

    val time1 = measureNanoTime {
        val resultArray1 = mergeArrays1(array1, array2)
        println(resultArray1.contentToString())
    }

    val time2 = measureNanoTime {
        val resultArray2 = mergeArrays2(array1, array2)
        println(resultArray2.contentToString())
    }


    println("Time taken in first approach $time1") //1026500
    println("Time taken in second approach $time2") //59208

}

//O(n Log(n)) Solution
fun mergeArrays1(inputArray1: IntArray, inputArray2: IntArray): IntArray {
    //handle if both are empty
    if (inputArray1.isEmpty() and inputArray2.isEmpty()) {
        return IntArray(0)
    }

    //if first is empty
    if (inputArray1.isEmpty()) {
        return inputArray2
    }

    // if second is empty
    if (inputArray2.isEmpty()) {
        return inputArray1
    }
    val sizeOfResultArray = inputArray1.size + inputArray2.size
    val resultArray = IntArray(sizeOfResultArray)

    var indexCount = 0

    //O(n)
    for (i in inputArray1.indices) {
        resultArray[indexCount] = inputArray1[i]
        indexCount++
    }

    //O(n)
    for (i in inputArray2.indices) {
        resultArray[indexCount] = inputArray2[i]
        indexCount++
    }

    //O(n Log(n))
    resultArray.sort()

    return resultArray
}

/*
O(n) Solution
*/
fun mergeArrays2(inputArray1: IntArray, inputArray2: IntArray): IntArray {
    //handle if both are empty
    if (inputArray1.isEmpty() and inputArray2.isEmpty()) {
        return IntArray(0)
    }

    //if first is empty
    if (inputArray1.isEmpty()) {
        return inputArray2
    }

    // if second is empty
    if (inputArray2.isEmpty()) {
        return inputArray1
    }

    //Index to compare for individual arrays
    var comparingIndexOne = 0
    var comparingIndexTwo = 0

    //creating result array
    val resultArraySize = inputArray1.size + inputArray2.size
    val resultArr = IntArray(resultArraySize)

    //[0,2,4] [1,3,5]  count1 =2    count2=2   [0,1,2,3,4,]
    //Start the loop to fill the array
    for (i in 0 until resultArraySize) {
        //check if input array one's item is lesser than second's item
        if (inputArray1.size > comparingIndexOne &&
            inputArray1[comparingIndexOne] < inputArray2[comparingIndexTwo]
        ) {
            resultArr[i] = inputArray1[comparingIndexOne]
            comparingIndexOne++
        } else {
            resultArr[i] = inputArray2[comparingIndexTwo]
            comparingIndexTwo++
        }
    }

    return resultArr

}