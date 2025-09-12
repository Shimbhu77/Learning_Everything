package revise.threadclass;

public class ThreadA extends Thread{

    @Override
    public void run() {

        System.out.println("running ThreadA");

        for(int i=0;i<=10;i++)
        {
            System.out.println("Thread A : "+ i);
        }

        System.out.println("ending ThreadA");
    }
}
