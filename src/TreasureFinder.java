import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Arrays;
import java.util.Scanner;

public class TreasureFinder {
    public static void main(String[] args) {

        final int EMPTY = 0;
        final int MINE = 1;
        final int TREASURE = 2;
        final int ATTEMPT = 3;

        int x, y;
        int[][] cuadrant = new int[5][4];

        for (x = 0; x < 4; x++) {
            for (y = 0; y < 3; y++) {
                cuadrant[x][y] = EMPTY;
            }
        }

        System.out.println("Table has been set up\n" + Arrays.deepToString(cuadrant));

        int mineX = (int)(Math.random()*5);
        int mineY = (int)(Math.random()*4);
        cuadrant[mineX][mineY] = MINE;

        System.out.println("Mines have been filled in\n" + Arrays.deepToString(cuadrant));

        int treasureX, treasureY;

        do {
            treasureX = (int)(Math.random()*5);
            treasureY = (int)(Math.random()*4);
        }
        while ((mineX == treasureX) && (mineY == treasureY));
        cuadrant[treasureX][treasureY] = TREASURE;

        System.out.println("Search the Treasure!");

        boolean exit = false;
        String c = "";

        do {
            for (y = 3; y >= 0; y--) {
                System.out.print(y + "|");
                for (x = 0; x < 5; x++) {
                    if (cuadrant[x][y] == ATTEMPT) {
                        System.out.print("X ");
                    } else {
                        System.out.print(" ");
                    }
                }
            System.out.println();
            }
            System.out.println(" ----------\n 0 1 2 3 4 5 6\n");

            Scanner myX = new Scanner(System.in);
            System.out.print("X coordinate: ");
            x = Integer.parseInt(myX.nextLine());
            Scanner myY = new Scanner(System.in);
            System.out.print("Y coordinate: ");
            y = Integer.parseInt(myY.nextLine());

            switch (cuadrant[x][y]) {
                case EMPTY:
                    cuadrant[x][y] = ATTEMPT;
                    break;
                case MINE:
                    System.out.println("Sorry, you've lost");
                    exit = true;
                    break;
                case TREASURE:
                    System.out.println("Congratulations! You've found the treasure!");
                    exit = true;
                    break;
                default:
            }
        }
        while (!exit);

        for (y = 3; y >= 0; y--) {
            System.out.print(y + " ");
            for (x = 0; x < 5; x++) {
                switch (cuadrant[x][y]) {
                    case EMPTY:
                        c = " ";
                        break;
                    case MINE:
                        c = "* ";
                        break;
                    case TREASURE:
                        c = "$ ";
                        break;
                    case ATTEMPT:
                        c = "X ";
                        break;
                    default:
                }
                System.out.print(c);
            }
            System.out.println();
        }
        System.out.println("\" ----------\\n 0 1 2 3 4 5\\n\"");
    }
}
