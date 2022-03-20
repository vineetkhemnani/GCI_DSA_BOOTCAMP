import java.util.Scanner;

public class question_10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = 2, y = 5, z = 0;
        boolean b;
        if(x == 2){
            b = true;
        }
        else{
            b = false;
        }
        System.out.println(b); //displays true
        if(x != 5){
            b = true;
        }else{
            b = false;
        }
        System.out.println(b); //displays true
        if(x != 5 && y >= 5){
            b = true;
        }else{
            b = false;
        }
        System.out.println(b); //displays true
        if(z != 0 || x == 2){
            b = true;
        }else{
            b = false;
        }
        System.out.println(b); //displays true due to second condition
        if(!(y < 10)){
            b = true;
        }else{
            b = false;
        }
        System.out.println(b); //displays false
    }
    
}
