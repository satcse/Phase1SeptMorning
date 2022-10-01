class Sender
{
    public void send(String msg)
    {
        System.out.println("Sending\t"+msg);
        try
        {
            Thread.sleep(1000);
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("\n"+msg+" Sent");
    }
}
class ThreadedSent extends Thread
{
    private String msg;
    //private Thread t;
    Sender sender;
    ThreadedSent(String m, Sender obj)
    {
        msg = m;
        sender = obj;
    }

    public void run()
    {
        synchronized (sender) // T1 first acquires this lock. Later T2 will acquire this lock
        {
            sender.send(msg);
        }
    }
}
public class ThreadSyncDemo {
    public static void main(String[] args) {
        Sender sndObject = new Sender(); // Creates a Sender Object  - shared variable
        ThreadedSent T1 = new ThreadedSent("Hi",sndObject); // Thread No:1
        ThreadedSent T2 = new ThreadedSent("Bye",sndObject);// Thread No:2
        T1.start(); // T1 Starts and sends the Hi Message.
        T2.start(); // T2 Starts and sends the Bye Message.
        try
        {
            T1.join(); // T1 will wait until T2 finishes the job
            T2.join(); // T2 will wait until T1 finishes the job
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
