import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        // Int array of length 10
//        int[] myIntArray = new int[20]; // { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//
//        for (int i = 0; i < myIntArray.length; i++) {
//            myIntArray[i] = i * 10;
//        }
//        printArray(myIntArray);
        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        System.out.println("The average or all values in array is: " + getAverage(myIntegers));
    }

    public static int[] getIntegers(int amount) {
        System.out.println("Enter " + amount + " integer values: \r");
        int[] values = new int[amount];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] arr) {
        for (int i: arr) {
            System.out.println(i);
        }
    }

    public static double getAverage(int[] arr) {
        int sum = 0;
        for (int i: arr) {
            sum += i;
        }
        return (double) sum / (double) arr.length;
    }
}
