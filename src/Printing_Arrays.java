public class Printing_Arrays {
    public static void main(String[] args) {

        // filling arrays + printing them

        int[] numbers = new int[20];
        int[] squares = new int[20];
        int[] cubes = new int[20];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = (int) (Math.random()*101);
        }

        for (int j = 0; j < squares.length; j++) {
            squares[j] = ((int) Math.pow(numbers[j], 2));
        }

        for (int k = 0; k < cubes.length; k++) {
            cubes[k] = ((int) Math.pow(numbers[k], 3));
        }

        for (int i : numbers) System.out.printf("%-10d", i);
        System.out.println();
        for (int j : squares) System.out.printf("%-10d", j);
        System.out.println();
        for (int k : cubes) System.out.printf("%-10d", k);
        System.out.println();

    }
}
