package ru.artem.kantukov.iioStreamPractice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOStreamPractice {
    public static void main(String[] args) throws IOException {

        File file = new File("src/main/resources/file.txt");
        File file2 = new File("src/main/resources/file2.txt");
        try (PrintWriter printWriter = new PrintWriter(file)) {
            printWriter.println("""
                    Не надо нам земли чужой,
                    Свою мы создаем, —
                    И одарил ее водой
                    Могучий водоем.""");
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        List<File> fileWithText1 = new ArrayList<>();
        List<File> fileTResText;
        List<File> fileWithText2 = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String input1;
            while ((input1 = reader.readLine()) != null) {
                fileWithText1.add(new File(input1));
            }
            System.out.println(fileWithText1);
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        try (PrintWriter printWriterText = new PrintWriter(file2)) {
            printWriterText.println("""
                    Но что в моей стране труда
                    Теперь произошло,
                    То лучезарным навсегда
                    В историю вошло""");
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(file2))) {
            String input;
            while ((input = reader.readLine()) != null) fileWithText2.add(new File(input));
            System.out.println(fileWithText2);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        System.out.println();
        fileTResText = fileWithText1;
        fileWithText1 = fileWithText2;
        fileWithText2 = fileTResText;
        System.out.println(fileWithText1);
        System.out.println(fileWithText2);
        try (PrintWriter printWriter = new PrintWriter(file)) {
            printWriter.println(fileWithText1);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }try (PrintWriter printWriter = new PrintWriter(file2)) {
            printWriter.println(fileWithText2);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

    }
}