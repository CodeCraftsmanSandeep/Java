package phase3;
import java.util.ArrayList;
import java.util.Comparator;
public class code1 {
    public static void main(String args[]){
        ArrayList <Integer> numbers = new ArrayList<Integer>();
        numbers.add(10); // index : 0
        numbers.add(100);  // index : 1
        numbers.add(0);  // index : 2
        numbers.add(20); // index : 3
        numbers.add(100); // index : 4

        System.out.println(numbers.toString());
        System.out.println();

        System.out.println("Removing element by index");
        System.out.println(numbers.get(3));

        System.out.println();
        System.out.println("Removing element by index");
        numbers.remove(2); // removing element at 2nd index
        System.out.println(numbers);

        System.out.println();
        System.out.println("Removing element by value");
        numbers.remove(Integer.valueOf(100)); // removing element 100
        System.out.println(numbers);

        System.out.println();
        System.out.println("After using .clear() method:");
        numbers.clear(); // removing all elements in arraylist
        System.out.println(numbers);

        // updating array list
        ArrayList <Double> arr = new ArrayList <Double> ();
        arr.add(10000.0);
        arr.add(100.23);
        arr.add(1.23);
        arr.add(10.213);

        System.out.println();
        System.out.println(arr);
        
        System.out.println();
        System.out.println("After updating the value:");
        arr.set(1, Double.valueOf(29.01));
        System.out.println(arr);

        System.out.println();
        // sorting ArrayList
        System.out.println("After sorting in ascending order:");
        arr.sort(Comparator.naturalOrder());
        System.out.println(arr);

        System.out.println();
        System.out.println("After sorting in descending order:");
        arr.sort(Comparator.reverseOrder());
        System.out.println(arr);

        
    }
}
