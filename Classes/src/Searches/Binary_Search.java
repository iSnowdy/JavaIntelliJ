package Searches;

public class Binary_Search {
    public static int binarySearch (int[] array, int elemento) {

        int center;
        int inf = 0;
        int end = array.length - 1;

        while (inf <= end) {
            center = (inf + end)/ 2;

            if (array[center] == elemento) {
                return center;
            }
            else if (elemento < array[center]) {
                end = center -1;
            }
            else {
                end = center + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(binarySearch(array, 1));
    }


}
