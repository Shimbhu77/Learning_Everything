package revise.runnable.sync;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        TestThread thread1 = new TestThread(counter);
        TestThread thread2 = new TestThread(counter);

        thread1.start();
        thread2.start();

        // both t1 and t2 running parallel and main thread is waiting for them
        thread1.join();
        thread2.join();

        System.out.println("count : "+counter.getCounter());
    }
}
