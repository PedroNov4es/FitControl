package model;

/**
 * Representa inscrição em aula.
 */
public class Inscricao {

    private int alunoId;

    private int aulaId;

    public int getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(int alunoId) {
        this.alunoId = alunoId;
    }

    public int getAulaId() {
        return aulaId;
    }

    public void setAulaId(int aulaId) {
        this.aulaId = aulaId;
    }
}