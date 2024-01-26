import java.util.Arrays;
import java.util.Objects;

public class Test {

    public static void main(String[] args) {

        int[] key = {1,1,0,1,0,0,0,1,1,0,0,0,1,0,1,1};

        System.out.print(Arrays.toString(key));

        int keyLength = key.length;
        int ones = 0;
        int ceros = 0;
        String result = "";

        int square = (int) Math.sqrt(keyLength); // Square area is sides^2 so sqrt
        if (square * square != keyLength) {
            System.out.print("No");
        }

        System.out.println(square);
        System.out.println(keyLength);

        for (int i = 0; i < key.length; i++) {
            if (key[square] == key[square + 1]) {
                result = "Yes";
            }
            else {
                result = "No";
            }

        }
        System.out.print(result);
    }
}
