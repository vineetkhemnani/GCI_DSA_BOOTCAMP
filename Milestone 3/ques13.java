import java.util.Scanner;

public class ques13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a no");
        int n = scn.nextInt();
        int num = n;
        int c = 0;
        while(n!=0){
            n=n/10;
            c++;
        } 
        // System.out.println("No.of digits is: " +c);
        int lastDigit = num%10;
        int firstDigit = num/(int)Math.pow(10, --c);
        System.out.println("Before swapping");
        System.out.println("First digit was: "+firstDigit);
        System.out.println("Last digit was: "+lastDigit);
        int temp = firstDigit;
        firstDigit=lastDigit;
        lastDigit=temp;
        System.out.println("After swapping");
        System.out.println("First digit was: "+firstDigit);
        System.out.println("Last digit was: "+lastDigit);
    }
    
}
