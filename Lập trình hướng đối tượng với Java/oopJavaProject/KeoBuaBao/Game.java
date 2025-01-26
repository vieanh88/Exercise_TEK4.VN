import java.util.Scanner;

public class Game {
    
    String computerChoice;
    String playerChoice;
    String result;

    /**
     * phương thức lấy lựa chọn của máy tính (computerChoice)
     * */
    String getComputerChoice() {
        
        String computerChoice = "null";
        int ranNum = (int) (Math.random()*3) + 1;

        switch (ranNum) {
            case 1:
            computerChoice = "rock";
            break;

            case 2:
            computerChoice = "paper";
            break;

            case 3:
            computerChoice = "scissors";
            break;
        }

        return computerChoice;
    }

    /**
     * phương thức lấy lựa chọn của người chơi
     * */
    String getPlayerChoice() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your choice (rock, paper or scissors): ");
        String playerChoice = input.nextLine();

        //kiểm tra lựa chọn của người chơi
        if (!(playerChoice.equals("rock") || playerChoice.equals("paper") || playerChoice.equals("scissors"))) {

            //tạo vòng lặp bắt người chơi nhập đáp án đến khi đúng thì thôi
            while (true) {
                System.out.println ("Wrong choice!");
                System.out.println ("Please enter \"rock\", \"paper\" or \"scissors\": ");
                playerChoice = input.nextLine();
                if (playerChoice.equals("rock") || playerChoice.equals("paper") || playerChoice.equals("scissors")) {
                    break;
                }
            }
        }
        input.close();

        return playerChoice;
    }

    String getResult(String computerChoice, String playerChoice) {
        
        String result;

        if (playerChoice.equals("rock") && computerChoice.equals("scissors") ||
            playerChoice.equals("scissors") && computerChoice.equals("paper")||
            playerChoice.equals("paper") && computerChoice.equals("rock") 
            ) {
            result = "win";
        }

        else if (playerChoice.equals(computerChoice)) {
            result = "draw";
        }

        else {
            result = "lose";
        }

        return result;
    }

}

