# Phase 2 learning

## Learnings from [code1](code1.java)
* Taking input from the user.
  * importing java.util.Scanner module
  * creating Scanner object
  * nextLine() method 
  * Using print() method instead of println()
  * Do not forget to close the Scanner object :)
  * Using printf() (same as in c++)
  * nextInt() to get integer input
  * nextDouble(), nextFloat()
  * After using nextInt, you can call nextLine once to consume the remaining newline character from the buffer. This ensures the next nextLine call reads the user's complete line input.
  * Output: <br/> ![output1](output1.png)

## Learnings from [code2](code2.java)

* [code2](code2.java) contains code of a simple calculator
* Be careful of the phenomenon of **fall-through** when there is no ```break``` in case block

## Learnings from [code3](code3.java)

* Arrays in java.
* Do not forget to access elements in array using indexing without making sure that index is within bounds.
* length is not a method as in string, it is a property for arrays.
* sort() method in java.util.Arrays package. We can also perform sorting in particular range in an array.
* Arrays.binarySearch()
  * returns
    * index                             (if the key is found)
    * -(insertion_point) -1             (if the key is not found) where insertion_point is the index at which the key would need to be inserted to maintain the sorted order

## Learnings from [code4](code4.java)

* In order to not over populate learnings from a code, I have created this new section in continuation to the [previous section](#Learnings-from-code3)
* 