package model;

public enum DisponibilidadeQuarto {
    DISPONIVEL("Disponível"),
    INDISPONIVEL("Indisponível");

    private String descricao;

    DisponibilidadeQuarto(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
