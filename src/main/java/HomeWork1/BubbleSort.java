package HomeWork1;

public class BubbleSort {
    public static void main(String[] args) {
        int[] unsortedArray = {5,4,5,4,6,5,7,3,21,24,35,923,2, 398, 82, 2, 4, 3};
        int[] sortedArray = toSortArray(unsortedArray);

        for (int item : sortedArray) {
            System.out.print(item + " ");
        }
    }

    public static int[] toSortArray(int[] arr) {
        boolean isSorted = false;
        int buffer;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;
                    buffer = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buffer;

                }
            }
        }


        return arr;
    }


}
