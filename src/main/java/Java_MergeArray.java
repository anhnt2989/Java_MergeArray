import java.util.Scanner;

public class Java_MergeArray {
    public static void main(String[] args) {
        int size1, size2, size3;
        int[] array1, array2, array3;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of array 1: ");
        size1 = input.nextInt();
        System.out.println("Enter size of array 2: ");
        size2 = input.nextInt();
        size3 = size1 + size2;

        array1 = new int[size1];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Enter value of element " + (i + 1) + " in array 1: ");
            array1[i] = input.nextInt();
        }

        array2 = new int[size2];
        for (int j = 0; j < array2.length; j++) {
            System.out.println("Enter value of element " + (j + 1) + " in array 2: ");
            array2[j] = input.nextInt();
        }
        array3 = new int[size3];

        System.arraycopy(array1, 0, array3, 0, array1.length);
        System.arraycopy(array2, 0, array3, array1.length, array2.length);
        System.out.println("Array 3 is: ");
        for (int value : array3) {
            System.out.print(value + "\t");
        }
    }
}
