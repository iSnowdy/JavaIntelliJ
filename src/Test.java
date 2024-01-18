public class Test {
    public static void main(String[] args) {

        int repeat = 3;
        int i = 0;
        String string = "Hello";
        String s = "";

        while (i < repeat - 1) {

            s = s + string;
            i ++;

        }
        System.out.print(s);
    }
}
