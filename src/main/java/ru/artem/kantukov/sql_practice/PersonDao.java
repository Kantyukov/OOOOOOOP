package ru.artem.kantukov.sql_practice;

import java.io.IOException;

public interface PersonDao {
    int PersonNameFindByID(String id) throws IOException;
    int getAgeByUserName(String name) throws IOException;
}
