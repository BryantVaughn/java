import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] myArr = { 12, 9, 30, 15, 70, 99, 101 };
        System.out.println("Array = " + Arrays.toString(myArr));
        reverse(myArr);
        System.out.println("Array = " + Arrays.toString(myArr));
    }

    public static void reverse(int[] arr) {
        int len = arr.length;
        int temp;
        for (int i = 0; i < len/2; i++) {
            temp = arr[i];
            arr[i] = arr[(len - 1) - i];
            arr[(len - 1) - i] = temp;
        }
    }
}
