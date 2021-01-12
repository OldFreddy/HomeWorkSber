package HomeWork1;//Дан массив целых чисел и ещё одно целое число.
// Удалите все вхождения этого числа из массива
// (пропусков быть не должно).


import java.util.Arrays;

public class DeleteElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 4, 5};
        int deleteNum = 3;
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != deleteNum) {

                array[i - count] = array[i];
                System.out.print(array[i] + " ");
            } else if (array[i] == deleteNum) {
                count++;

            }
        }

        int[] newArray;
        newArray = Arrays.copyOf(array,array.length-count);
        System.out.println();
        System.out.println(Arrays.toString(newArray));


    }
//
}
