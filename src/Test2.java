public class Test2 {

    public static String arrayToCSV(int[][] inputArray) {

        StringBuilder csvString = new StringBuilder();

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j <inputArray[i].length; j++) {
                csvString.append(inputArray[i][j]);

                if (j <inputArray[i].length - 1) {
                    csvString.append(",");
                }

            if (i < inputArray.length - 1) {
                csvString.append("\n");
                }

            }
        }
    return csvString.toString();
    }
}
