public class Test2{
    public static String doubleChar(String s){

        s = "Hello";

        return s.replaceAll(".", "$0$0");
    }
}