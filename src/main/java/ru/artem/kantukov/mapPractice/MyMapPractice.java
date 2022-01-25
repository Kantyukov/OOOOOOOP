package ru.artem.kantukov.mapPractice;

import ru.artem.kantukov.collectionPractice.Book;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMapPractice {
    public static void main(String[] args) {
        // 0
        Map<Person, Fruit> fruitsStore = new HashMap<>();
        Fruit apple = new Fruit("Apple", 13);
        Fruit orange = new Fruit("Orange", 19);
        Fruit banana = new Fruit("Banana", 18);
        Fruit melon = new Fruit("Melon", 122);
        Fruit aPPle = new Fruit("APPLE", 10);
        Fruit papaya = new Fruit("Papaya", 4);

        Person marina = new Person("Marina");
        Person ivan = new Person("Ivan");
        Person artem = new Person("Artem");
        Person artemXXl = new Person("ArtemXXL");
        Person artemS = new Person("ArtemS");
        Person artemM = new Person("ArtemM");
        Person ruslan = new Person("Ruslan");
        Person olga = new Person("Olga");
        Person artemOld = new Person("Artem");

        //1
        Map<Person, Fruit> fruitsStoreVer1 = new HashMap<>();

        System.out.println("---------- 1 ------------");
        fruitsStore.put(marina, apple);
        fruitsStore.put(ivan, banana);
        fruitsStore.put(artemXXl, apple);
        fruitsStore.put(artemS, apple);
        fruitsStore.put(artemM, apple);
        fruitsStore.put(artem, orange);
        fruitsStore.put(ruslan, papaya);
        fruitsStore.put(olga, melon);
        fruitsStore.put(artemOld, aPPle);

        fruitsStoreVer1.putAll(fruitsStore);
        for (Map.Entry<Person, Fruit> pair : fruitsStore.entrySet()) {
            System.out.println(pair);
        }

        System.out.println("---------- 2 ------------");
        System.out.println("fruitsStore.get(artem) = " + fruitsStore.get(artem));

        //3
        System.out.println("---------- 3 ------------");
        System.out.println("fruitsStore.remove(olga) = " + fruitsStore.remove(olga));
        //4
        System.out.println("---------- 4 ------------");
        System.out.println("fruitsStore.containsKey(artem) = " + fruitsStore.containsKey(artem));
        System.out.println("fruitsStore.containsValue(\"Orange\") = " + fruitsStore.containsValue(orange));
        // 5
        System.out.println("---------- 5 ------------");
        for (Map.Entry<Person, Fruit> pair : fruitsStore.entrySet()) {
            Person key = pair.getKey();
            System.out.println("key = " + key);
            Fruit value = pair.getValue();
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
        for (Fruit keyFruits : fruitsStore.values()) {
            if (keyFruits.equals("Orange")) {
                count++;
            }
        }
        System.out.println("count = " + count);

        //7
        System.out.println("---------- 7 ------------");
        int firstCh = 0;
        for (Map.Entry<Person, Fruit> pair : fruitsStore.entrySet()) {

            if ((pair.getValue().equals("Apple") && (firstCh < 2))) {
                firstCh++;
            } else {
                System.out.println(pair);
            }
        }
        System.out.println();
        int firstCh1 = 0;
        for (Map.Entry<Person, Fruit> pair : fruitsStore.entrySet()) {

            if ((pair.getValue().getName().startsWith("O") && (firstCh1 < 2))) {
                firstCh1++;
            } else {
                System.out.println(pair);
            }
        }
        //8
        System.out.println("---------- 8 ------------");
        for (Map.Entry<Person, Fruit> pair : fruitsStore.entrySet()) {
            if (pair.getValue().getName().equalsIgnoreCase("Apple")) {
                System.out.println(pair);
                break;
            }
        }
        //9
        System.out.println("---------- 9 ------------");
        Map<Person, Fruit> fruitsStoreVer2 = new HashMap<>();
        for (Map.Entry<Person, Fruit> pair : fruitsStore.entrySet()) {
            if (pair.getValue().getName().equalsIgnoreCase("Apple")) {
                fruitsStoreVer2.put(pair.getKey(), pair.getValue());
            }
        }
        System.out.println(fruitsStoreVer2);
        //10
        System.out.println("---------- 10 ------------");
        int avgSize;
        int countFruit = 0;
        int sum = 0;
        for (Map.Entry<Person, Fruit> pair : fruitsStore.entrySet()) {

            sum +=sum + pair.getValue().getWeight();
            countFruit++;

        }avgSize = sum/countFruit;
        System.out.println(avgSize);

    }

}
