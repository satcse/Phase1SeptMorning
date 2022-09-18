import java.util.Scanner;

public class overloadMethod {

    overloadMethod()
    {
        System.out.println("Inside Constructor...");
    }
    public void area(int b, int h)
    {
        System.out.println("Area of traingle: "+(0.5*b*h));
    }

    public void area(int r)
    {
        System.out.println("Area of Circle: "+(Math.PI*r*r));
    }

    public static void main(String args[])
    {
        overloadMethod ob = new overloadMethod();
        ob.area(10,12);
        System.out.println("Please enter the radius: ");
        Scanner input = new Scanner(System.in);
        ob.area(Integer.parseInt(input.nextLine()));
    }
}
