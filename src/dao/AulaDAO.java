package dao;

import connection.ConnectionFactory;
import model.Aula;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * DAO responsável pelas aulas.
 */
public class AulaDAO implements GenericDAO<Aula> {

    @Override
    public void inserir(Aula aula) {

        String sql =
                "INSERT INTO aula " +
                "(nome, descricao, capacidade_maxima, horario, duracao, instrutor_id) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (
                Connection conn = ConnectionFactory.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)
        ) {

            stmt.setString(1, aula.getNome());
            stmt.setString(2, aula.getDescricao());
            stmt.setInt(3, aula.getCapacidadeMaxima());
            stmt.setTimestamp(4, java.sql.Timestamp.valueOf(aula.getHorario()));
            stmt.setInt(5, aula.getDuracao());
            stmt.setInt(6, aula.getInstrutorId());

            stmt.executeUpdate();

            System.out.println("Aula cadastrada!");

        } catch (SQLException e) {

            System.out.println(e.getMessage());
        }
    }

    @Override
    public void atualizar(Aula aula) {

        System.out.println("Atualização pendente");
    }

    @Override
    public void deletar(int id) {

        System.out.println("Remoção pendente");
    }
}