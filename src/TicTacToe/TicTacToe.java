package TicTacToe;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '_';
            }
        }
        display(board);
        displayRules();

        takeInput(board);
    }

    private static void displayRules() {
        System.out.println("The positions of the board are in order showed below");
        System.out.println("[0, 1, 2]");
        System.out.println("[3, 4, 5]");
        System.out.println("[6, 7, 8]");
        System.out.println("Please enter the desired position while do not enter the occupied position");
        System.out.println("Enter '-1' to discard.");
    }

    private static void takeInput(char[][] board) {
        char player = 'X';
        boolean gameOver = false;
        Scanner scanner = new Scanner(System.in);

        while (!gameOver) {
            display(board);
            System.out.print("Player " + player + " enter: ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            System.out.println();

            if (board[row][col] == ' ') {
                board[row][col] = player; // place the element
                gameOver = win(board, player);
                if (gameOver) {
                    System.out.println("Player " + player + " has won: ");
                } else {
                    player = (player == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Invalid move. Try again!");
            }
        }
        display(board);
    }


    private static void display(char[][] board) {
        System.out.println("Board:");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

//    private static void put(char[][] board, char val, int pos) {
//        if (pos>=0 && pos <9) {
//            int r = pos / 3;
//            int c = pos % 3;
//            if (board[r][c]=='_')
//                board[r][c] = val;
//            else System.out.println("Invalid input");
//            if (win(board, pos)) {
//                System.out.println(val + " has won");
//            }
//        }else System.out.println("Invalid Input!");
//    }

    private static boolean win(char[][] board, char player) {
        for (int row = 0; row < board.length; row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }

        // check for col
        for (int col = 0; col < board[0].length; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }

        // diagonal
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }

        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }
}
