import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int L = 5, b = 4, K = 7, e = 5, h = 2;
        // double answer = ((2 * (L + b)) / Math.pow(K, 2)) + Math.pow(e, -h);
        // System.out.println("Answer = " + answer);
        // int numAdd = 0;
        // int num;
        // int count = 1, iteration = 0;
        // System.out.print("Enter the first number: ");
        // num = scanner.nextInt();
        // while (num <= 0){
        //     numAdd += num;
        //     count++;
        //     iteration++;
        //     System.out.println("iteration: " + iteration);
        //     System.out.println("Count: " + count);
        //     System.out.println("numAdd: " + numAdd);
        //     System.out.print("Next Number: ");
        //     num = scanner.nextInt();
        // }
        // scanner.close();
        int borrow = 3000, month = 0;
        
        double interest = 1.5 / 100;
        int amount_left = 3000;
        double totaldebt = amount_left + ( (1.5 / 100) * amount_left) - 250;
        while (amount_left > 0){
            month++;
            amount_left -= (250 - (interest * borrow));
            if ( amount_left < 250){
                System.out.println("Month " + month);
                System.out.println("Pay: " + amount_left);
                break;
            }
            System.out.println("Month " + month);
            System.out.println("Amount left to pay: " + amount_left);

        }


    }


    public static void shapecalc(double L, double B ){
        double per = 2 * (L + B);
        double area = L * B;
        System.out.printf("Perimeter = %.2f \n", per);
        System.out.printf("Area = %.2f \n",  area);

            
    }

    public static void switchfunc(int number){
        switch(number){
            case 1: System.out.println("You will die tomorrow");
            break;
            case 2: System.out.println("You will live long");
            break;
            case 3: System.out.println("You will die single");
            break;
            case 4: System.out.println("You'll die");
            break;
            case 5: System.out.println("You will not eat tomorrow ");
            break;
        }

            
    }




    
}