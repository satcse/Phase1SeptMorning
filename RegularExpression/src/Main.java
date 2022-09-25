import java.util.regex.*;


public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        String pattern="[a-z]+";
        String data="Regular Expressions";

        Pattern p = Pattern.compile(pattern);
        Matcher c = p.matcher(data);

        while(c.find())
        {
            System.out.println(c.start()+"::"+c.end());
            System.out.println(data.substring(c.start(),c.end()));
        }

    }
}
