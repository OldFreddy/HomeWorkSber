package HomeWork1;

public class binarySearch {

    public static void main(String[] args) {
        int[] array = {4, 5, 7, 8, 10};

        System.out.println( "Позиция искомого элемента = " + binarySearch(array, 10));


    }

    public static int binarySearch(int[] arr, int elem) {
        int index = -1;
        int middle;
        int min = 0;
        int max = arr.length - 1;

        while (min <= max) {
            middle = (min + max) / 2;

            if (arr[middle] < elem) {
                min = middle + 1;
            } else if (arr[middle] > elem) {
                max = middle - 1;
            } else if (arr[middle] == elem) {
                index = middle;
                break;
            }
        }


        return index;
    }
}
