
import java.util.Scanner;
import java.util.Random;

    public class rps {
        public static void main (String args[]){
            int input;
            int b = 1;
            Scanner sage = new Scanner(System.in);
            Random rnd = new Random();
            System.out.println("Rock Paper Scissors, by Sage!");
            System.out.println("Select 1, 2, 3, for Rock, Paper, Scissors");
            //Menu Present, pretty bad still

            while (b != 0) {
                int rock = 1, paper = 2, scissors = 3;
                input = sage.nextInt();
                int randomNumber = rnd.nextInt(3 - 1 + 1) + 1;

                if (randomNumber == rock) {
                    if (input == rock) {
                        System.out.println("Rock vs. Rock, ITS A TIE!");
                    } else if (input == paper) {
                        System.out.println("Rock vs. Paper! You win!");
                    } else if (input == scissors) {
                        System.out.println("Rock vs. Scissors! You lose!");
                    }  //These blocks establish options if the computer got Rock

                    else if (randomNumber == paper) {
                        if (input == rock) {
                            System.out.println("Paper vs. Rock! You lose!");
                        } else if (input == scissors) {
                            System.out.println("Paper vs. Scissors! You win!");
                        } else if (input == paper) {
                            System.out.println("Paper vs. Paper! Its a tie!");
                        } //These blocks establish the options if comp. got paper

                        else if (randomNumber == scissors) {
                            if (input == rock) {
                                System.out.println("Scissors vs. Rock! You win!");
                            } else if (input == scissors) {
                                System.out.println("Scissors vs. Scissors, ITS A TIE!");
                            } else if (input == paper) {
                                System.out.println("Scissors vs Paper! You lose!");
                            } //These blocks establish if the computer got scissors.

                        }
                    }
                    rps2 rps2Object = new rps2();
                    rps2Object.rps2();


                }
            }}
    }

