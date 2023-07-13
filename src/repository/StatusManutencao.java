package repository;

public enum StatusManutencao {
    PENDENTE(1,"pendente aguardando aprovação"),
    EM_ANDAMENTO(2,"A manutenção está em andamento"),
    CONCLUIDA(3,"A manutenção está concluida");
    private int valor;
    private String descricao;
    StatusManutencao(int valor,String descricao){
        this.valor = valor;
        this.descricao = descricao;
    }

    public int getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }
}
