package com.shimbhu.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapImpl {

    /**
     * The main method demonstrates how to use four different kinds of maps: {@link java.util.HashMap},
     * {@link java.util.LinkedHashMap}, {@link java.util.TreeMap}, and {@link java.util.Hashtable}.
     * The example shows how to create each of the maps and add some entries to them.
     * Finally, it prints out the contents of the maps.
     *
     * @param args ignored
     */

    public static void main(String[] args) {
        // HashMap example
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Alice", 30);
        hashMap.put("Bob", 25);
        hashMap.put("Charlie", 35);
        System.out.println("HashMap: " + hashMap);

        // LinkedHashMap example
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Alice", 30);
        linkedHashMap.put("Bob", 25);
        linkedHashMap.put("Charlie", 35);
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // TreeMap example
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Alice", 30);
        treeMap.put("Bob", 25);
        treeMap.put("Charlie", 35);
        System.out.println("TreeMap: " + treeMap);

        // Hashtable example
        Map<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("Alice", 30);
        hashtable.put("Bob", 25);
        hashtable.put("Charlie", 35);
        System.out.println("Hashtable: " + hashtable);
    }
    
}
