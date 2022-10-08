class Sum
{
    public int sum(int x, int y)
    {
        return x+y;
    }

    public int sum(int x, int y, int z)
    {
        return x+y+z;
    }

    public double sum(double x, double y)
    {
        return x+y;
    }
}
//Polymorphism - Method Overloading ( 1 Method - Multiple forms)

public class PolymorphismDemo {
    public static void main(String[] args) {
        Sum s=new Sum();
        System.out.println(s.sum(10,20)); // 10+20=30
        System.out.println(s.sum(10,20,30));
        System.out.println(s.sum(10.51,20.30));
    }
}
