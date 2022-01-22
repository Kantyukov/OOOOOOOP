package ru.artem.kantukov.mapPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMapPractice {
    public static void main(String[] args) {
        // 0
        Map<Person, String> fruitsStore = new HashMap<>();
        Person marina = new Person("Marina");
        Person ivan = new Person("Ivan");
        Person artem = new Person("Artem");
        Person ruslan = new Person("Ruslan");
        Person olga = new Person("Olga");

        //1
        Map<Person, String> fruitsStoreVer1 = new HashMap<>();
        System.out.println("---------- 1 ------------");
        fruitsStore.put(marina, "Apple");
        fruitsStore.put(ivan, "Banana");
        fruitsStore.put(artem, "Orange");
        fruitsStore.put(ruslan, "Papaya");
        fruitsStore.put(olga, "Melon");

        fruitsStoreVer1.putAll(fruitsStore);
        System.out.println("fruitsStoreVer1.entrySet() = " + fruitsStoreVer1.entrySet());

        System.out.println("---------- 2 ------------");
        System.out.println("fruitsStore.get(artem) = " + fruitsStore.get(artem));

        //3
        System.out.println("---------- 3 ------------");
        System.out.println("fruitsStore.remove(olga) = " + fruitsStore.remove(olga));
        //4
        System.out.println("---------- 4 ------------");
        System.out.println("fruitsStore.containsKey(artem) = " + fruitsStore.containsKey(artem));
        System.out.println("fruitsStore.containsValue(\"Orange\") = " + fruitsStore.containsValue("Orange"));
        // 5
        System.out.println("---------- 5 ------------");
        for (Map.Entry<Person, String> pair : fruitsStore.entrySet()){
            Person key = pair.getKey();
            System.out.println("key = " + key);
            String value = pair.getValue();
            System.out.println("value = " + value);
        }
        System.out.println("fruitsStore.entrySet() = " + fruitsStore.entrySet());
    }
}
