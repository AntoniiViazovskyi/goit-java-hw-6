package com.goit.service;

import com.goit.utils.Database;
import com.goit.exception.DatabaseException;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.Statement;

public class DatabasePopulateService {
    public static void main(String[] args) {
        try (Connection connection = Database.getInstance().getConnection()) {
            Statement statement = connection.createStatement();
            statement.execute(
                    Files.readString(Path.of("src/main/resources/sql/populate_db.sql"), StandardCharsets.UTF_8)
            );
        } catch (Exception e) {
            throw new DatabaseException(e);
        }

    }
}
