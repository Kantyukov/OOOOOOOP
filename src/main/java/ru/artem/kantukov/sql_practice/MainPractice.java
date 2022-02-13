package ru.artem.kantukov.sql_practice;

import java.io.IOException;

public class MainPractice {

    public static void main(String[] args) throws IOException {
//        ClassLoader classLoader = MainPractice.class.getClassLoader();
//        InputStream inputStream = classLoader.getResourceAsStream("application.properties");
//        Properties properties = new Properties();
//        properties.load(inputStream);
//        String login = properties.getProperty("key");
//        String password = properties.getProperty("value");
//        String URL = properties.getProperty("URL");

//        try (Connection connection = DriverManager.getConnection(URL, login, password);
//            Statement statement = connection.createStatement()
//
//        ){
//            ResultSet resultSet = statement.executeQuery("SELECT name , second_name, age FROM schema_java_practice.person");
//            while (resultSet.next()){
//            System.out.println(resultSet.getString("name") + " " + resultSet.getString("second_name") + ":" +
//                    resultSet.getInt("age")+ "age");}
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        PersonDao dao = new PersonJDBC();
        dao.PersonNameFindByID(String.valueOf(2));
        System.out.println(dao.getAgeByUserName("Igor"));
        System.out.println(dao.getAgeByUserName("Artem"));


    }
}
