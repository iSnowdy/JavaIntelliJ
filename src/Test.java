import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        // Example usage
        int[] initialConfiguration = {4, 2, 8, 3};
        char direction = 'L';

        int[] result = switchGravity(initialConfiguration, direction);

        System.out.println("Here" + Arrays.toString(result));

        // Print the result
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] switchGravity(int[] configuration, char direction) {
        // Sorting the array in ascending order for 'L' and descending order for 'R'
        if (direction == 'R') {
            Arrays.sort(configuration);
        } else if (direction == 'L') {
            Arrays.sort(configuration);
            reverseArray(configuration);
        }

        return configuration;
    }

    // Helper method to reverse an array
    private static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Swap elements at left and right indices
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move indices towards the center
            left++;
            right--;
        }
    }
}