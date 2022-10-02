class Encapsulate
{
    private String Name;
    private int Roll;
    private int Age;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getRoll() {
        return Roll;
    }

    public void setRoll(int roll) {
        Roll = roll;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "Encapsulate{" +
                "Name='" + Name + '\'' +
                ", Roll=" + Roll +
                ", Age=" + Age +
                '}';
    }
}
public class EncapsulationDemo {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        obj.setName("Harsha");
        obj.setAge(19);
        obj.setRoll(12);
        System.out.println(obj.toString());
    }

}
