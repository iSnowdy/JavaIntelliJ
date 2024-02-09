import java.util.Arrays;
import java.util.Scanner;

public class Connect4 {

    int[][] table;
    int currentPlayer;
    boolean exit;

    public Connect4() {

        table = new int[6][7];
        currentPlayer = 1;
        exit = false;

    }

    public String Play(int column) {

        // We check for conditions

        if (exit) {
            return "Game has finished!";
        }

        if (column < 0 || column > 6) {
            return "Invalid column number. Please input a column number between 0 and 6";
        }

        if (isColumnFull(column)) {
            return "Column full!";
        }

        putDownDisc(column);
        if (winningCondition()) {
            drawTable();
            exit = true;
            return "Player " + currentPlayer + " wins!";
        }

        currentPlayer = currentPlayer == 1 ? 2 : 1;
        return "Player " + currentPlayer + " has a turn";

    }

    public boolean isColumnFull (int column) {

        // System.out.println(Arrays.deepToString(table));
        return table[0][column] != 0; // If not 0 then its filled

    }

    // Place disks

    protected void putDownDisc (int column) {

        for (int row = 5; row >= 0; row --) { // Start from the bottom
            if (table[row][column] == 0) {
                table[row][column] = currentPlayer;

                // System.out.println(Arrays.deepToString(table));

                break;
            }
        }
    }

    // Winning conditions

    public boolean checkHorizontal () {

        for (int row = 0; row < 6; row ++) {
            for (int col = 0; col < 4; col ++) {
                if (table[row][col] == currentPlayer && // Out of index control: col size - 3
                    table[row][col + 1] == currentPlayer &&
                    table[row][col + 2] == currentPlayer &&
                    table[row][col + 3] == currentPlayer) {

                    // System.out.println(Arrays.deepToString(table));

                    return exit = true; // End game
                }
            }
        }
        return exit = false; // Continue game
    }


    public boolean checkVertical () {

        for (int row = 0; row < 3; row ++) {
            for (int col = 0; col < 7; col ++) {
                if (table[row][col] == currentPlayer &&
                    table[row + 1][col] == currentPlayer &&
                    table[row + 2][col] == currentPlayer &&
                    table[row + 3][col] == currentPlayer) {

                    // System.out.println(Arrays.deepToString(table));

                    return exit = true;
                }
            }
        }
        return exit = false;
    }


    public boolean checkDiagonal () {

        for (int row = 0; row < 3; row ++) {
            for (int col = 0; col < 4; col ++) {
                if (table[row][col] == currentPlayer &&
                    table[row + 1][col + 1] == currentPlayer &&
                    table[row + 2][col + 2] == currentPlayer &&
                    table[row + 3][col + 3] == currentPlayer) {

                    return exit = true;
                }
            }
        }

        for (int row = 0; row < 3; row ++) {
            for (int col = 3; col < 7; col ++) { // Start col 3 because it is reversed
                if (table[row][col] == currentPlayer &&
                    table[row + 1][col - 1] == currentPlayer &&
                    table[row + 2][col - 2] == currentPlayer &&
                    table[row + 3][col - 3] == currentPlayer) {

                    return exit = true;
                }
            }
        }

        return exit = false;

    }

    public boolean winningCondition () {

        return (checkHorizontal() || checkVertical() || checkDiagonal());
    }

    public void drawTable () {

        for (int row = 0; row < 6; row ++) {
            for (int col = 0; col < 7; col ++) {
                System.out.print("| ");
                switch (table[row][col]) {
                    case 0:
                        System.out.print(" ");
                        break;
                    case 1:
                        System.out.print("X");
                        break;
                    case 2:
                        System.out.print("0");
                        break;
                }
                System.out.print(" ");
            }
            System.out.println("|");
        }
        System.out.println("-----------------------------");
        System.out.println("  0   1   2   3   4   5   6");
    }


    public static void main(String[] args) {

        Connect4 game = new Connect4();
        Scanner input = new Scanner(System.in);

        System.out.println(Arrays.deepToString(game.table));
        // game.drawTable();

        while (!game.exit) {
            game.drawTable();
            System.out.println(game.Play(input.nextInt()));
        }

    }
}
