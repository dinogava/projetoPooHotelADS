package model;

public enum EscolheClassificacao {

    ADULTO("Adulto"),
    CRIANCA("Criança"),
    IDOSO("Idoso");

    private String descricao;

    EscolheClassificacao (String descricao) {
        this.descricao = descricao;
    }

    public static String getEnumByString(String code) {
        for (EscolheClassificacao e : EscolheClassificacao.values()) {
            if (e.descricao.equals(code)) {
                return e.name();
            }
        }
        return null;
    }
    public static void add(EscolheClassificacao escolheClassificacao) {

    }

    public String getDescricao() {
        return descricao;
    }
}
