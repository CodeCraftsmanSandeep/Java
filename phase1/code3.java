// moto:
//      How does mod operator behaves when operands are negative?
public class code3 {
    public static void main(String args[]){
        int a = 12;
        int b = 5;
        System.out.println(a%b);

        a = 12;
        b = -5;
        System.out.println(a%b);

        a = -12;
        b = 5;
        System.out.println(a%b);

        a = -12;
        b = -5;
        System.out.println(a%b);

        // a%b in java = a - (a/b)*b
    }
}
