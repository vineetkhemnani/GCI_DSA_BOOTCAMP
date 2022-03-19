import java.util.Scanner;

public class squareOrNot {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter length");
        int l = scn.nextInt();   //length of a rectangle
        System.out.println("Enter Breadth");
        int b = scn.nextInt();    //breadth of a rectangle
        if(l == b){
            System.out.println("It is a Square");
        }else{
            System.out.println("It is a Rectangle");
        }
    }
    
}
