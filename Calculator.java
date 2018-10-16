import java.util.Scanner;
public class Calculator {

    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        //block where user enters operands//
        System.out.print("Enter first operand: ");
        double firstOperand = input.nextDouble();
        System.out.print("Enter second operand: ");
        double secondOperand = input.nextDouble();
        //end of user entering operands//

        //start of selection menu//
        System.out.println();
        System.out.println("Calculator Menu");
        System.out.println("---------------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println();

        System.out.print("Which operation do you want to perform? ");

        int function = input.nextInt();
        //end of selection menu//

        double answer;
        switch(function) {
            case 1://case for addition
                answer = firstOperand + secondOperand;
                System.out.println();
                System.out.println("The result of the operation is " + answer + ". Goodbye!");
                break;
            case 2://case for subtraction
                answer = firstOperand - secondOperand;
                System.out.println();
                System.out.println("The result of the operation is " + answer + ". Goodbye!");
                break;
            case 3://case for multiplication
                answer = firstOperand * secondOperand;
                System.out.println();
                System.out.println("The result of the operation is " + answer + ". Goodbye!");
                break;
            case 4://case for division
                answer = firstOperand / secondOperand;
                System.out.println();
                System.out.println("The result of the operation is " + answer + ". Goodbye!");
                break;
            default:// case for invalid input
                System.out.println();
                System.out.println("Error: Invalid selection! Terminating program.");
                break;
        }
    }
}
