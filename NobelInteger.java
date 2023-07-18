package nobelInteger;

import java.util.Scanner;
import java.util.Arrays;

public class NobelInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        System.out.println("Enter array elements:");
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        Arrays.sort(array);
        System.out.println(nobel(array));
    }

    private static int nobel(int array[]) {
        int result = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != i) {
                result = -1;
            }

        }
        return result;
    }

}
