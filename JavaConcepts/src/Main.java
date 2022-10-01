public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] array= new int[3];

        try
        {
            //Create and Initialize all the resources here.
            array[2] = 3;
        }catch(ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException | ArrayStoreException e)
        {
            System.out.println("Array index is out of bounds!"+ e.getMessage());
        }
        finally
        {
            // To clean up all the resources which we've initialized in try block.
            System.out.println("The array is of size: "+array.length);
        }


    }
}
