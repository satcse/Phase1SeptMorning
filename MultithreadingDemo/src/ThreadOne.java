public class ThreadOne extends Thread{

    public void run()
    {
        System.out.println("Thread Started running...");
    }
    public static void main(String[] args) {
        ThreadOne mt = new ThreadOne(); // mt Object is created and mt Thread is also created.
        mt.start(); // This Start method will do Thread setup and it calls run() method.

        System.out.println("Hello World!");
    }
}
