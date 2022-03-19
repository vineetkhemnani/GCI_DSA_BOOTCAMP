import java.util.Scanner;

public class question_3{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int unit = 100;
        double cost=0.0;
        System.out.println("Enter quantity of items");
        int quantity = scn.nextInt();
        cost = unit * quantity;
        if(quantity>=1000){
            cost = cost - 0.1 * cost;
            System.out.println("You get a 10% discount");
        }
        System.out.println("Cost is " + cost);
    }

}