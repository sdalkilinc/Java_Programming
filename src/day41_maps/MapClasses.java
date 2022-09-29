package day41_maps;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>(); //random order, accept null key & null values, (last one will be printed out)
        hashMap.put("Daniel", 95000);
        hashMap.put("Emily", 100000);
        hashMap.put("Bella", 85000);
        hashMap.put("Arron", 78000);
        hashMap.put("Chris", null);
        hashMap.put("Breanna", null);
        hashMap.put(null, 12000);
        hashMap.put(null, 11000);
        hashMap.put(null, 10000);


        System.out.println("hashMap = " + hashMap);

        System.out.println("----------------------------------------------------------------------");

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(); //insertion order, accepts null key & null values
        linkedHashMap.put("Daniel", 95000);
        linkedHashMap.put("Emily", 100000);
        linkedHashMap.put("Bella", 85000);
        linkedHashMap.put("Arron", 78000);
        linkedHashMap.put("Chris", null);
        linkedHashMap.put("Breanna", null);
        linkedHashMap.put(null, 12000);
        linkedHashMap.put(null, 11000);
        linkedHashMap.put(null, 10000);

        System.out.println("linkedHashMap = " + linkedHashMap);

        System.out.println("----------------------------------------------------------------------");

        Map<String, Integer> treeMap = new TreeMap<>(); //sorted order, does not accept null key, accepts null values
        treeMap.put("Daniel", 95000);
        treeMap.put("Emily", 100000);
        treeMap.put("Bella", 85000);
        treeMap.put("Arron", 78000);
        treeMap.put("Chris", null);
        treeMap.put("Breanna", null); //value can be null in treeMap
        // treeMap.put(null, 12000); key can not be null in treeMap
        // treeMap.put(null, 11000);
        // treeMap.put(null, 10000);

        System.out.println("treeMap = " + treeMap);

        System.out.println("----------------------------------------------------------------------");


        Map<String, Integer> hashtable = new Hashtable<>(); //random order, does not accept null key  & null values, Synchronized
        hashtable.put("Daniel", 95000);
        hashtable.put("Emily", 100000);
        hashtable.put("Bella", 85000);
        hashtable.put("Arron", 78000);
        // hashtable.put("Chris", null); //value in hashtable can not be null
        // hashtable.put("Breanna", null); //value in hashtable can not be null
        // hashtable.put(null, 12000); //key in hashtable can not be null
        // hashtable.put(null, 11000); //key in hashtable can not be null
        // hashtable.put(null, 10000); //key in hashtable can not be null

        try {
            hashtable.put(null, 10000);
        } catch (RuntimeException e){
            e.printStackTrace();
        }


        System.out.println("hashtable = " + hashtable);



    }
}

/*
pair: name & salary
Daniel = 95000
Emily = 100000
Bella = 85000
 */