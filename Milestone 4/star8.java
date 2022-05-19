import java.util.Scanner;

public class star8 {
    public static void star(int n){
        int nsp=n-1, nst = 1,c=0;
        for(int i= 1; i <= n; i++){
            c=1;
            for(int csp = 1;csp <= nsp; csp++)
            System.out.print("\t");
            for(int cst = 1; cst <= nst; cst++)
            if(cst < n/2+1){
                c++;
                System.out.print(c + "\t");
            }else{
                c--;
                System.out.print(c + "\t");
            }
            
            nsp--;
            nst+=2;
            System.out.println();
        } 
        
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        star(n);

    }
}
