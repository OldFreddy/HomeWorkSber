package HomeWork1;//Задача:
//
//        Заполните массив случайным числами и выведете максимальное,
//        минимальное и среднее значение.
//

public class MinMaxMiddle {
    public static void main(String[] args) {
        int size = 20;
        double[] arr = new double[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random() * 100;
//            System.out.println((int)arr[i]);
        }
        double min = arr[0];
        double max = arr[0];
        double mid = 0;


        for (double v : arr) {
            if (v < min) {
                min = v;
            }

            if (v > max) {
                max = v;
            }

            mid = mid + v / arr.length;

        }

        System.out.println("Минимальный элемент равен " + min);
        System.out.println("Максимальный элемент равен " + max);
        System.out.println("Среднее значение всех элементов массива равно " + mid);
    }
}
