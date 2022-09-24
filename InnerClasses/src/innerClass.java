public class innerClass {

    private String msg="Welcome to Java";

    class Inner
    {
        int xyz = 100;
        void hello()
        {
            System.out.println(msg+", Let's start learning Inner Classes");
        }
    }
    public static void main(String[] args) {

        System.out.println("Hello World!");
        innerClass outerClass = new innerClass();
        innerClass.Inner innerClass = outerClass.new Inner();
        innerClass.hello();
        System.out.println("Inner class data for xyz: "+innerClass.xyz);
    }
}
