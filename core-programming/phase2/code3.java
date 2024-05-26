import java.util.Arrays;
public class code3{
    public static void main(String args[]){
        // arrays in java
        char alphabets[] = new char[26];
        for(int i = 0; i < 26; i++){
            alphabets[i] = (char)(i + 'a');
        }

        for(int i = 0; i < 26; i++) System.out.printf("%c ", alphabets[i]);
        System.out.println();
        System.out.println(Arrays.toString(alphabets));

        // another way of initializing
        char vowels[] = {'i', 'e', 'a', 'u', 'o'};
        System.out.printf("Number of vowels = %d\n", vowels.length);

        // sort() method in arrays
        Arrays.sort(vowels);
        System.out.println(Arrays.toString(vowels));

        // sorting in some range of a array
        int[] arr = {10, 2, 1, 4, 1, 5, 1};
        Arrays.sort(arr, 1, 4); // sorting [1, 4)
        System.out.println(Arrays.toString(arr));

        // binary search 
        int index1 = Arrays.binarySearch(vowels, 'e');
        int index2 = Arrays.binarySearch(vowels, 'b');
        System.out.printf("index1 = %d, index2 = %d\n", index1, index2);
        
        // binary search in a range
        System.out.printf("index3 = %d, index4 = %d\n", Arrays.binarySearch(vowels, 1, 4, 'i'), Arrays.binarySearch(vowels, 1, 4, 'u'));
    }
}
