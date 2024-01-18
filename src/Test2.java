import java.util.Objects;

public class Test2 {

    public static void main(String[] args) {

        String[] hand_2 = {"QD", "4D", "10D", "KD", "5D"};
        String[] cards = {"H", "S", "D", "C"};
        String word;
        char letter;
        String b;
        int H = 0;
        int S = 0;
        int D = 0;
        int C = 0;

        boolean result;

        int counter = 0;

        for (int i = 0; i < hand_2.length; i++) {
            for (int j = 0; j < 2; j++) {
                int c = 0;
                word = hand_2[i];
                letter = word.charAt(j);

                if (Objects.equals(letter, 'H')) {
                    H ++;
                }
                 else if (Objects.equals(letter, 'S')) {
                    S ++;
                }
                else if (Objects.equals(letter, 'D')) {
                    D ++;
                }
                else if (Objects.equals(letter, 'C')) {
                    C ++;
                }
            }
        }
        if (H == 5 || S == 5 || D == 5|| C == 5) {
            result = true;
        }
        else {
            result = false;
        }

        System.out.println(result);

    }
}
