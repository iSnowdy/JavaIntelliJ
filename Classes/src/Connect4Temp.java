import java.util.Arrays;
import java.util.Scanner;

public class Connect4Temp {
    public static void main(String[] args) {

    final int EMPTY = 0;
    final int ATTEMPT = 4;
    final int PLAYER2 = 2;
    int[][] table = new int[6][7];

    for (int x = 0; x < 6; x ++) {
        for (int y = 0; y < 5; y ++) {
            table[x][y] = EMPTY;
        }
    }

    System.out.println(Arrays.deepToString(table));

    int player2X = (int)(Math.random()*5);
    int player2Y = (int)(Math.random()*4);
    table[player2X][player2Y] = PLAYER2;

    boolean exit = false;

    do {
        int x, y;

        for (y = 6; y >= 0; y--) {
            System.out.print(y + "|");
            for (x = 0; x < 5; x ++) {
                if (table[x][y] == ATTEMPT) {
                    System.out.print("X ");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        System.out.println(" ---------------\n 0 1 2 3 4 5 6 7\n");

        int myX, myY;
        Scanner axisX = new Scanner(System.in);
        System.out.print("X coordinate: ");
        x = Integer.parseInt(axisX.nextLine());
        Scanner axisY = new Scanner(System.in);
        System.out.print("Y coordinate: ");
        y = Integer.parseInt(axisY.nextLine());

        switch (table[x][y]) {
            case EMPTY:
                table[x][y] = ATTEMPT;
                break;
            case PLAYER2:
                System.out.println("You lose");
                exit = true;
                break;
            default:
        }
    }
    while (!exit);

    String c = " ";
    for (int y = 6; y >= 0; y--) {
        System.out.print(y + " ");
        for (int x = 0; x < 5; x ++) {
            switch (table[x][y]) {
                case EMPTY:
                    c = " ";
                    break;
                case PLAYER2:
                    c = "P2 ";
                    break;
                case ATTEMPT:
                    c = "P1 ";
                    break;
                default:
            }
            System.out.print(c);
        }
        System.out.println();
    }

    System.out.println(" ---------------\n 0 1 2 3 4 5 6 7\n");

    }
}


        /*

        for (int row = 0; row < 6; row++)
        {
            System.out.println("");
            System.out.println("---------------------------------");

            for (int column = 0; column < 7; column++)
            {
                System.out.print("| " + "x" + " ");
            }
            System.out.print("|");
        }
        System.out.println("");
        System.out.println("---------------------------------");

         */



