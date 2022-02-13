package ru.artem.kantukov.sql_practice;

import java.io.IOException;
import java.io.InputStream;

import java.sql.*;
import java.util.Properties;

public class PersonJDBC implements PersonDao {
    @Override
    public int PersonNameFindByID(String name) throws IOException {
        ClassLoader classLoader = PersonJDBC.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("application.properties");
        Properties properties = new Properties();
        properties.load(inputStream);
        String login = properties.getProperty("key");
        String password = properties.getProperty("value");
        String URL = properties.getProperty("URL");
        try (Connection connection = DriverManager.getConnection(URL, login, password);
             Statement statement = connection.createStatement()

        ) {
            ResultSet resultSet = statement.executeQuery("SELECT name, id FROM schema_java_practice.person " +
                    "where id = '" + name +"'");
            resultSet.next();
            System.out.println(resultSet.getInt("id") +" "+ resultSet.getString("name"));


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return -1;
    }

    @Override
    public int getAgeByUserName(String name) throws IOException {
        ClassLoader classLoader = PersonJDBC.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("application.properties");
        Properties properties = new Properties();
        properties.load(inputStream);
        String login = properties.getProperty("key");
        String password = properties.getProperty("value");
        String URL = properties.getProperty("URL");
        try (Connection connection = DriverManager.getConnection(URL, login, password);
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT name, age FROM schema_java_practice.person " +
                     "where name = ?")

        ) {
            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            return resultSet.getInt("age");


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return -1;
    }
}
