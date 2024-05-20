public class code5 {
    public static void main(String args[]){
        String literalString1 = "abc";
        String literalString2 = "abc";

        String objectString1 = new String("xyz");
        String objectString2 = new String("xyz");

        System.out.println(literalString1 == literalString2);   // output : true
        // JVM used "abc" which was there in the pool when declaring literalString2

        System.out.println(objectString1 == objectString2);     // output : false
        // not reusing the same value from the pool
    }
}
