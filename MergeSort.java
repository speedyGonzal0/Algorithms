import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {

        int[] a = new int[100];

        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(1000);
        }

        System.out.println(Arrays.toString(a));
        mergeSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void mergeSort(int[] array) {

        if (array.length < 2) {
            return;
        }

        int midIdx = array.length / 2;

        int[] leftArray = new int[midIdx];
        int[] rightArray = new int[array.length - midIdx];

        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = array[i];
        }

        for (int i = 0; i < rightArray.length; i++) {
            rightArray[i] = array[i + midIdx];
        }

        mergeSort(leftArray);
        mergeSort(rightArray);

        merge(array, leftArray, rightArray);

    }

    public static void merge(int[] mainArray, int[] leftArray, int[] rightArray) {

        int i = 0, j = 0, k = 0;

        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                mainArray[k] = leftArray[i];
                i++;
            } else {
                mainArray[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < leftArray.length) {
            mainArray[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightArray.length) {
            mainArray[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
