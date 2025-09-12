package revise.threadclass;

public class Main {

    public static void main(String[] args) {

        ThreadA threadA = new ThreadA();
        System.out.println("starting main method");
        threadA.start();
        System.out.println("ending main method");
    }
}
