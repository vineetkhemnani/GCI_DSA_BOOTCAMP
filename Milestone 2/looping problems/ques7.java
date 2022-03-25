import java.util.Scanner;

public class ques7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scn.nextInt();
        int s = 0;
        for(int i = 1; i <= n; i++){
            if(i%2==0){
            s = s+i;
        }
    }
        System.out.println(s);
    }
}
