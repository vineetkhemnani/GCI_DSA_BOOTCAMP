import java.util.Scanner;
public class question_7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = scn.nextInt();
        int b = (a > 0? a : -a);
        System.out.println(b);
    }
    
}
