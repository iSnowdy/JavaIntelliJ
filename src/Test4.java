public class Test4 {
    public static void main(String[] args) {

        int num = 454793;

        String until = "";

        String numS = Integer.toString(num);
        StringBuffer output = new StringBuffer(numS);

        System.out.println(numS);
        System.out.println("String length " + numS.length());

        for (int i = 0; i < numS.length() - 1; i++) {
            int firstP = Integer.parseInt(String.valueOf(numS.charAt(i)));
            int secondP = Integer.parseInt(String.valueOf(numS.charAt(i+1)));
            System.out.println(firstP);
            System.out.println(firstP);

            if (firstP % 2 == 1 & secondP % 2 == 1) {

                output = new StringBuffer(numS.substring(0, numS.indexOf(i+1)));
                output.append("-");
                System.out.println("Output" + output);

            }

        }




    }
}