import java.util.Scanner;

public class employee {
    private static String x;
    public String firstame;
    public String lastname;
    public int yearBirth;
    public String nextkin;
    public String address;  
    public int retirementAge = 65;
    public int grosspay = 100000;
    


    public employee(String firstName , String lastName , int yearBirth , String nextKin , String address){
        this.firstame = firstName;
        this.lastname = lastName;
        this.yearBirth = yearBirth;
        this.nextkin = nextKin;
        this.address = address;


    }
    //start calculating deductions
    public double getTaxDeductions(){
        double taxDeductions = 0.125 * grosspay;
        return taxDeductions;
    }
    public double getpensionContribution(){
        double pensionContribution = 0.075 * grosspay;
        return pensionContribution;
    }
    public double gethealthInsurance(){
        double healthInsurance = 0.005 * grosspay;
        return healthInsurance;
    }

    public double gethousingContribution(){
        double housingContribution = 0.005 * grosspay;
        return housingContribution;
    }

    public int getRetirementYear(){
        int retirementYear = yearBirth + retirementAge;
        return retirementYear;
    }
    public double calculateNetPay(){
        double netPay = grosspay - (getTaxDeductions() + gethealthInsurance() + getpensionContribution() + gethousingContribution());
        return netPay;
    }


    public void displayBiodata(){
        System.out.println("Employee first name : " + firstame);
        System.out.println("Employee last name : " + lastname);
        System.out.println("Employee Year of Birth : " + yearBirth);
        System.out.println("Employee Next of kin : " + nextkin);
        System.out.println("Employee Recidential Address : " +  address);
        System.out.println();
        System.out.println("Tax paid : " + getTaxDeductions());
        System.out.println("pension Contribution : " + getpensionContribution());
        System.out.println("Health Insurance : "  + gethealthInsurance());
        System.out.println("Housing Contribution : " + gethousingContribution());
        System.out.println();
        System.out.println("Employee Netpay : " + calculateNetPay());

    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Fill in your biodata :");
        System.out.println("Fill name :");
        String fname = sc.next();
        System.out.println(" last name : ");
        String lname = sc.next();
        System.out.println("year of birth : ");
        int yob = sc.nextInt();
        System.out.println(" Next of kin :");
        String nextKin = sc.next();
        System.out.println("residencial address : ");
        String address = sc.next();
        sc.close();
        System.out.println();

        employee Employee = new employee(fname,lname,yob,nextKin,address);
        Employee.displayBiodata();
    }
}
