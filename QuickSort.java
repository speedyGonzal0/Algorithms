import java.util.Arrays;
import java.util.Random;

public class QuickSort {

    public static void main(String[] args) {

        int[] a = new int[10];

        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(1000);
        }

        System.out.println(Arrays.toString(a));
        quicksort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    public static void quicksort(int[] array, int lowIdx, int highIdx) {

        if (lowIdx >= highIdx){
            return;
        }

        int pivotIdx = new Random().nextInt(highIdx - lowIdx) + lowIdx;
        swap(array, pivotIdx, highIdx);

        int leftPointer = partition(array, lowIdx, highIdx);

        quicksort(array, lowIdx, leftPointer - 1);
        quicksort(array, leftPointer + 1, highIdx);

    }

    private static int partition(int[] array, int lowIdx, int highIdx) {
        int leftPointer = lowIdx;
        int rightPointer = highIdx - 1;

        while (leftPointer < rightPointer) {

            while (array[leftPointer] <= array[highIdx] && leftPointer < rightPointer) {
                leftPointer++;
            }

            while (array[rightPointer] >= array[highIdx] && rightPointer > leftPointer){
                rightPointer--;
            }

            swap(array, leftPointer, rightPointer);
        }

        if(array[leftPointer] > array[highIdx]) {
            swap(array, leftPointer, highIdx);
        }
        else {
            leftPointer = highIdx;
        }

        return leftPointer;
    }

    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
