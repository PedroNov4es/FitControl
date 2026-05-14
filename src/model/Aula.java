package model;

/**
 * Representa uma aula coletiva.
 */
public class Aula {

    private int id;

    private String nome;

    private String descricao;

    private int capacidadeMaxima;

    private LocalDateTime horario;

    private int duracao;

    private int instrutorId;

    public Aula() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getInstrutorId() {
        return instrutorId;
    }

    public void setInstrutorId(int instrutorId) {
        this.instrutorId = instrutorId;
    }
}