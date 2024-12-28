package com.shimbhu.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.HashMap;

public class HashMapImpl {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        Map<String,Integer> orderedMap = new LinkedHashMap<>();

        map.put("Shimbhu Kumawat", 22);
        map.put("Payal Kumawat", 22);
        map.put("Pooja Kumawat", 22);

        // iterating on the map using entry

        System.out.println("iterating on the map using entry");

        for(Map.Entry<String,Integer> entry : map.entrySet())
        {
            System.out.println("key: "+entry.getKey()+" , value: "+entry.getValue());
        }

        // iterating on the keys

        System.out.println("iterating on the keys");

        for(String key : map.keySet())
        {
            System.out.println("key : "+key+" , value :  "+map.get(key));
        }

        // iterating on the values

        System.out.println("iterating on the values");

        for(Integer value : map.values())
        {
            System.out.println("value : "+value);
        }

        // iterating on the map using lambda expression

        System.out.println("iterating on the map using lambda expression");

        map.forEach((key,value)->{
            System.out.println("key : "+key+" , value : "+value);
        });
        
    }
}