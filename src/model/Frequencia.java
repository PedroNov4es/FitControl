package model;

import java.time.LocalDateTime;

/**
 * Representa frequência de um aluno.
 */
public class Frequencia {

    private int id;

    private int alunoId;

    private LocalDateTime entrada;

    public Frequencia() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(int alunoId) {
        this.alunoId = alunoId;
    }

    public LocalDateTime getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalDateTime entrada) {
        this.entrada = entrada;
    }
}