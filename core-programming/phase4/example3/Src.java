import java.util.Scanner;
public class Src{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your birthDate(year-month-date): ");
        String birthDate = scanner.nextLine();
        User user1 = new User(name, birthDate);
        System.out.println(user1.toString());
        System.out.println();

        AudioBook book1 = new AudioBook ("The Rosie Project", "Graeme Simsion", 570);
        Ebook book2 = new Ebook ("Data structures", "sanjay das gupta", 200, "pdf");
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        scanner.close();
    }
}