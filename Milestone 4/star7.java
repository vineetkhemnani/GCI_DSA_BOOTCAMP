import java.util.Scanner;

public class star7{
    public static void star(int n){
        int r,c,k;
        for(r = 1; r <= n; r++){
            
            for(c = 1; c <= n+4;c++)
            if(c <= n-r+1 || c >= n+r-1){
                System.out.print("*");
                
            }else{
                System.out.print(" ");
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