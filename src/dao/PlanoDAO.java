package dao;
            stmt.setInt(4, plano.getDuracaoMeses());

            stmt.executeUpdate();

            System.out.println("Plano cadastrado!");

        } catch (SQLException e) {

            System.out.println(
                    "Erro ao inserir plano: "
                            + e.getMessage()
            );
        }
    }

    @Override
    public void atualizar(Plano plano) {

        String sql =
                "UPDATE plano SET nome = ?, descricao = ?, valor_mensal = ?, duracao_meses = ? WHERE id = ?";

        try (
                Connection conn = ConnectionFactory.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)
        ) {

            stmt.setString(1, plano.getNome());
            stmt.setString(2, plano.getDescricao());
            stmt.setDouble(3, plano.getValorMensal());
            stmt.setInt(4, plano.getDuracaoMeses());
            stmt.setInt(5, plano.getId());

            stmt.executeUpdate();

            System.out.println("Plano atualizado!");

        } catch (SQLException e) {

            System.out.println(e.getMessage());
        }
    }

    @Override
    public void deletar(int id) {

        String sql = "DELETE FROM plano WHERE id = ?";

        try (
                Connection conn = ConnectionFactory.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)
        ) {

            stmt.setInt(1, id);

            stmt.executeUpdate();

            System.out.println("Plano removido!");

        } catch (SQLException e) {

            System.out.println(e.getMessage());
        }
    }
}