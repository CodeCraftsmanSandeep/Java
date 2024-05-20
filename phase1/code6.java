class code6{
    public static void main(String args[]){
        String name = "Sandeep";
        // formatting string
        String str = String.format("My name is %s.", name); 
        // %s - string
        // %d - integer
        // %f - float
        // %b - boolean
        // %c - char
        System.out.println(str);

        // finding lenght
        System.out.println("length of my name = " + name.length());

        // checking emptiness of a string
        System.out.println(name.isEmpty());

        // changing case
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        String obj1 = new String("abc");
        String obj2 = new String("abc");
        String obj3= new String("aBc");
        System.out.println(obj1 == obj2);
        // equals method
        System.out.println(obj1.equals(obj2));

        // quality check ignoring case
        System.out.println(obj1.equalsIgnoreCase(obj3));

        // replacing all matched sub-strings
        String example = "The sky is red.red";
        example = example.replace("red", "blue");
        System.out.println(example);

        // substring check
        System.out.println(example.contains("sky"));
    }
}