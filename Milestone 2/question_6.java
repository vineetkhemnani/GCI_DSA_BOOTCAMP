import java.util.Scanner;

public class question_6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter age of 3 people");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int temp = a > b? a : b;
        int max = temp > c ? temp:c;
        int temp2 = a < b? a : b;
        int min = temp2 < c ? temp:c;
        System.out.println("Oldest is " + max);
        System.out.println("Youngest is " + min);
    }
    
}
