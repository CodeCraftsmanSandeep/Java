import java.util.Scanner; // for using scanner class
class code1{
    public static void main(String args[]){
        // taking input from user
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Which subject do you like the most? ");
        String fav_subject = scanner.nextLine();

        System.out.printf("Sandeep's favourite subject is %s\n\n",  fav_subject);
        System.out.print("How much do you like out of 10? ");
        int love = scanner.nextInt();
        System.out.printf("Love percentage towards %s is %f%%\n\n", fav_subject, love*1.0/10*100);
        scanner.nextLine(); // cleans up the input buffer (important line), because there is <enter> in input 
        // try commenting the above line !! :)

        System.out.print("Where do you stay? ");
        String place = scanner.nextLine();
        System.out.printf("%s lives in %s\n", "sandeep", place);

        // another ways (no need of cleaning buffers)
        // int age = Integer.parseInt(scanner.nextLine());
        // double gpa = Double.parseDouble(scanner.nextLine());

        scanner.close();

    }
}