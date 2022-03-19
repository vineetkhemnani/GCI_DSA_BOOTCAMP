import java.util.Scanner;

public class question_6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int temp = a > b? a : b;
        int max = temp > c ? temp:c;
        System.out.println("Greatest is " + max);
    }
    
}
