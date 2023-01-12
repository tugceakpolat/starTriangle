import java.util.Scanner;
public class elmas {
    public static void main(String[] args) {

        int step;

        Scanner input= new Scanner(System.in);

        System.out.print("How many digit diamond do you want? :  ");
        step = input.nextInt();

        for(int start = 1; start <= step; start++){
                for( int empty=1; empty <= (step-start); empty++){
                 System.out.print(" ");
            }
                for (int star =1; star <= (2*start)-1; star++ ){
                    System.out.print("*");
                }
            System.out.println(" ");
        }
        for(int reduction = step-1; reduction >= 1; reduction--){
            for (int empty=1; empty <= (step-reduction); empty++){
                System.out.print(" ");
            }
            for(int star=1; star <= (2*reduction)-1; star++){
                System.out.print("*");
            }
            System.out.println(" ");
        }



    }
}
