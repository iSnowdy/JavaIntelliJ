public class Main {
    public static void main(String[] args) {


        String address = "100 Queen St W, Toronto, ON M5H 2N2";
        String civicNumber = address.substring(0, 5) + "-";
        System.out.println(civicNumber);
    }

}

