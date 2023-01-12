import java.util.Scanner;
public class star {
    public static void main(String[] args) {

        int step;
        Scanner input = new Scanner(System.in);

        System.out.print("How many digit stars do you want? : ");
        step = input.nextInt();

        for (int digit = 1; digit <= step; digit++ ){
            for (int empty = 1; empty <= (step-digit); empty++){
                System.out.print(" ");
            }
            for (int star =1 ; star <= (2*digit)-1 ; star++ ){
                System.out.print("*");
            }
            System.out.println(" ");

        }

    }
}
