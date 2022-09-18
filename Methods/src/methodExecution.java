public class methodExecution {

    public int multiplynumbers(int a, int b)
    {
        int z=a*b;
        return z;
    }

    public static void main(String[] args) {
        methodExecution methodExecutionObj = new methodExecution();
        int ans = methodExecutionObj.multiplynumbers(10,3);
        System.out.println("Multiplication result is: "+ans);
    }
}
