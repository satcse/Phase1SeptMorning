class MyOwnException extends Exception
{
    String str1;
    MyOwnException(String str2)
    {
        str1 = str2;
    }
    public String toString()
    {
        return("MyOwnException Occurred: "+str1);
    }
}
public class ExceptionHandlersDemo {
    public static void main(String[] args) {
        try
        {
            System.out.println("Starting of try block");
            //Some Business Exception Occurred here...
            throw new MyOwnException("This is my Custom Error Message");
        }catch(MyOwnException e)
        {
            System.out.println("Catch Block Started");
            System.out.println(e); //Calls the Class's toString Implementation(Line No:8)
        }
    }
}
