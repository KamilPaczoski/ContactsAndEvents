package paczwierz.eventcallendar.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    private static final String url = "jdbc:postgresql://localhost:5432/db";
    private static final String user = "postgres";
    private static final String password = "admin";

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }

    public void createTable() {
        String SQL = "CREATE TABLE IF NOT EXISTS contacts (\n"
                + " id serial PRIMARY KEY,\n"
                + " name TEXT NOT NULL,\n"
                + " surname TEXT NOT NULL,\n"
                + " email TEXT NOT NULL,\n"
                + " phone TEXT NOT NULL,\n"
                + " category TEXT NOT NULL\n"
                + ");";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement()) {
            stmt.execute(SQL);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}