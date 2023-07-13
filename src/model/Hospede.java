package model;

public class Hospede extends Pessoa {
    private EscolheClassificacao classificacao;

    public Hospede(Integer id, String nome, String cpf, String celular, String email) {
        super(id, nome, cpf, celular, email);
    }

    public Hospede( String nome, String cpf, String celular, String email) {
        super(nome, cpf, celular, email);
    }

    public Hospede(String nome, String cpf, String celular, String email, EscolheClassificacao classificacao) {
        super(nome, cpf, celular, email);
        this.classificacao = classificacao;
    }

    public EscolheClassificacao getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(EscolheClassificacao classificacao) {
        this.classificacao = classificacao;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Informações do Hóspede:");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Celular: " + getCelular());
        System.out.println("Email: " + getEmail());
        System.out.println("Classificação: " + getClassificacao());
    }
}
