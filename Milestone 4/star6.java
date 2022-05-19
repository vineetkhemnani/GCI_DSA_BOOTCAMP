import java.util.Scanner;

public class star6{
    public static void star(int n){
        int r,c,k;
        for(r = 1; r <= n; r++){
            k=1;
            for(c = 1; c <= n+4;c++)
            if(c >= 6-r && c <= 4+r && k==1){
                System.out.print("*");
                k=0;
            }else{
                System.out.print(" ");
            k=1;
            }
            System.out.println();
        }
           
     } 
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        star(n);
    }
}