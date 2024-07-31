import java.util.Scanner;
import java.time.LocalDate;

class Person {
    Scanner input = new Scanner(System.in);

    String Fname, Lname, NOK, Address ;
    int retirementAge = 65, grossPay = 100000, YOB;
    double monthlySalary;


    void GetInfo(){
        System.out.print("Enter First name: ");
        Fname = input.nextLine();

        System.out.print("Enter Last name: ");
        Lname = input.nextLine();
        
        System.out.print("Enter Date of birth (YYYY): ");
        YOB = input.nextInt();

        input.nextLine();

        System.out.print("Enter Next Of Kin: ");
        NOK = input.nextLine();

        System.out.print("Enter Address: ");
        Address = input.nextLine();

    }

    void CalcMonthlyPay(){

        double tax = (12.5 / 100) * grossPay;
        double pension = (7.5 / 100) * grossPay;
        double health = (5 / 100) * grossPay;
        double housing = (5 / 100) * grossPay;

        monthlySalary = grossPay - tax - pension - health - housing;

        System.out.printf("Monthly Salary for %s is: %.2f \n",Fname, monthlySalary);

    }

    void YearOfRetirement(){

        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();

        int age = currentYear - YOB;

        int ageOfRetirement = retirementAge - age;

        System.out.printf("Years allowed to work: %s Year(s) - [%d to %d]", ageOfRetirement, currentYear, currentYear + ageOfRetirement );


    }

}
public class Main {
    public static void main(String[] args) {

        Person Allen = new Person();

        Allen.GetInfo();

        Allen.CalcMonthlyPay();

        Allen.YearOfRetirement();
        
    }


}

