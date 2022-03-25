import java.util.Scanner;

public class ques15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a no");
        int n = scn.nextInt();
        int num = n;
        int c = 0,r=0,p=1;
        while(n!=0){
            r=n%10;
            n=n/10;
            p= p*r;
            c++;
        } 
        System.out.println("Product of digits is : "+p);
    }
}
