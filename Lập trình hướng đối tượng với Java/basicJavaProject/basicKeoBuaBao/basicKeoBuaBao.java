/*
Bài tập Tek4.vn
Trong dự án này, chúng ta sẽ tạo một trò chơi oẳn tù tì đơn giản.

Cách chơi trò oẳn tù tì:

Bao gồm hai người chơi.
Mỗi người chơi có thể chọn kéo hoặc búa hoặc bao.
Nếu hai người chơi ra cùng một hình, đó là một trận hòa.

MÔ TẢ DỰ ÁN:

Cách chương trình hoạt động:

Trò chơi được chơi giữa máy tính và người dùng.
Máy tính chọn ngẫu nhiên kéo hoặc búa hoặc bao. Người dùng sẽ không biết máy tính chọn hình gì.
Người dùng được yêu cầu chọn kéo hoặc búa hoặc bao.
So sánh lựa chọn của máy tính với lựa chọn của người dùng và quyết định người dùng thắng hoặc thua hoặc hòa.
 */

 import java.util.Scanner;
 class KeoBuaBao {
    
    //tạo phương thức chọn kết quả của máy tính
    String getComputerChoice () {
        int choice = (int) (Math.random() * 3 + 1);
        String computerChoice = new String();
        switch (choice) {
            case 1:
                computerChoice = "rock";
                break;
            
            case 2:
                computerChoice = "paper";
                break;
            
            case 3:
                computerChoice = "scissors";
                break;
        
            default:
                break;
        }
        return computerChoice;
    }

    //tạo phương thức tính thắng thua
    String getResult (String playerChoice, String computerChoice) {
        String result;
        
        if (playerChoice.equals(computerChoice)) {
            result = "Draw";
        }
        
        else if (playerChoice == "rock" && computerChoice == "scissors") {
            result = "Win";
        }
        else if (playerChoice == "paper" && computerChoice == "rock") {
            result = "Win";
        }
        else if (playerChoice == "scissors" && computerChoice == "paper") {
            result = "Win";
        }

        else {
            result = "Lose";
        }

        return result;
    }

    //tạo phương thức lấy lựa chọn của người chơi qua bàn phím
    String getPlayerChoice () {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter rock, paper or scissors:");
        String playerChoice = input.nextLine();
        playerChoice = playerChoice.toLowerCase();
        return playerChoice;
        }

    //hàm main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //tạo obj để gọi phương thức
        KeoBuaBao obj = new KeoBuaBao();

        //gọi phương thức để lấy lựa chọn người chơi
        String playerChoice;
        while (true) {
            playerChoice = obj.getPlayerChoice();
            if (playerChoice.equals("rock") || playerChoice.equals("paper") || playerChoice.equals("scissors")) {
                break;
            }
        }

        //lấy lựa chọn của máy tính
        String computerChoice = obj.getComputerChoice();

        //lấy kết quả
        String result = obj.getResult(playerChoice, computerChoice);

        //in ra kết quả
        System.out.println("Player Choice: " + playerChoice);
        System.out.println("Computer Choice: " + computerChoice);
        System.out.println(result);

        input.close();
    }
 }