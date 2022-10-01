public class ManualExceptionDemo {

    public static void main(String[] args) {
        int a=45,b=0,rs;
        try
        {
            if(b==0)
                throw(new ArithmeticException("Can't divide by Zero."));
            else
            {
                rs = a/b;
                System.out.println("\n The Result is: "+rs);
            }
        }catch(ArithmeticException e)
        {
            //System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
