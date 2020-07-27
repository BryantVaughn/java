import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] intValues = getIntegers();

        printArray(intValues);
        int[] sortedArr = sortArray(intValues);
        printArray(sortedArr);
    }

    public static int[] getIntegers() {
        int[] values;
        int amount;

        System.out.print("How many integers would you like to enter: ");
        amount = scanner.nextInt();
        values = new int[amount];

        System.out.println("Enter an integer value: \r");
        for (int i = 0; i < amount; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static int[] sortArray(int[] arr) {
        boolean swapped = true;
        int temp;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i+1]) {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swapped = true;
                }
            }
        }

        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i: arr) {
            System.out.println(i);
        }
    }
}
