import java.util.Scanner;

public class question_8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
    
        System.out.println("Enter no. of classes held");
        int cheld = scn.nextInt();
        System.out.println("Enter no. of classes taken");
        int ctaken = scn.nextInt();
        double percent = (ctaken * 100) / cheld;
        System.out.println("Attendance is " + percent);
        if(percent >= 75){
            System.out.println("Allowed to attend exams");
        }else{
            System.out.println("Not allowed for exams");
        }
    }
    
}
