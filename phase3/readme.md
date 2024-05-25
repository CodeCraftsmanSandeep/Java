# Java Learning Journey: Phase 3 📈

## Dynamic arrays
* Dyanmic arrays are arrays that can change their size compared to statuc arrays. (Internally dynamic arrays are implemeneted using static arrays but by smartly allocating the space everytime there is a need to resize the memeory allocated. Generally if n is the size, we allocate 2*n more size) see [MIT lecture](https://www.youtube.com/watch?v=CHhwJjR0mZA&list=PLUl4u3cNGP63EdVPNLG3ToM6LaEUuStEY&index=2) to know about this.
* Integer vs int <br/>
  | Featrue | int | Integer |
  |---------|-----|---------|
  |Type	    |Primitive Data Type	| Wrapper Class|
  |Memory Efficiency	| More efficient (stores raw integer value)	| Less efficient (some overhead for object  structure) |
  |Functionalities	| Limited (no methods)	| Provides methods for conversion, comparison, etc.|
  | Usage	| Simple integer storage	| Object-oriented features, conversions, etc. |

## Learnings from [code1](code1.java)
- Learning ArrayList in java.util.ArrayList
- ```ArrayList <Integer> arr = new ArrayList <Integer> ();```
- Methods learned in ArrayList in [code1](code1.java)
  - ```.add(x)``` Adding element x at end of the ArrayList
  - ```.get(i) ```Accessing element at index i from the ArrayList
  - ```.remove(i) ```Removing element at index i from the ArrayList
  - ```.remove(Integer.valueOf(x)) ```Removes first occurence of element x in ArrayList if exists
  - ```.clear()``` removes all elements in ArrayList
  - ```.set(i, Integer.valusOf(x))```  sets element at ith index equal to x
  - Sorting (make sure to import java.util.Comparator)
    - ```.sort(Comparator.naturalOrder()) ``` sorts elements of the ArrayList in ascending order
    - ``` .sort(Comparator.reverseOrder()) ``` sorts elements of the ArrayList in descending order