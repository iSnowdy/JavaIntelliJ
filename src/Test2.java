import java.util.Arrays;
import java.util.Objects;

public class Test2 {

    public static void main(String[] args) {

        int[] key = {1,1,0,1,0,0,0,1,1,0,0,0,1,0,1,1};

        int keyLength = key.length;

        int square = (int) Math.sqrt(keyLength); // Square area is sides^2 so sqrt
        if (square * square != keyLength) {
            System.out.print("No");
        }

    }
}
