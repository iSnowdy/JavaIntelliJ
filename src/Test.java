public class Test {

    public static String arrayToCSV(int[][] inputArray) {
        StringBuilder csvString = new StringBuilder();

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++) {
                csvString.append(inputArray[i][j]);

                // Add a comma if it's not the last element in the row
                if (j < inputArray[i].length - 1) {
                    csvString.append(",");
                }
            }

            // Add a new line if it's not the last row
            if (i < inputArray.length - 1) {
                csvString.append("\n");
            }
        }

        return csvString.toString();
    }

    public static void main(String[] args) {
        int[][] inputArray = {
                {0, 1, 2, 3, 4},
                {10, 11, 12, 13, 14},
                {20, 21, 22, 23, 24},
                {30, 31, 32, 33, 34}
        };

        String csvRepresentation = arrayToCSV(inputArray);
        System.out.println(csvRepresentation);
    }
}
