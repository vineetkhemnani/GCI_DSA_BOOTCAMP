import java.util.Scanner;

public class question_11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter an alphabet");
        char c = scn.next().charAt(0);
        if(c >= 'a' && c <= 'z'){
            System.out.println("Lowercase");
        }else
            if(c >= 'A' && c <= 'Z'){
                System.out.println("Uppercase");
            }
        else{
            System.out.println("Not an alphabet");
        }
    }
    
}
