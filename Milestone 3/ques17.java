import java.util.Scanner;
public class ques17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a no");
        int n = scn.nextInt();
        int num = n;
        int c = 0,r=0,s=0;
        while(n!=0){
            r=n%10;
            n=n/10;
            c++;
            s=s*10+r;
        } 
        if(s==num){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
