package model;

import java.time.LocalDate;

/**
 * Representa um aluno da academia.
 */
public class Aluno extends Pessoa {

    private String email;

    private LocalDate dataNascimento;

    private LocalDate dataMatricula;

    private int planoId;

    public Aluno() {
    }

    public Aluno(
            int id,
            String nome,
            String cpf,
            String telefone,
            String email,
            LocalDate dataNascimento,
            LocalDate dataMatricula,
            int planoId
    ) {

        super(id, nome, cpf, telefone);

        this.email = email;
        this.dataNascimento = dataNascimento;
        this.dataMatricula = dataMatricula;
        this.planoId = planoId;
    }

    @Override
    public String exibirInformacoes() {

        return "Aluno: " + nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(LocalDate dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public int getPlanoId() {
        return planoId;
    }

    public void setPlanoId(int planoId) {
        this.planoId = planoId;
    }
}