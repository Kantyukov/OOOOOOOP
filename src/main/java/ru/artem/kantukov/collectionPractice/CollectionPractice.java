package ru.artem.kantukov.collectionPractice;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data

public class CollectionPractice {


    public static void main(String[] args) {

        System.out.println("1 Создание списков: (Используя конструктор)");
        System.out.println("allBooksList без добавления " + 0); // До добавления всех книг в список
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
        List<Book> allBooksList = new ArrayList<>(allBooksListReady);
        System.out.println("allBooksList с добавления " + allBooksList.size()); // И эту коллекцию добавил уже в созданную коллекцию allBooksList

        System.out.println();
        System.out.println("2 Получить элемент по индексу:");
        System.out.println(allBooksList.get(0));
        System.out.println(allBooksList.get(16));

        Book lastElement = null;
        for (int i = 0; i <allBooksList.size(); i++) {
            lastElement = allBooksList.get(allBooksList.size() - 1);
        }
        System.out.println(lastElement);

        System.out.println();
        System.out.println("3  Задачи на вставку элемента:");
        Book atonement = new Book("Atonement", " Ian McEwan", 354);
        Book watchmen = new Book("Watchmen", "Alan Moore (Goodreads Author)", 1159);
        Book neverLetMeGo = new Book("Never Let Me Go", "Kazuo Ishiguro (Goodreads Author)", 654);
        Book thingsFallApart = new Book("Things Fall Apart", "Chinua Achebe", 465);
        allBooksList.add(atonement);
        allBooksList.add(watchmen);
        allBooksList.add(neverLetMeGo);
        allBooksList.add(3, thingsFallApart);
        List<Book> allBooksList1 = new ArrayList<>(allBooksList);
        System.out.println("allBooksList1.size() = " + allBooksList1.size());
        System.out.println();
        System.out.println("4 Задачи на удаление элементов: (Используя методы)");
        allBooksList.remove(0);
        allBooksList.remove(atonement); //Вопрос, почему подсвечивается желтым??
        System.out.println();
        System.out.println("5 Проверить наличие элемента");
        System.out.println("allBooksList.contains(\"Watchmen\") = " + allBooksList.contains(watchmen));


        System.out.println("6 Вывод списка:");
        System.out.println(allBooksList);

        System.out.println("7 Отфильтровать список вернуть записи по некоторому условию:");

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


        System.out.println("8 Пропустить несколько первых элементов");
        System.out.println();
        int lastBookCount = 0;
        for (Book value : allBooksList) {
            if (lastBookCount < 3) {
                lastBookCount++;

            } else {
                System.out.println(value);
            }
        }
        System.out.println();
        System.out.println("7+8: Пропускаем элементы, которые удовлетворяют некоторому условию");
        int lastBookCount1 = 0;
        for (Book book : allBooksList) {
            if (lastBookCount1 < 3 && book.getName().startsWith("The")) {
                lastBookCount1++;

            } else {
                System.out.println(book);
            }
        }

        System.out.println();

        System.out.println("10 Вернуть первый подходящий элемент:");
        for (Book books : allBooksList) {
            if (books.getAuthor().length()%3==0) {System.out.println(books);
                break;
            }
        }
        System.out.println();

        System.out.println("11 Возвращаем все элементы удовлетворяющие условию:");
        for (Book books : allBooksList) {
            if (books.getAuthor().length()%3==0) {System.out.println(books);

            }
        }
        System.out.println();
        System.out.println("12 Создать класс Person.( Поля: имя, возраст и пол isMale )");
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
            if ((person.getAge() < 27 && person.getAge() > 18 && person.isMale()) && person.getName().startsWith("H"))
                System.out.println(person);
        }
        System.out.println();
        System.out.println("13. Найти средний возраст всех женщин.");
        for (Person person : allPersonList) {
            if (!person.isMale()){
                System.out.println(person);
            }
        }


        int countOfWomen = 0;
        int sum = 0;
        int avgAgeOfWoman;

        for (Person person : allPersonList) {
            if (!person.isMale()) {
                countOfWomen++;
                sum += sum + person.getAge();
                avgAgeOfWoman = sum / countOfWomen;
                System.out.println("avgAgeOfWoman = " + avgAgeOfWoman);
            }

        }



    }
}