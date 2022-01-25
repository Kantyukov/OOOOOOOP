package ru.artem.kantukov.iioStreamPractice;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;

public class IOStreamPractice {
    public static void main(String[] args) throws IOException, FileAlreadyExistsException {

        File file = new File("src/main/resources/file.txt");
        File file1 = new File("src/main/resources/file1.txt");
        File file2 = new File("src/main/resources/file2.txt");
        try (PrintWriter printWriter = new PrintWriter(file)) {
            printWriter.println("Не надо нам земли чужой,\n" +
                    "Свою мы создаем, —\n" +
                    "И одарил ее водой\n" +
                    "Могучий водоем.");
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file));) {
            String input = null;
            while ((input = reader.readLine()) != null) {
                System.out.println(input);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        Files.copy(Path.of("src/main/resources/file.txt"), Path.of("src/main/resources/file1.txt"));
        System.out.println();
        try (BufferedReader reader = new BufferedReader(new FileReader(file1));) {
            String input = null;
            while ((input = reader.readLine()) != null) {
                System.out.println(input);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }

       try(PrintWriter printWriterText = new PrintWriter(file2)){
           printWriterText.println("Но что в моей стране труда\n" +
                   "Теперь произошло,\n" +
                   "То лучезарным навсегда\n" +
                   "В историю вошло");
       } catch (FileNotFoundException fileNotFoundException) {
           fileNotFoundException.printStackTrace();
       }
        System.out.println();
        try (BufferedReader reader = new BufferedReader(new FileReader(file2));) {
            String input = null;
            while ((input = reader.readLine()) != null) {
                System.out.println(input);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        Files.copy(Path.of("src/main/resources/file2.txt"), Path.of("src/main/resources/file.txt"));
        Files.copy(Path.of("src/main/resources/file1.txt"), Path.of("src/main/resources/file2.txt"));
        System.out.println();
        try (BufferedReader reader = new BufferedReader(new FileReader(file));
                BufferedReader reader1 = new BufferedReader(new FileReader(file2));) {
            String input = null;
            while ((input = reader.readLine()) != null) {
                System.out.println(input);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
