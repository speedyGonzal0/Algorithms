import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {

        int[] a = new int[10];

        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(1000);
        }

        System.out.println(Arrays.toString(a));
        insertionSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {

            int temp = array[i];

            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = temp;
        }
    }
}
