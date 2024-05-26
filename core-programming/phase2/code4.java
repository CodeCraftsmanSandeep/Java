import java.util.Arrays;
public class code4 {
    public static void main(String args[]){
        int arr[] = {1, 2, 3, -1, 2};

        // fill methiod 
        int startingIndex = 1;
        int endingIndex = 4;

        Arrays.fill(arr, -100);
        System.out.println(Arrays.toString(arr));

        Arrays.fill(arr, startingIndex, endingIndex, 100);
        System.out.println(Arrays.toString(arr));
        System.out.println();

        // copying arrays
        int[] numbers = {1, 2, -10, 11, 9};
        int[] copyOfNumbers = numbers;      // copyOfNumbers refereces to the same location which numbers refer to
        int[] actualCopy = Arrays.copyOf(numbers, numbers.length);
        int[] example1 = Arrays.copyOf(numbers, 2);
        int[] example2 = Arrays.copyOf(numbers, 10);

        copyOfNumbers[4] = 100;
        numbers[0] = 100;
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(copyOfNumbers));
        System.out.println(Arrays.toString(actualCopy));
        System.out.println(Arrays.toString(example1));
        System.out.println(Arrays.toString(example2));

        int[] example3 = Arrays.copyOfRange(actualCopy, 1, 4);
        System.out.println(Arrays.toString(example3));
        int[] example4 = Arrays.copyOfRange(actualCopy, 2, 10); // filling the remaining entries with zeros
        System.out.println(Arrays.toString(example4));

        // Equality check of arrays
        int arr1[] = {1, 2, 3, 4};
        int arr2[] = arr1;
        System.out.println(arr1 == arr2); // The == operator checks for reference equality. In this case, both arr1 and arr2 refer to the same underlying array object in memory. They both point to the same location where the array elements are stored.

        int arr3[] = Arrays.copyOf(arr1, arr1.length);
        System.out.println(arr1 == arr3);
        System.out.println(Arrays.equals(arr1, arr3));
        
    }
}
