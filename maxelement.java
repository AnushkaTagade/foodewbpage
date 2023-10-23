public class FindMaxElementInArray {
    public static void main(String[] args) {
        // Define an array of integers
        int[] numbers = {10, 5, 17, 8, 23, 12, 34, 19};

        // Initialize the maximum value with the first element of the array
        int max = numbers[0];

        // Loop through the array to find the maximum value
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Print the maximum value
        System.out.println("The maximum element in the array is: " + max);
    }
}

