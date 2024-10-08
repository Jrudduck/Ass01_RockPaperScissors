import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Variables
        String playerA;
        String playerB;
        String playerRematch;
        boolean aValid;
        boolean bValid;
        boolean playValid = false;
        boolean rematchValid = false;
        do {
            //input
            System.out.println("Player A please enter R for rock, S for scissors, or P for Paper.");
            do {
                playerA = scan.nextLine();
                aValid = false;
                if (playerA.equalsIgnoreCase("r") || playerA.equalsIgnoreCase("s") || playerA.equalsIgnoreCase("p")) {
                    aValid = true;
                } else {
                    System.out.println("You have inputted an invalid value. Please enter R for rock, S for scissors, or P for Paper.");
                }

            } while (!aValid);

            System.out.println("Player B please enter R for rock, S for scissors, or P for Paper.");
            do {
                playerB = scan.nextLine();
                bValid = false;
                if (playerB.equalsIgnoreCase("r") || playerB.equalsIgnoreCase("s") || playerB.equalsIgnoreCase("p")) {
                    bValid = true;
                } else {
                    System.out.println("You have inputted an invalid value. Please enter R for rock, S for scissors, or P for Paper.");
                }

            } while (!bValid);

            //process
            if (playerA.equalsIgnoreCase("r") && playerB.equalsIgnoreCase("p")) {
                System.out.println("Paper covers rock, player B wins!");
            } else if (playerA.equalsIgnoreCase("p") && playerB.equalsIgnoreCase("r")) {
                System.out.println("Paper covers rock, player A wins!");
            } else if (playerA.equalsIgnoreCase("r") && playerB.equalsIgnoreCase("s")) {
                System.out.println("Rock breaks scissors, player A wins!");
            } else if (playerA.equalsIgnoreCase("s") && playerB.equalsIgnoreCase("r")) {
                System.out.println("Rock breaks scissors, player B wins!");
            } else if (playerA.equalsIgnoreCase("s") && playerB.equalsIgnoreCase("p")) {
                System.out.println("Scissors cuts paper, player A wins!");
            } else if (playerA.equalsIgnoreCase("p") && playerB.equalsIgnoreCase("s")) {
                System.out.println("Scissors cuts paper, player B wins!");
            } else if (playerA.equalsIgnoreCase("p") && playerB.equalsIgnoreCase("p")) {
                System.out.println("You both choose paper, the game is a tie!");
            } else if (playerA.equalsIgnoreCase("r") && playerB.equalsIgnoreCase("r")) {
                System.out.println("You both choose rock, the game is a tie!");
            } else if (playerA.equalsIgnoreCase("s") && playerB.equalsIgnoreCase("s")) {
                System.out.println("You both choose scissors, the game is a tie!");
            }

                System.out.println("Would you like to play Rock, Paper, Scissors again? [Y/N]");
            do {
                playerRematch = scan.nextLine();
                if (playerRematch.equalsIgnoreCase("n")) {
                    playValid = true;
                    rematchValid = true;
                } else if (playerRematch.equalsIgnoreCase("y")){
                    rematchValid = true;
                }else {
                    System.out.println("Please enter [Y/N] for a rematch.");
                }
            } while (!rematchValid);
        }while (!playValid);


        }
    }