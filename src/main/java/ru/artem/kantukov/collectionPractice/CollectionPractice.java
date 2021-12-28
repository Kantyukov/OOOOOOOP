package ru.artem.kantukov.collectionPractice;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data

public class CollectionPractice {


    public static void main(String[] args) {

        //1
        List<Book> allBooksList = new ArrayList<>();
        System.out.println("allBooksList без добавления " + allBooksList.size()); // До добавления всех книг в список
        System.out.println("allBooksListReady ");
        Book aliceInWonderland = new Book("Alice's Adventures in Wonderland", "Lewis Carroll", 200);
        Book toKillAMockingbird = new Book("To Kill a Mockingbird", "Harper Lee", 358);
        Book book1984 = new Book("1984", "George Orwell", 194);
        Book theLordOfTheRings = new Book("The Lord of the Rings", "J.R.R. Tolkien", 556);
        Book theCatcherInThEye = new Book("The Catcher in the Rye", "J.D. Salinger", 156);
        Book theGreatGatsby = new Book("The Great Gatsby", "F. Scott Fitzgerald", 598);
        Book theLionTheWitch = new Book("The Lion, the Witch and the Wardrobe", " C.S. Lewis", 846);
        Book lordOfTheFlies = new Book("Lord of the Flies", "William Golding", 322);
        Book animalFarm = new Book("Animal Farm", "George Orwell", 656);
        Book catch22 = new Book("Catch-22", "Joseph Heller", 465);
        Book theGrapesOfWrath = new Book("The Grapes of Wrath", "John Steinbeck", 525);
        Book goneWithTheWind = new Book("Gone with the Wind", "Margaret Mitchell", 616);
        Book slaughterhouseFive = new Book("Slaughterhouse-Five", "Kurt Vonnegut Jr.", 419);
        Book lolita = new Book("Lolita", "Vladimir Nabokov", 564);
        Book oneFlewOver = new Book("One Flew Over the Cuckoo's Nest", "Ken Kesey", 898);
        Book clockworkOrange = new Book("Clockwork Orange", "Anthony Burgess", 554);
        Book areYouThereGod = new Book("Are You There God? It's Me, Margaret", " Judy Blume (Goodreads Author)", 354);


        ArrayList<Book> allBooksListReady = new ArrayList<>(Arrays.asList(aliceInWonderland, toKillAMockingbird, book1984, theLordOfTheRings, theCatcherInThEye, theGreatGatsby,
                theLionTheWitch, lordOfTheFlies, animalFarm, catch22, theGrapesOfWrath, goneWithTheWind, slaughterhouseFive, lolita, oneFlewOver, clockworkOrange, areYouThereGod));
        System.out.println("allBooksListReady " + allBooksListReady.size()); // Создал другую коллекцию, не хочу по отдельности переносить все книги
        allBooksList.addAll(allBooksListReady);
        System.out.println("allBooksList с добавления " + allBooksList.size()); // И эту коллекцию добавил уже в созданную коллекцию allBooksList

        // 2
        System.out.println(allBooksList.get(0));
        System.out.println(allBooksList.get(16));


        //3
        Book atonement = new Book("Atonement", " Ian McEwan", 354);
        Book watchmen = new Book("Watchmen", "Alan Moore (Goodreads Author)", 1159);
        Book neverLetMeGo = new Book("Never Let Me Go", "Kazuo Ishiguro (Goodreads Author)", 654);
        Book thingsFallApart = new Book("Things Fall Apart", "Chinua Achebe", 465);
        allBooksList.add(atonement);
        allBooksList.add(watchmen);
        allBooksList.add(neverLetMeGo);
        allBooksList.add(3, thingsFallApart);
        List<Book> allBooksList1 = new ArrayList<>();
        allBooksList1.addAll(allBooksList);
        System.out.println("allBooksList1.size() = " + allBooksList1.size());

        //4
        allBooksList.remove(0);
        allBooksList.remove("Atonement"); //Вопрос, почему подсвечивается желтым??

        //5
        System.out.println("allBooksList.contains(\"Watchmen\") = " + allBooksList.contains("Watchmen"));

        //6
        System.out.println(allBooksList);

        // 7
        System.out.println();

        for (int i = 0; i < allBooksList.size(); i++) {
            if (i % 3 == 0) {
                System.out.println(allBooksList.get(i));
            }
        }
        System.out.println();
        for (Book books : allBooksList) {
            if (books.getName().equals("Watchmen")) {
                System.out.println(books);
            }
        }

        //8
        System.out.println();
        int lastBookCount = 0;
        for (int i = 0; i < allBooksList.size(); i++) {
            if (lastBookCount < 3) {
                lastBookCount++;

            }else {
                System.out.println(allBooksList.get(i));
            }
        }
        System.out.println();
        //9
        for (Book books : allBooksList) {
            if (books.getAuthor().length()%3==0) {
                System.out.println(books);
            }
        }
        Person ivan = new Person("Ivan", 14, true);
        Person hariton = new Person("Hariton", 18, true);
        Person marina = new Person("Marina", 20, false);
        Person hans = new Person("Hans", 20, true);
        Person edik = new Person("Edik", 21, true);
        Person hermes = new Person("Hermes", 72, true);
        Person boris = new Person("Boris", 29, true);
        ArrayList<Person> allPersonList = new ArrayList<>(Arrays.asList(ivan,hariton,marina,hans,hermes,boris,edik));

        System.out.println();
        for (Person person : allPersonList) {
            if ((person.getAge() < 27 && person.getAge() > 18 && person.isMale()) == true){
                System.out.println(person);
            }
        }
        System.out.println();
        for (Person person : allPersonList) {
            if (person.isMale() == false){
                System.out.println(person);
            }
        }



    }
}