package model;

public abstract class Pessoa {
    private Integer id;
    private String nome;
    private String cpf;
    private String celular;
    private String email;

    public Pessoa(Integer id, String nome, String cpf, String celular, String email) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
        this.email = email;
    }

    public Pessoa(String nome, String cpf, String celular, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
        this.email = email;
    }

    public Pessoa(String nome, String cpf, String celular, String email, String cargo) {
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
        this.email = email;
    }

    public Integer getID() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCelular() {
        return celular;
    }

    public String getEmail() {
        return email;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "" +
                "  \nID : " + id +
                ", \nnome : " + nome + '\'' +
                ", \ncpf : " + cpf + '\'' +
                ", \ncelular : " + celular + '\'' +
                ", \nemail : " + email + '\'' +
                '}';
    }



    public abstract void exibirInformacoes();


}
