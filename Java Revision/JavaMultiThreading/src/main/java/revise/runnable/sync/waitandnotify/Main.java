package revise.runnable.sync.waitandnotify;

public class Main {

    public static void main(String[] args) {

        SharedData sharedData = new SharedData();

        Thread producer = new Thread(() ->{

            for(int i=1;i<=10;i++)
            {
                try {
                    // sleep method pauses only current thread and other threads runs parallel
                    Thread.sleep(1000);
                    sharedData.produce(i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread consumer = new Thread(() ->{

            for(int i=1;i<=10;i++)
            {
                try {
                    Thread.sleep(2000);
                    sharedData.consume();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        producer.start();
        consumer.start();

    }
}
