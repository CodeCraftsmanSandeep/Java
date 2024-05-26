package phase3;
import java.util.ArrayList;
import java.util.Comparator;
public class code2{
    public static void main(String args[]){
        ArrayList <Integer> numbers = new ArrayList <Integer> ();

        numbers.add(5);
        numbers.add(10);
        numbers.add(11);
        numbers.add(11);

        // getting size of the array
        System.out.printf("size of array = %d\n", numbers.size());
        
        // checking whether a number is there or not
        System.out.println(numbers.contains(Integer.valueOf(10)));
        System.out.println(numbers.contains(Integer.valueOf(20)));

        // checking whether array is empty or not
        System.out.println(numbers.isEmpty());

        // looping accross elements of array
        numbers.forEach(number ->{
            System.out.println(number * 2);
        });
        System.out.println(numbers.toString());

        // over writing elements in an array
        numbers.forEach(number ->{
            numbers.set(numbers.indexOf(number), number * 2);
        });
        System.out.println(numbers.toString());
    }
}
