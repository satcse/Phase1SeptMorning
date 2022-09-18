import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {

        //Creating an ArrayList
        System.out.println("ArrayList");
        ArrayList<String> city = new ArrayList<>();
        city.add("Bengaluru");
        city.add("Delhi");
        city.add("Chennai");
        System.out.println(city);

        //Creating a Vector
        System.out.println("\n");
        System.out.println("Vector");
        Vector<Integer> vec = new Vector<>();
        vec.addElement(15);
        vec.addElement(30);
        System.out.println(vec);

        //Creating a LinkedList
        System.out.println("\n");
        System.out.println("Linked List");
        LinkedList<String> names = new LinkedList<>();
        names.add("Alex");
        names.add("John");
        Iterator<String> itr = names.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        //Creating a Hashset
        System.out.println("\n");
        System.out.println("Hash Set");
        HashSet<Integer> set = new HashSet<>();
        set.add(101);
        set.add(102);
        set.add(103);
        set.add(104);
        set.add(105);
        System.out.println(set);

        //Creating a LinkedHashset
        System.out.println("\n");
        System.out.println("Hash Set");
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
        set2.add(124);
        set2.add(125);
        set2.add(127);
        set2.add(128);
        set2.add(126);
        System.out.println(set2);

    }
}
