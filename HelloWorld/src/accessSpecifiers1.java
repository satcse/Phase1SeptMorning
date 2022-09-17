class defAccessSpecifier
{
    int xyz = 1000;
    void display()
    {
        System.out.println("You are using default access specifier");
    }
}

public class accessSpecifiers1 {

    public static void main(String[] args) {
        System.out.println("Default Access Specifier");
        defAccessSpecifier obj = new defAccessSpecifier();

        System.out.println("Data in xyz: "+obj.xyz);
        obj.display();
    }
}
