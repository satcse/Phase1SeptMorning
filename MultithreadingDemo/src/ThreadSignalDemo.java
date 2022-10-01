public class ThreadSignalDemo {

    private static Object sharedVariable = new Object(); // Shared Variable

    public static void main(String[] args) throws InterruptedException {
      //  Thread.sleep(1000);
        System.out.println("Thread "+Thread.currentThread().getName()+" is woken after sleeping for 1 second");
        synchronized (sharedVariable) // Acquire the Lock for the sharedVariable - Main Thread
        {
            sharedVariable.wait(1000);
            System.out.println("Object "+sharedVariable+" is woken after waiting for 1 second");
        }
    }
}
