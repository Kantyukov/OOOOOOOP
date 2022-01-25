package ru.artem.kantukov.propertiesPractice;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropPractice {
    public static void main(String[] args) throws IOException {
        ClassLoader classLoader = PropPractice.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("application.properties");
        Properties properties = new Properties();
        properties.load(inputStream);
        System.out.println(properties.getProperty("key"));

    }
}
