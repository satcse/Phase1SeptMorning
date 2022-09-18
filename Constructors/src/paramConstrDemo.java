class Std
{
    int id;
    String name;

    Std(int i, String n)
    {
        id=i;
        name=n;
    }

    void display()
    {
        System.out.println(id+" "+name);
    }
}
public class paramConstrDemo {
    public static void main(String[] args) {
        Std obj = new Std(2,"Alex");
        Std obj2 = new Std(10,"Raj");
        Std obj3 = new Std(10,"Annie");

        obj.display();
        obj2.display();
        obj3.display();
    }
}
