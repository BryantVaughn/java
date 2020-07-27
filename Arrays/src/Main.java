public class Main {
    public static void main(String[] args) {
        // Int array of length 10
        int[] myIntArray = new int[20]; // { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i * 10;
        }
        for (int j: myIntArray) {
            System.out.println("Element " + (j/10) + ", value is " + j);
        }
    }
}
