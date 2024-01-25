import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {

        int[] first = { 1, 3, 5 };
        int[] second = { 2, 3, 3 };

        StringBuilder result = new StringBuilder();
        int counter = 0;

        for (int i = 0; i < first.length + second.length; i++) {
            char firstA = Arrays.toString(first).charAt(i+1);
            char secondA = Arrays.toString(second).charAt(i+1);

            if (firstA != secondA) {
                if (firstA < secondA) {
                    result.append(Character.getNumericValue(firstA));
                    result.append(Character.getNumericValue(secondA));
                }
                else {
                    result.append(Character.getNumericValue(secondA));
                    result.append(Character.getNumericValue(firstA));
                }
            }
        }

        System.out.println(result);
        System.out.println(Arrays.toString(first));

    }
}
