public class code5 {
    public static void main(String args[]){
        // loops

        // for loop
        // initilization, condition, loop-body, update
        System.out.println("For loop");
        for(int i = 1; i <= 10; i += 2){
            System.out.printf("%d ", i);
        }

        System.out.println();
        System.out.println();

        // while loop
        System.out.println("While loop");
        int even_num = 0;
        while(even_num <= 15){
            System.out.printf("%d ", even_num);
            even_num += 2;
        }
        System.out.println();
        System.out.println();

        // do while loop
        System.out.println("Do-while loop");
        int num = 0;
        do{
            System.out.print(Integer.toString(num++) + " ");
        }while(num > 0 && num < 10);
        System.out.println();

        System.out.println("---------------");
        System.out.println("Iterating through elements:");
        // iterating thorugh the elements in an array without index (like we do in c++)
        int[] arr = {1, 2,-1, 1, 10};
        for(int ele: arr){
            System.out.print(Integer.toString(ele) + " ");
        }
        System.out.println();

    }
}
