// Abstract class can have only Abstract methods .
// Abstract class and method will Only have the Declaration.
// We CANNOT create an object for abstract class.

abstract class AnonymousInnerClass
{
    public abstract void display();
}

abstract class AnonymousInnerClass2
{
    public abstract void display();
}

public class innerClassAnon {
    public static void main(String[] args) {
       AnonymousInnerClass i = new AnonymousInnerClass(){
           @Override
           public void display() {
               System.out.println("Inside display method of Anonymous Inner Class");
           }
       };
        i.display();

        //Abstract Class 2
        AnonymousInnerClass2 i2 = new AnonymousInnerClass2() {
            @Override
            public void display() {
                System.out.println("Inside display method of Anonymous Inner Class2.............");
            }
        };
        i2.display();
        }
    }

