interface First
{
    default void show()
    {
        System.out.println("Default first");
    }
}
interface Second
{
    default void show()
    {
        System.out.println("Default second");
    }
}
public class DiamondProblemDemo implements First, Second{

    public void show()
    {
        First.super.show();//Invoke Line No:3
        Second.super.show();//Invoke Line No:10
    }

    public static void main(String[] args) {
        DiamondProblemDemo ob = new DiamondProblemDemo();
        ob.show();//Invoke Line No:17
    }

}
