package ru.artem.kantukov.mapPractice;

import ru.artem.kantukov.collectionPractice.Book;

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
        Person artemOld = new Person("Artem");

        //1
        Map<Person, String> fruitsStoreVer1 = new HashMap<>();
        System.out.println("---------- 1 ------------");
        fruitsStore.put(marina, "Apple");
        fruitsStore.put(ivan, "Banana");
        fruitsStore.put(artem, "Orange");
        fruitsStore.put(ruslan, "Papaya");
        fruitsStore.put(olga, "Melon");
        fruitsStore.put(artemOld, "APPLE");

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
        for (Map.Entry<Person, String> pair : fruitsStore.entrySet()) {
            Person key = pair.getKey();
            System.out.println("key = " + key);
            String value = pair.getValue();
            System.out.println("value = " + value);
        }
        System.out.println("fruitsStore.entrySet() = " + fruitsStore.entrySet());
        //6
        System.out.println("---------- 6 ------------");
        for (Person keyPerson : fruitsStore.keySet()) {
            if (keyPerson.getName().length() > 5) {
                System.out.println(keyPerson);
            }
        }
        int count = 0;
        for (String keyFruits : fruitsStore.values()) {
            if (keyFruits.equals("Orange")) {
                count++;
            }

        }
        System.out.println("count = " + count);

        //7
        System.out.println("---------- 7 ------------");
        for (Map.Entry<Person, String> pair : fruitsStore.entrySet()) {
            int firstCh = 0;
            if ((pair.getValue().equals("Apple") && (firstCh < 2))) {
                firstCh++;
            } else {
                System.out.println(pair);
            }
        }
        System.out.println();
        for (Map.Entry<Person, String> pair : fruitsStore.entrySet()) {
            int firstCh = 0;
            if ((pair.getValue().startsWith("O") && (firstCh < 2))) {
                firstCh++;
            } else {
                System.out.println(pair);
            }
        }
        //8
        System.out.println("---------- 8 ------------");
        for (Map.Entry<Person, String> pair : fruitsStore.entrySet()) {
            if (pair.getValue().equalsIgnoreCase("Apple")) {
                System.out.println(pair);
                break;
            }
        }
        //9
        System.out.println("---------- 9 ------------");
        Map<Person, String> fruitsStoreVer2 = new HashMap<>();
        for (Map.Entry<Person, String> pair : fruitsStore.entrySet()) {
            if (pair.getValue().equalsIgnoreCase("Apple")) {
                fruitsStoreVer2.put(pair.getKey(), pair.getValue());
            }
        }
        System.out.println(fruitsStoreVer2);
        //10
        System.out.println("---------- 10 ------------");
        /*Есть предположение, что данное задание относится к заданию Set
        так как здесь не ясно, где вводить вес. Человеку его не присвоишь, то есть создавать новую карту и ее сравнивать?
         */
    }

}
