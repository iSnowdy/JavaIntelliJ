package Searches;

public class Linear_Search {

    public static int Search (int[] array, int number) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public static void main (String[] args) {

        int[] array = {1, 5, 3, 4, 5, 6, 5};


        System.out.println(Search(array, 5));
        System.out.println(Search(array, 5));


    }

}
