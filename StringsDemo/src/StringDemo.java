public class StringDemo {

    public static void main(String[] args) {

        System.out.println("Methods of Strings");

        String sl = new String("Hello World");
        System.out.println(sl.length());

        //Substring
        String sub = new String("Welcome");
        System.out.println(sub.substring(2));
        System.out.println(sub.substring(0,2));//We

        //String Comparison
        String s1="Heldo"; //12+50+23+23+57 = 12351
        String s2="Hello"; //12564
        System.out.println(s1.compareTo(s2));// if s1==s2 --> 0 ; s1>s2 --> Positive Number; s1<s2 --> Negative number

        //IsEmpty
        String s4="";
        System.out.println(s4.isEmpty());

        //toLowerCase
        String s5="Hello";
        System.out.println(s5.toLowerCase());

        //replace
        String s6="Heldo";
        String replace=s2.replace('d','l');
        System.out.println(replace);

        //equals
        String x="Welcome to Java";
        String y="WeLcOmE tO JaVa";
        System.out.println(x.equals(y));

        //String Buffer Demo
        System.out.println("\n");
        System.out.println("Creating a StringBuffer");

        //Creating a String Buffer and Append data
        StringBuffer s = new StringBuffer("Welcome to Java");
        s.append("Enjoy your learning");
        System.out.println(s);

        //Insert Method
        s.insert(0,'w');
        System.out.println(s);

        //Replace Method
        StringBuffer sb = new StringBuffer("Hello");
        sb.replace(0,2,"hEl");
        System.out.println(sb);

        //Delete Method
        sb.delete(0,1);
        System.out.println(sb);

        //StringBuilder Demo
        System.out.println("\n");
        System.out.println("Creating String Builder");
        StringBuilder sb1 = new StringBuilder("Happy");
        sb1.append(" Learning");
        System.out.println(sb1);

        System.out.println(sb1.delete(0,1));

        System.out.println(sb1.insert(1,"Welcome"));
        System.out.println(sb1.reverse());

        //Conversion from String Object to String Buffer
        String str="Hello";
        StringBuffer sbr= new StringBuffer(str);
        sbr.reverse();
        System.out.println("String to StringBuffer: ");
        System.out.println(sbr);

        //Conversion from String Object to String Builder
        StringBuilder sbl = new StringBuilder(str);
        sbl.append("world");
        System.out.println("String to StringBuilder: ");
        System.out.println(sbl);


    }
}
