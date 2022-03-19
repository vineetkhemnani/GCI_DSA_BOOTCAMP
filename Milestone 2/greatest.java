import java.util.Scanner;

public class greatest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter 1st no");
        int a = scn.nextInt();
        System.out.println("Enter 2nd no");
        int b = scn.nextInt();
        int max = a > b ? a : b;
        System.out.println(max + " is greater");
    }
    
}
