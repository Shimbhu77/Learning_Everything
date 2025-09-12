package revise.runnable.sync;

public class TestThread extends Thread{
    private Counter counter;

    public TestThread(Counter counter)
    {
        this.counter = counter;
    }

    @Override
    public void run()
    {
        // use large for wrong results
        for(int i=0;i<=1000;i++)
        {
            System.out.println("running thread : "+Thread.currentThread().getName());
            counter.increment();
        }
    }
}
