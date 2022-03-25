import java.util.Scanner;

public class ques10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a no");
        int n = scn.nextInt();
        int c = 0;
        while(n!=0){
            n=n/10;
            c++;
        } 
        System.out.println("No.of digits is: " +c);
    }
}
