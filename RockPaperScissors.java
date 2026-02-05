import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args){
        //0 for ROCK
        //1 for PAPER
        //2 for SCISSORS
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 0 for ROCK , 1 for PAPER , 2 for SCISSORS");
        int userinput= sc.nextInt();
        Random random=new Random();
        int computerinput= random.nextInt(3);
        if (userinput == computerinput){
            System.out.println("DRAW");
        } else if (userinput == 0 && computerinput == 2 ||
                   userinput == 1 && computerinput == 0 ||
                   userinput == 2 && computerinput == 1 ) {
            System.out.println("YOU WIN!");
        }
        else{
            System.out.println(" COMPUTER WIN!");
        }
        System.out.println("COMPUTER CHOICE:" + computerinput);
        if (computerinput == 0){
            System.out.println("COMPUTER CHOICE: ROCK");
        } else if (computerinput == 1){
            System.out.println("COMPUTER CHOICE: PAPER");
        } else if (computerinput == 2){
            System.out.println("COMPUTER CHOICE: SCISSORS");
        }


    }

}
