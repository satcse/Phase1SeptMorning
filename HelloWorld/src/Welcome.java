public class Welcome {

    public static void main(String[] args) {
        System.out.println("First Phase of Full Stack Developer Program - Simplilearn!");

        // a,b,c,d are all variables.
        int a = 10, b = 20;
        int c; // Variable Declaration
        int d=0;// Variable Declaration + Initialization

        a= 50;
        a= 100; // a - 10 --> 50 --> 100

        c=a+b;
        System.out.println("The Addition Output: "+c);
        System.out.println("Calling demo method...");
        demo(); // Method Invocation.
    }

    //Method Definition
    private static void demo() // Method Signature
    {
        System.out.println("Inside the demo method");
    }
}
//Core Java Program - Main method is mandatory.
//Execution starts from Main method.
//JDK - Java Development Kit - Java Core Libraries + Java Development Frameworks + Dependencies + JRE
//JRE - Java Engine which actually runs the Java programs.
//Compiler - Welcome.java ---> Welcome.class(bytecode)
//Intrepretor - Welcome.class ---> Welcome (Execution)
//Java - WORA (Write Once Run Anywhere) - Platform Independence
// Welcome.java in Windows 10
//Run this Welcome in Linux, Windows Version, MAC, Solaris, Amazon Linux
//95% of Java projects (Desktop, Web, Mobile) - Deployed in Linux Servers!
// Welcome.java(java) ---> Compiler(Windows, Linux, MAC) ---> Welcome.class(bytecode)
//Welcome.class(bytecode) - Intrepretor- readable and understandable by the JVM in all OS.