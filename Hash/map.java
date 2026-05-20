package Hash;

import java.util.HashMap;
import java.util.Map;

public class map {
    static void HashMapMethods() {
        // syntax
        Map<String, Integer> mp = new HashMap<>();
        // adding el
        mp.put("Anuj", 100);
        mp.put("BRS", 1);
        mp.put("Nischal", 2);
        mp.put("Jash", 40);

        // getting value of key from hashmap
        System.out.println(mp.get("Anuj")); // 100
        System.out.println(mp.get("Mukesh")); // null

        // updating value of key in hashmap
        mp.put("BRS", 15);
        System.out.println(mp.get("BRS"));

        // removing pair from a hashmap
        System.out.println(mp.remove("Jash")); // 40
        System.out.println(mp.remove("Mukesh")); // null

        // checking if key is in map or not
        System.out.println(mp.containsKey("Mukesh")); // false
        System.out.println(mp.containsKey("Anuj")); // true

        // add a new entry only if new key doen't exist already
        mp.putIfAbsent("Jash", 20); // no entry
        mp.putIfAbsent("Jiya", 10); // entry

        // get all keys in the map
        System.out.println(mp.keySet());

        // get all values in the map
        System.out.println(mp.values());

        // get all entries in the map
        System.out.println(mp.entrySet());

        // traversing all entries of map
        for (String key : mp.keySet()) System.out.printf("Age of %s is %d.\n", key, mp.get(key));
        System.out.println();
        for (Map.Entry<String, Integer> e : mp.entrySet())
            System.out.printf("Age of %s is %d.\n", e.getKey(), e.getValue());
        System.out.println();
        for (var e : mp.entrySet())
            System.out.printf("Age of %s is %d.\n", e.getKey(), e.getValue());
    }

    public static void main(String[] args) {
        HashMapMethods();
    }
}
