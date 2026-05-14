package model;

/**
 * Representa um instrutor.
 */
public class Instrutor extends Pessoa {

    private String especialidade;

    public Instrutor() {
    }

    public Instrutor(
            int id,
            String nome,
            String cpf,
            String telefone,
            String especialidade
    ) {

        super(id, nome, cpf, telefone);

        this.especialidade = especialidade;
    }

    @Override
    public String exibirInformacoes() {

        return "Instrutor: " + nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}