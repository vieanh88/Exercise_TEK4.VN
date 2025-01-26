import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        System.out.println ("Welcom to the Game!");

        Game game1 = new Game();  //tạo đối tượng game1
        
        //vòng lặp cho phép người chơi chơi lại
        while (true) {

            String playerChoice = game1.getPlayerChoice();

            String computerChoice =  game1.getComputerChoice();

            String result = game1.getResult(playerChoice, computerChoice);

            System.out.println("Player Choice: " + playerChoice);
            System.out.println("Computer Choice: " + computerChoice);
            System.out.println("Game result: " + result);

            //hỏi yêu cầu chơi lại của player
            System.out.println("Do you want to play again? (y/n)");

            Scanner input = new Scanner(System.in);
            char playerRequest = input.next().charAt(0);

            if (playerRequest == 'y') {
                continue;
            }
            else if (playerRequest == 'n') {
                break;
            }
            else {
                System.out.println("Invalid Request!");
                break;
            }

        }
        
    }
}
