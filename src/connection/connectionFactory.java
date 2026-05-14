package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe responsável pela conexão com PostgreSQL.
 */
public class ConnectionFactory {

    private static final String URL = "";

    private static final String USER = "";

    private static final String PASSWORD = "";

    /**
     * Retorna uma conexão com o banco.
     *
     * @return conexão PostgreSQL
     */
    public static Connection getConnection() {

        try {

            return DriverManager.getConnection(
                    URL,
                    USER,
                    PASSWORD
            );

        } catch (SQLException e) {

            throw new RuntimeException(
                    "Erro ao conectar com banco: "
                            + e.getMessage()
            );
        }
    }
}