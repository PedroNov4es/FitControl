package dao;
import model.Frequencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * DAO responsável pela frequência.
 */
public class FrequenciaDAO
        implements GenericDAO<Frequencia> {

    @Override
    public void inserir(Frequencia frequencia) {

        String sql =
                "INSERT INTO frequencia " +
                "(aluno_id, entrada) VALUES (?, ?)";

        try (
                Connection conn =
                        ConnectionFactory.getConnection();

                PreparedStatement stmt =
                        conn.prepareStatement(sql)
        ) {

            stmt.setInt(1, frequencia.getAlunoId());

            stmt.setTimestamp(
                    2,
                    java.sql.Timestamp.valueOf(
                            frequencia.getEntrada()
                    )
            );

            stmt.executeUpdate();

            System.out.println(
                    "Frequência registrada!"
            );

        } catch (SQLException e) {

            System.out.println(e.getMessage());
        }
    }

    @Override
    public void atualizar(Frequencia frequencia) {

        System.out.println(
                "Atualização pendente"
        );
    }

    @Override
    public void deletar(int id) {

        System.out.println(
                "Remoção pendente"
        );
    }
}