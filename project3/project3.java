// imported all java utils to make sure I had everything I needed.
import java.util.*;
  
public class main {
    
    static String[] board;
    static String turn;
    
    
    // The variable wincheck will return the winner of the board in either X or 
    // O player. It does this by using what is called a switch in java. That 
    // checks for a specific win case. If a player has a specfic pattern on the
    // board then the wincheck will return the winners symbol. This is important
    // for later.
    static String wincheck()
    {
        for (int a = 0; a < 8; a++) {
            String line = null;
  
            switch (a) {
            case 0:
                line = board[0] + board[1] + board[2];
                break;
            case 1:
                line = board[3] + board[4] + board[5];
                break;
            case 2:
                line = board[6] + board[7] + board[8];
                break;
            case 3:
                line = board[0] + board[3] + board[6];
                break;
            case 4:
                line = board[1] + board[4] + board[7];
                break;
            case 5:
                line = board[2] + board[5] + board[8];
                break;
            case 6:
                line = board[0] + board[4] + board[8];
                break;
            case 7:
                line = board[2] + board[4] + board[6];
                break;
            }
            
            
            // If X is the winner.
            if 
                    (line.equals("XXX")) {
                return "X";
            }
              
            // If O is the winner.
            else if 
                    (line.equals("OOO")) {
                return "O";
            }
        }
          
        for (int a = 0; a < 9; a++) {
            if (Arrays.asList(board).contains(
                    String.valueOf(a + 1))) {
                break;
            }
            else if (a == 8) {
                return "draw";
            }
        }
  
       // To enter the X Or O at the exact place on board.
        System.out.println(
            turn + "'s turn; enter a number to place your symbol"
            + turn + " in:");
        return null;
    }
      
 // printBoard is the boards GUI design 
    static void Board()
    {
        System.out.println("|---|---|---|");
        System.out.println("| " + board[0] + " | "
                           + board[1] + " | " + board[2]
                           + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | "
                           + board[4] + " | " + board[5]
                           + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | "
                           + board[7] + " | " + board[8]
                           + " |");
        System.out.println("|---|---|---|");
    }
  
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        board = new String[9];
        turn = "X";
        String winner = null;
  
        for (int a = 0; a < 9; a++) {
            board[a] = String.valueOf(a + 1);
        }
  
        System.out.println("Tic Tac Toe! Have fun and good luck!");
        Board();
  
        System.out.println(
            "X will go first. Enter a slot number to place an X in: ");
  
        while (winner == null) {
            int numberInput;
            
           // This is what will take the input from the user. It has some error
           // catching in it to prevent numbers that are not 1-9.
            try {
                numberInput = in.nextInt();
                if (!(numberInput > 0 && numberInput <= 9)) {
                    System.out.println(
                        "This isn't a correct number, sorry. Please re-enter a slot number: ");
                    continue;
                }
            }
            catch (InputMismatchException e) {
                System.out.println(
                    "This isn't a correct number, sorry. Please re-enter a slot number: ");
                continue;
            }
              
            // This logic will tell the game what turn it is
            if (board[numberInput - 1].equals(
                    String.valueOf(numberInput))) {
                board[numberInput - 1] = turn;
  
                if (turn.equals("X")) {
                    turn = "O";
                }
                else {
                    turn = "X";
                }
  
                Board();
                winner = wincheck();
            }
            else {
                System.out.println(
                    "This space has already been taken! Please retry another slot number:");
            }
        }
        
        // This logic will print a draw message to the players
        if (winner.equalsIgnoreCase("draw")) {
            System.out.println(
                "This is a draw! You should try playing again!");
        }
        
        // The else will display the winner message to the players.
        else {
            System.out.println(
                "You did it! " + winner
                + "'s are the winner! Thank you for participating! You should go again!.");
        }
    }
}