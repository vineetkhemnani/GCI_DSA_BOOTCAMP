import java.util.Scanner;

public class question_5{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter marks");
        int marks = scn.nextInt();
        char c=' ';
        if(marks < 25)
        {
            c = 'F';
        }else if(marks >= 25 && marks < 45){
            c = 'E';
        }else if(marks >= 45 && marks < 50){
            c = 'D';
        }else if(marks >= 50 && marks < 60){
            c = 'C';
        }else if(marks >= 60 && marks < 80){
            c = 'B';
        }else if(marks >= 80){
            c = 'A';
        }
        System.out.println(c);
    }
}