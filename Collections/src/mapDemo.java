import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class mapDemo {
    public static void main(String[] args) {

        //Hashmap - Faster, Lighter, Non-synchronized, , CANNOT be used in Multithreaded Environments
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1,"Tim");
        hm.put(3,"catie");
        hm.put(2,"mary");
        System.out.println("\n The elements of hashmap are:");
        for(Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }

        //HashTable - Heavier, Slower, Synchronized, can be used in Multithreaded Environments
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(4,"Ales");
        ht.put(5,"Rosy");
        ht.put(6,"Jack");
        ht.put(7,"John");
        System.out.println("\n The elements of hashmap are:");
        for(Map.Entry m:ht.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }

        //TreeMap - Ordering, Faster, Lighter, Non-synchronized, , CANNOT be used in Multithreaded Environments
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(18,"Annie");
        map.put(9,"Carlotte");
        map.put(1,"catie");
        System.out.println("\nThe elements of TreeMap are ");
        for(Map.Entry l:map.entrySet()){
            System.out.println(l.getKey()+" "+l.getValue());
        }



    }
}
