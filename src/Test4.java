import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {

        int[] first = { 2, 4, 8 };
        int[] second = { 2, 4, 6 };

        int[] joined = new int[first.length + second.length];

        System.arraycopy(first, 0, joined, 0, first.length);
        System.arraycopy(second, 0, joined, first.length, second.length);

        System.out.println(Arrays.toString(joined));
        Arrays.sort(joined);
        System.out.println(Arrays.toString(joined));

        StringBuilder result = new StringBuilder();
        StringBuilder finalresult = new StringBuilder();

        for (int i : joined) {
            result.append(i);
        }

        System.out.println("Full " + result);

        for (int i = 0; i < result.length(); i++) {
            if (i == result.length() - 1) {
                finalresult.append(result.charAt(result.length() - 1));
                break;
            }
            char firstC = result.charAt(i);
            char secondC = result.charAt(i+1);

            if (firstC != secondC) {
                finalresult.append(firstC);
            }
        }

        System.out.println("No repeats " + finalresult);


        int[] resultado = new int[finalresult.length()];
        for (int i = 1; i < finalresult.length(); i++) {
            resultado[i] = Integer.valueOf(finalresult.toString().charAt(i));
        }
        System.out.println(Arrays.toString(resultado));


    }
}
