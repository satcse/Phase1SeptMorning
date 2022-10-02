class MyException extends Exception{
    public MyException(String s)
    {
        super(s);// This will call the super class's constructor and pass the string s.
    }
}
public class CustomExceptionsDemo {
    public static void main(String[] args) {
        try
        {
            //Assume some Business errors happen
            throw new MyException("Business Error Happened...");
        }catch(MyException e)
        {
            System.out.println("Caught the Business Exception...");
            e.printStackTrace();
        }
    }
}
