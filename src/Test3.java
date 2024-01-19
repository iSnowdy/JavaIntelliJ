public class Test3 {
    public static void main(String[] args) {

        String s = "HelloKata";
        int partLength = 3;
        int bigcounter = 0;
        int counter = 0;

        String spaced = "";

        System.out.println(s.length());

        while (s.length() > bigcounter) {
            spaced = spaced + s.charAt(bigcounter);
            bigcounter ++;
            counter ++;
            if (counter == partLength & bigcounter != s.length()) {
                spaced = spaced + " ";
                counter = 0;
            }
        }

        System.out.println(spaced);
    }
}
