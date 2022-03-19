import java.util.Scanner;

public class question_4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Salary");
        double salary = scn.nextDouble();
        System.out.println("Enter years of service");
        int years = scn.nextInt();
        if(years >= 5){
            System.out.println("You get a bonus");
            double bonus = 0.05 * salary;
            System.out.println("Bonus is " + bonus);
            System.out.println("Total Salary is " + (salary+bonus));
        }else{
            System.out.println("You dont get a bonus yet");
            System.out.println("Salary is " + salary);
        }
    }
    
}
