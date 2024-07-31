import java.util.Scanner;


public class combinational {


    public static int Factorial(int number){
        if (number == 0) {
            return 1;
        }
        
        // Base case: 1! = 1
        if (number == 1) {
            return 1;
        }

        return number * Factorial(number - 1);


    }



    public static void main(String[] args){
       int N, R;

        Scanner input = new Scanner(System.in);

        System.out.print("Emter Value of N: ");
        N = input.nextInt();

        System.out.print("Emter Value of R: ");
        R = input.nextInt();

        int sub = N - R;
        if (sub < 0 ){
            System.out.println("Invalid value for R");
            return;
        }

        int numerator = Factorial(N);


        int denominator = Factorial(sub) * Factorial(R);

        double answer = numerator / denominator;

        System.out.println("Answer: " + answer);


        input.close();

    
    } 
    
}
