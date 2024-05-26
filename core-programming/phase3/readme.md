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
- Example of creating an ArrayList in java ```ArrayList <Integer> arr = new ArrayList <Integer> ();```
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

## Learnings from [code2](code2.java)
- Methods learned in ArrayList in [code2](code2.java)
  - ``` .contains(Integer.valueOf(x)) ``` returns __true__ if x is present in the ArrayList, else returns __false__
  - ``` .isEmpty() ``` returns __true__ if the ArrayList is empty, else returns __false__
  - looping through the elements in the ArrayList <br/> ``` arr.forEach(ele ->{
  //  can access element using ele
  }); ```

## Learnings from [code3](code3.java)

* [code3](code3.java) talks about hash maps in java. Make sure to ``` import java.util.HashMap ``` before using ```HashMap```
* Example of creating HashMap ```HashMap <String, Integer> score = new HashMap <String, Integer> (); ```
* Methods of ```HashMap``` learned in [code3](code3.java)
  * ```.put(key, value)``` inserts pair {key, value} into the HashMap if key is not already present in the HashMap, else rewrites the existing value in the HashMap. (Note: there is no error!! if key is already present)
  * ```.toString()```, ```.clear()```, ```.isEmpty()``` and ```.size()``` works for HashMap similar to ArrayList
  * ``` .get(x) ``` retuns value if x is one of the keys in HashMap, else returns false
  * ``` .putIfAbsent(key, value) ``` inserts the {key, value} pair into the HashMap if the key is not already present in HashMap. Useful method!!
  * ``` .replace(key, value) ``` replaces the existsing value of the key in the HashMap if key is present in the HashMap, else ignores!!
  * ```.getOrDefault(key, x)``` returns the value of the key in HashMap if the key is present in the HashMap, else returns x
  * ``` .remove(key) ``` removes the item correspoding to the key in the HashMap if exists, else ignores!!
  * ``` .containsValue(x) ``` returns true if x is a value in one of the items in the HashMap
  * Looping through the HashMap<br/> example code: <br/> ```.forEach((key, value) -> { // can access key value pair }); ```