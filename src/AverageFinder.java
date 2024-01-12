public class AverageFinder {
    public static void main(String[] args) {
        System.out.println("Average finder Main");
        double avg = findAverage(args);
        System.out.println("The average is " + avg);
    }

    private static double findAverage(String[] input) {
        double result = 0;

        for (String s : input) {
            result += Integer.parseInt(s);
        }

        result = result / input.length;

        return result;
    }
}
