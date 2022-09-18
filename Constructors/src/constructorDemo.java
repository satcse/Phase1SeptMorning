class EmpInfo{
    int id;
    String name;

    void display()
    {
        System.out.println(id+" "+name);
    }

    EmpInfo()
    {
        System.out.println("Inside Contructor...");
        this.id=1;
        this.name="Name";
    }
}

public class constructorDemo {

    public static void main(String[] args) {
        EmpInfo emp1=new EmpInfo();
        EmpInfo emp2=new EmpInfo();

        emp1.display();
        emp2.display();
    }

}
