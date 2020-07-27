public class Main {
    public static void main(String[] args) {

        int myInt = 10;
        int anotherInt = myInt;

        System.out.println("myInt " + myInt);
        System.out.println("anotherInt " + anotherInt);

        anotherInt++;

        System.out.println("myInt " + myInt);
        System.out.println("anotherInt " + anotherInt);

        int[] myArr = { 1, 2, 3, 4, 5 };
        int[] anotherIntArr = myArr;

        anotherIntArr[2] = 10;

        for (int i: myArr) {
            System.out.println(i);
        }
    }
}
