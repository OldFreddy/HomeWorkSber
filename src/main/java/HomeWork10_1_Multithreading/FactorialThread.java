package HomeWork10_1_Multithreading;

public class FactorialThread extends Thread {

    Long num;


    public FactorialThread(Long num) {
        this.num = num;
    }

    @Override
    public void run() {
        Long factorial = getFactorial(num);
        System.out.println("Факториал числа " + num + " = " + factorial);
    }


    public Long getFactorial(Long n) {
        long result = 1L;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }


}
