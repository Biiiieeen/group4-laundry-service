package com.group4.laundry.config;

import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/** Opens a fresh connection; callers own and close it with try-with-resources. */
public final class DatabaseConnection {
    private DatabaseConnection() { }

    public static Connection open() throws SQLException {
        Properties local = new Properties();
        Path file = Path.of("config", "database.properties");
        if (Files.exists(file)) {
            try (Reader reader = Files.newBufferedReader(file, StandardCharsets.UTF_8)) {
                local.load(reader);
            } catch (IOException | IllegalArgumentException ex) {
                throw new SQLException("Cannot read local database configuration.");
            }
        }
        String url = setting(local, "LAUNDRY_DB_URL", "db.url");
        String user = setting(local, "LAUNDRY_DB_USER", "db.user");
        String password = setting(local, "LAUNDRY_DB_PASSWORD", "db.password");
        if (url == null || url.isBlank() || user == null || user.isBlank() || password == null) {
            throw new SQLException("Set the database URL, user and password using environment variables "
                    + "or config/database.properties. The dashboard works without a database.");
        }
        if (!url.startsWith("jdbc:mysql:")) {
            throw new SQLException("The database URL must start with jdbc:mysql:.");
        }
        Properties credentials = new Properties();
        credentials.setProperty("user", user);
        credentials.setProperty("password", password);
        credentials.setProperty("connectTimeout", "5000");
        credentials.setProperty("socketTimeout", "10000");
        return DriverManager.getConnection(url, credentials);
    }

    private static String setting(Properties local, String environmentKey, String propertyKey) {
        String value = System.getenv(environmentKey);
        return value != null ? value : local.getProperty(propertyKey);
    }
}
