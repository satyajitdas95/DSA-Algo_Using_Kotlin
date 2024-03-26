package problems.strings

/*
Reverse a given
Example - "Hi I am Satyajit"
will return - "tijaytaS ma I iH"
*/

fun main() {
    val inputString = "Hi i am Satyjit"
    val reversedString = reverseString(inputString = inputString)
    val reversedString2 = reverseString2(inputString = inputString)
    println(reversedString)
    println(reversedString2)
}

fun reverseString(inputString: String): String {
    //check for size
    if (inputString.length < 2) {
        return inputString
    }

    //Convert string to an array of Characters
    val arrOfChar = inputString.toCharArray()

    //loop through the array
    //from end to mid of the array
    val charCount = arrOfChar.size
    for (i in 0..charCount / 2) {
        //swap the char
        //Store corresponding  last item index
        val lastSwapIndex = charCount - i - 1
        val tempChar = arrOfChar[lastSwapIndex]

        //Replace it with the item from start
        arrOfChar[lastSwapIndex] = arrOfChar[i]

        //replace the starting item
        arrOfChar[i] = tempChar
    }

    return arrOfChar.concatToString()

}
fun reverseString2(inputString: String):String{
    //check for size
    if (inputString.length < 2) {
        return inputString
    }
    val arr = inputString.toCharArray()

    val lastItemIndex = arr.size - 1

    for(itemIndex in 0..lastItemIndex){
        arr[itemIndex] = inputString[lastItemIndex-itemIndex]
    }

    return arr.concatToString()
}