public class Test3 {
    public static void main(String[] args) {

        int[][] matriX = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][][] matriY = {
                {
                    {1,2,3},
                    {4,5}},
                    {{6},
                    {7,8},
                    {9}
                }
        };

        int i = 0, j = 0;

        while (i < matriX.length) { // Iteration of a 2D array with a while loop
            while (j < matriX[i].length) {
                System.out.println(matriX[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }


    }
}
