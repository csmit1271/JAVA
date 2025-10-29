package ARrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();

        // Input values
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter No. " + (i + 1) + ": ");
            int num = sc.nextInt();
            list1.add(num);
        }
        sc.close();

        // Display original list
        System.out.print("Original list: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(list1.get(i));
            if (i < 4) System.out.print(", ");
        }
        System.out.println();

        // Sum of elements
        int sum = 0;
        for (int num : list1) {
            sum += num;
        }
        System.out.println("Sum: " + sum);

        // Find min and max
        int min = list1.get(0);
        int max = list1.get(0);
        for (int num : list1) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

        // Sort the list in descending order
        for (int i = 0; i < list1.size(); i++) {
            for (int j = i + 1; j < list1.size(); j++) {
                if (list1.get(i) < list1.get(j)) {
                    // Swap using set
                    int temp = list1.get(i);
                    list1.set(i, list1.get(j));
                    list1.set(j, temp);
                }
            }
        }

        // Display sorted list
        System.out.print("Sorted (Descending): ");
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i));
            if (i < list1.size() - 1) System.out.print(", ");
        }
        System.out.println();
    }
}
