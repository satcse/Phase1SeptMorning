public class ThrowsExceptionDemo {
    void Division() throws ArithmeticException
    {
        int a=45,b=5,rs=0;


        rs=a/b;
        System.out.println("\n\t The result is: +rs");
    }

    public static void main(String[] args) {
        ThrowsExceptionDemo T = new ThrowsExceptionDemo();
        try
        {
            T.Division();
        }catch(ArithmeticException e)
        {
            e.printStackTrace();
        }finally
        {
            System.out.println("Inside Finally block...");
        }
    }
}
