package HomeWork1;//Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
//        Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.


public class SimpleNums {

    public static void main(String[] args) {
        for (int i = 2; i <= 100 ; i++) {
            boolean isSimple = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    isSimple = false;
                }
            }
            if (isSimple){
                System.out.print(i + " ");
            }
        }
    }

}
