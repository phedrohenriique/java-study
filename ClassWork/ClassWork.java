
// to run with less boilerplate code use command
// $ java --enable-preview folder/file.java

import java.util.Arrays;

void main(){ // simplified version for JDK 21+
System.out.println("Main Class Running...");
TicTacToe game = new TicTacToe();
// game.ShowGameBoard();
game.player1Move(0, 0);
game.player2Move(0, 1);
game.player1Move(0, 0);
game.showGameBoard();

}

public class TicTacToe {

    // global variables
    // static methods exists before objects are created

    String[][] boardGrid = {
            { " ", " ", " "},
            { " ", " ", " "},
            { " ", " ", " "}
            // { null, null, null}
            // { null, null, null}
            // { null, null, null}
    };

    public boolean checkMove(int r, int c){
        String grid = boardGrid[r][c];

        if (grid == " ") {
            System.out.println(" CAN PLAY MOVE ");
            return true;
        };

        System.out.println(" CAN NOT PLAY MOVE ");
        return false;

    }

    public void player1Move(int r, int c){
        // define player 1 with X
        if (checkMove(r, c)) {
            boardGrid[r][c] = "X";
        }
        

    }

    public void player2Move(int r, int c) {
        // define player 2 with O
        if (checkMove(r, c)) {
            boardGrid[r][c] = "O";
        };
        
    }

    public void showGameBoard() {
        // System.out.println(Arrays.deepToString(boardGrid));
        System.out.println(boardGrid[0][0] + " | " + boardGrid[0][1] + " | " + boardGrid[0][2]);
        System.out.println(boardGrid[1][0] + " | " + boardGrid[1][1] + " | " + boardGrid[1][2]);
        System.out.println(boardGrid[2][0] + " | " + boardGrid[2][1] + " | " + boardGrid[2][2]);
    }

}
