package revise.runnable;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable1 = new ThreadB();

        Thread thread1 = new Thread(runnable1);

        Runnable  runnable2= new ThreadC();

        Thread thread2 = new Thread(runnable2);

        System.out.println("starting main thread.");

        thread1.start();
        thread1.join();
        thread2.start();
        System.out.println("ending the main thread.");
    }
}
