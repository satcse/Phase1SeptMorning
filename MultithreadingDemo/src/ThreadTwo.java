public class ThreadTwo implements Runnable{

    public static int myCount=0;
    public ThreadTwo()
    {}

    // Multi Threading Usage - Large Batch Processing, Big Data processing, Concurrent Systems, Parallel Multi-core Processing

    public void run()
    {
        while(ThreadTwo.myCount <= 10)
        {
            try
            {
                System.out.println("Expl Thread: "+ (++ThreadTwo.myCount));
                Thread.sleep(50);
            }catch (InterruptedException e)
            {
                System.out.println("Exception in Thread: "+e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Starting Main Thread...");
        ThreadTwo mrt = new ThreadTwo();
        Thread t = new Thread(mrt);
        t.start();

        while(ThreadTwo.myCount <= 10)
        {
            try
            {
                System.out.println("Main Thread: "+ (++ThreadTwo.myCount));
                Thread.sleep(50); // This will move thread to Waiting State/ Blocked state
            }catch (InterruptedException e)
            {
                System.out.println("Exception in Thread: "+e.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }
}
