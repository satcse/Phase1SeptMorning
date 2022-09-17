class priaccessspecifier
{
    private void display()
    {
        System.out.println("You are using Private Access Modifier");
    }
}
public class accessSpecifiers2 {
    public static void main(String[] args) {
        System.out.println("Private Access Specifier");
        priaccessspecifier obj = new priaccessspecifier();
       // obj.display();
    }
}
