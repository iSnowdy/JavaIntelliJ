package matematicas;

public class Varias {

    public static boolean esPrimo(int x) {

        for (int i = 2; i < x; i++) {
            if ((x % i) == 0) {
                return false;
            }
        }
    return true;
    }

    public static int digitos(int x) {

        if (x == 0) {
            return 1;
        }
        else {
            int n = 0;
            while (x > 0) {
                x = x / 10;
                n ++;
            }
            return n;
        }
    }
}
