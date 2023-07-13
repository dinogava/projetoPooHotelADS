package repository;

public enum TipoManutencao {
    ELETRICA(1,"Manutenção da parte elétrica"),
    ESTRUTURAL(2,"Manutenção estrutural"),
    LIMPEZA(3,"Dedetização");

    private int valor;
    private String descricao;

    TipoManutencao(int valor,String descricao){
        this.valor = valor;
        this.descricao= descricao;

    }

    public int getValor() {
        return valor;
    }
    public String getDescricao() {
        return descricao;
    }
}
