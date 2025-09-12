package revise.runnable.sync.solution;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        TestThread thread1 = new TestThread(counter);
        TestThread thread2 = new TestThread(counter);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("count : "+counter.getCounter());
    }
}
