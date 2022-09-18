public class callMethod {

    int val=150;

    int operation(int val)
    {
        this.val = val*10/100; // 100*10/100 = 10
        return val;
    }

    public static void main(String[] args) {
        callMethod c = new callMethod();
        System.out.println("Before operation value of data is: "+c.val);
        c.operation(100);
        System.out.println("After operation value of data is: "+c.val);
    }
}
