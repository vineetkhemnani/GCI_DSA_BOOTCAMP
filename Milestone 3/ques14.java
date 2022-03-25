import java.util.Scanner;

public class ques14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a no");
        int n = scn.nextInt();
        int num = n;
        int c = 0,r=0,sum=0;
        while(n!=0){
            r=n%10;
            n=n/10;
            sum= sum+r;
            c++;
        } 
        System.out.println("Sum of digits is:"+sum);
    }
    
}
