import java.util.Scanner;


public class calculator {

    public static void main(String[] args){

        double num1, num2;
        String operation;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        num1 = input.nextInt();


        System.out.print("Enter second number: ");
        num2 = input.nextInt();

        input.nextLine();

        System.out.print("Enter operation: ");
        operation = input.nextLine();



        switch (operation) {
            case "+": System.out.printf("%.1f + %.1f : %.2f\n",num1, num2, num1 + num2 );    
                break;

            case "-": System.out.printf("%.1f - %.1f : %.2f\n",num1, num2, num1 - num2 );    
                break;

            case "*": System.out.printf("%.1f * %.1f : %.2f\n",num1, num2, num1 * num2 );    
                break;

            case "/": if (num2 == 0) {System.out.printf("Cannot perform zero division\n");} else {System.out.printf("%.1f / %.1f : %.2f\n",num1, num2, num1 / num2 );} 
                break;
            
            case "%": System.out.printf("%.1f %% %.1f : %.1f\n",num1, num2, num1 % num2 );    
                break;

            default:
                      System.out.println("Invalid operation");
                break;
        }
        input.close();
    }
}
