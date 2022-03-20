import java.util.Scanner;

public class question_9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Do you have a medical cause to skip exams?");
        System.out.println("Enter Y for YES or N for NO ");
        char c = scn.next().charAt(0);
        if(c == 'Y' || c == 'y'){
            System.out.println("Eligible for skipping exams through medical leave");
        }else{
            System.out.println("Not eligible for medical leave");
        }

    }
    
}
