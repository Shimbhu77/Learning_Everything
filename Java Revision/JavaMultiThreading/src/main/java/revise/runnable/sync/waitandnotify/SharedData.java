package revise.runnable.sync.waitandnotify;

public class SharedData {

    int data;
    boolean hasData = false;

    public synchronized void produce(int value) throws InterruptedException {

        while (hasData) {
            wait();
        }

        this.data = value;

        hasData = true;

        System.out.println("Produced data : " + data);

        notify();
    }

    public synchronized void consume() throws InterruptedException {

        while (!hasData) {
            wait();
        }

        hasData = false;

        System.out.println("Consumed data : " + data);

        notify();
    }

}
