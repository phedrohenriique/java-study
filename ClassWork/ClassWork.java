
// to run with less boilerplate code use command
// $ java --enable-preview folder/file.java

import java.util.Arrays;
import java.util.Scanner;

void main(){ // simplified version for JDK 21+
// System.out.println("Main Class Running...");
TicTacToe game = new TicTacToe();
System.out.println(" GAME STARTED ");
System.out.println(" PLAYER 1 = X ");
System.out.println(" PLAYER 2 = O " + "\n");

while (true) {

    // BREAK IF WINNER

    // PLAYER 1

    System.out.println(" PLAYER 1 MOVE ");
    System.out.println(" CHOOSE ROW AND COLUMN ");

    Scanner scr1 = new Scanner(System.in);
    int r1 = scr1.nextInt();
    Scanner scc1 = new Scanner(System.in);
    int c1 = scc1.nextInt();

    while (game.checkMove(r1, c1) == false){
        System.out.println(" PLAYER 1 AGAIN ");
        scr1 = new Scanner(System.in);
        r1 = scr1.nextInt();
        scc1 = new Scanner(System.in);
        c1 = scc1.nextInt();
    }

    game.player1Move(r1, c1);
    game.showGameBoard();

    if (game.checkWinner("PLAYER 1")){
        break;
    }

    // PLAYER 2

    System.out.println(" PLAYER 2 MOVE ");
    System.out.println(" CHOOSE ROW AND COLUMN ");

    Scanner scr2 = new Scanner(System.in);
    int r2 = scr2.nextInt();
    Scanner scc2 = new Scanner(System.in);
    int c2 = scc2.nextInt();

    while (game.checkMove(r2, c2) == false) {
        System.out.println(" PLAYER 2 AGAIN ");
        scr2 = new Scanner(System.in);
        r2 = scr1.nextInt();
        scc2 = new Scanner(System.in);
        c2 = scc2.nextInt();
    }

    game.player2Move(r2, c2);
    game.showGameBoard();

    if (game.checkWinner("PLAYER 2")){
        break;
    }
    
}

}

public class TicTacToe {

    // global variables
    // static methods exists before objects are created

    String[][] boardGrid = {
            { " ", " ", " "},
            { " ", " ", " "},
            { " ", " ", " "}
    };

    public boolean checkMove(int r, int c){
        String grid = boardGrid[r][c];
        if (grid == " " ) {
            System.out.println("\n"+" ABLE TO PLAY "+"\n");
            return true;
        };
        System.out.println("\n"+" UNABLE TO PLAY "+"\n");
        return false;
    }

    public boolean checkWinner(String player){

        // rows

        if (
            boardGrid[0][0] == "X" && boardGrid[0][1] == "X" && boardGrid[0][2] == "X" || 
            boardGrid[0][0] == "O" && boardGrid[0][1] == "O" && boardGrid[0][2] == "O"
        ){
            System.out.println(" WINNER " + player);
            return true;
        }

        if (
            boardGrid[1][0] == "X" && boardGrid[1][1] == "X" && boardGrid[1][2] == "X" || 
            boardGrid[1][0] == "O" && boardGrid[1][1] == "O" && boardGrid[1][2] == "O"
        ){
            System.out.println(" WINNER " + player);
            return true;
        }

        if (
            boardGrid[2][0] == "X" && boardGrid[2][1] == "X" && boardGrid[2][2] == "X" || 
            boardGrid[2][0] == "O" && boardGrid[2][1] == "O" && boardGrid[2][2] == "O"
        ){
            System.out.println(" WINNER " + player);
            return true;
        }

        // columns

        if (
            boardGrid[0][0] == "X" && boardGrid[1][0] == "X" && boardGrid[2][0] == "X" || 
            boardGrid[0][0] == "O" && boardGrid[1][0] == "O" && boardGrid[2][0] == "O"
        ){
            System.out.println(" WINNER " + player);
            return true;
        }

        if (
            boardGrid[0][1] == "X" && boardGrid[1][1] == "X" && boardGrid[2][1] == "X" || 
            boardGrid[0][1] == "O" && boardGrid[1][1] == "O" && boardGrid[2][1] == "O"
        ){
            System.out.println(" WINNER " + player);
            return true;
        }

        if (
            boardGrid[0][2] == "X" && boardGrid[1][2] == "X" && boardGrid[2][2] == "X" || 
            boardGrid[0][2] == "O" && boardGrid[1][2] == "O" && boardGrid[2][2] == "O"
        ){
            System.out.println(" WINNER " + player);
            return true;
        }

        // diagonals

        if (
            boardGrid[0][0] == "X" && boardGrid[1][1] == "X" && boardGrid[2][2] == "X" ||
            boardGrid[0][0] == "O" && boardGrid[1][1] == "O" && boardGrid[2][2] == "O"
        ){
            System.out.println(" WINNER " + player);
            return true;
        }

        if (
            boardGrid[0][2] == "X" && boardGrid[1][1] == "X" && boardGrid[2][0] == "X" ||
            boardGrid[0][2] == "O" && boardGrid[1][1] == "O" && boardGrid[2][0] == "O"
        ){
            System.out.println(" WINNER " + player);
            return true;
        }

        return false;

    }

    public void player1Move(int r, int c){
        boardGrid[r][c] = "X";
    }

    public void player2Move(int r, int c) {
        boardGrid[r][c] = "O"; 
    }

    public void showGameBoard() {
        // System.out.println(Arrays.deepToString(boardGrid));
        System.out.println("\n"+boardGrid[0][0] + " | " + boardGrid[0][1] + " | " + boardGrid[0][2]);
        System.out.println(boardGrid[1][0] + " | " + boardGrid[1][1] + " | " + boardGrid[1][2]);
        System.out.println(boardGrid[2][0] + " | " + boardGrid[2][1] + " | " + boardGrid[2][2]+"\n");
    }

}
