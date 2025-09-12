package revise.runnable.lambdaexpression;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // using lambda expression
        Runnable runnable1 = () -> System.out.println("Hello thread1 here");

        Thread threadTest1 = new Thread(runnable1);

        // using lambda expression with more shortcut

        Thread thread1 = new Thread(() -> System.out.println("hello thread1 here."));
        Thread thread2 = new Thread(() -> System.out.println("hello thread2 here."));

        System.out.println("starting main thread.");

        thread1.start();
        thread1.join();
        thread2.start();
        System.out.println("ending the main thread.");
    }
}
