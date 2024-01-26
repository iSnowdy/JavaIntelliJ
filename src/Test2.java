import java.util.Arrays;
import java.util.Objects;

public class Test2 {

    public static void main(String[] args) {

        int x = 80;
        String result = "";

        String[] unit = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        if(x < 20)
            System.out.println(unit[x]);
        else if(x < 100)
            result = (x % 10 == 0) ? tens[x / 10 - 2] : tens[x / 10 - 2] + " " + unit[x % 10];

            // (condition) ? (if it's true do this : if it's false do this)
            // if it's x % 10 = 0 means that its 20, 30... and no need to add the second number

        else
            System.out.println("");

        System.out.println(result);

        System.out.println("Testing stuff: \n" + x % 10 + "\n" + tens[x / 10 - 2]);

    }
}
