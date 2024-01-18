import java.util.Objects;

public class Flush {

    public static void main(String[] args) {

        String[] hand = {"AS", "3S", "9S", "KS", "4S"};
        String[] hand_2 = {"AS", "3S", "9S", "KS", "4S"};
        String[] cards = {"H", "S", "D", "C"};
        String word;
        char letter;
        String b;

        boolean result;

        int counter = 0;

        for (int i = 0; i < hand_2.length; i++) {
            for (int j = 0; j < 2; j++) {
                int c = 0;
                word = hand_2[i];
                letter = word.charAt(j);
                while (c < cards.length) {
                    b = cards[c];
                    char A = b.charAt(0);
                    if (Objects.equals(letter, A)) {
                        counter ++;
                    }
                    c ++;
                }
            }
        }
        if (counter == 5) {
            result = true;
        }
        else {
            result = false;
        }

    System.out.println(result);

    }
}
