import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

    public static void main(String[] args) {

        int[] a = new int[30];

        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(1000);
        }

        System.out.println(Arrays.toString(a));
        selectionSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void selectionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int minIdx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIdx];
            array[minIdx] = temp;
        }
    }
}
