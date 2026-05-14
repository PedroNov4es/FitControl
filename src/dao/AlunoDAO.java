package dao;
        ) {

            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getCpf());
            stmt.setString(3, aluno.getTelefone());
            stmt.setString(4, aluno.getEmail());

            stmt.setDate(
                    5,
                    java.sql.Date.valueOf(
                            aluno.getDataNascimento()
                    )
            );

            stmt.setDate(
                    6,
                    java.sql.Date.valueOf(
                            aluno.getDataMatricula()
                    )
            );

            stmt.setInt(7, aluno.getPlanoId());

            stmt.executeUpdate();

            System.out.println(
                    "Aluno inserido com sucesso!"
            );

        } catch (SQLException e) {

            System.out.println(
                    "Erro ao inserir aluno: "
                            + e.getMessage()
            );
        }
    }

    @Override
    public void atualizar(Aluno aluno) {

        System.out.println(
                "Método atualizar ainda não implementado"
        );
    }

    @Override
    public void deletar(int id) {

        System.out.println(
                "Método deletar ainda não implementado"
        );
    }
}