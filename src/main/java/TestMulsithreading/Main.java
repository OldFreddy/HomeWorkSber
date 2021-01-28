package TestMulsithreading;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        //
        myThread.interrupt();
        myThread.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("thread main");

    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("thread 0");
    }

}


