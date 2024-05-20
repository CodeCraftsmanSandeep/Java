import java.util.Scanner;
class code2{
    public static void main(String args[]){
        // building calculator
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double operand1 = scanner.nextDouble();
        scanner.nextLine(); // cleaning buffer

        System.out.print("Enter the second number: ");
        double operand2 = scanner.nextDouble();
        scanner.nextLine(); // cleaning buffer

        System.out.print("Enter the operator: ");
        char operator = scanner.next().charAt(0);

        double output;
        switch(operator){
            case '+':
                output = operand1 + operand2;
                System.out.printf("%f + %f = %f\n", operand1, operand2, output);
                break;

            case '-':
                output = operand1 - operand2;
                System.out.printf("%f - %f = %f\n", operand1, operand2, output);
                break;

            case '*':
                output = operand1 * operand2;
                System.out.printf("%f * %f = %f\n", operand1, operand2, output);
                break;

            case '/':
                output = operand1 / operand2;
                System.out.printf("%f / %f = %f\n", operand1, operand2, output);
                break;

            case '%':
                output = operand1 % operand2;
                System.out.printf("%f % %f = %f\n", operand1, operand2, output);
                break;

            default:
                System.out.println("Invalid operator\n");
        }
    }
}