class code2{
    public static void main(String[] args){
        int num1 = 5;
        double num2 = num1; // implicit type conversion
        System.out.println(num2); // output is 5.0

        // implicit conversion is not possible in below case
        // double example2 = 5.8;
        // int int_num = example2;
        // System.out.println(int_num);

        // explicit conversion
        double example2 = 5.8;
        int int_num = (int)example2;
        System.out.println(int_num);

    }
}
