import java.util.Scanner;

public class ArraySortingWithExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // Input array size
            System.out.print("Enter the number of elements: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                throw new IllegalArgumentException("Array size must be greater than 0.");
            }

            int[] arr = new int[n];

            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // Swap arr[j] and arr[j + 1]
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }

            System.out.println("Sorted array in ascending order:");
            for (int num : arr) {
                System.out.print(num + " ");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("\nProgram finished.");
        }
    }
}
