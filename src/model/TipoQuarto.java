package model;

public enum TipoQuarto {

    PADRAO_CLASSICO("Padrão Clássico"),
    VIP("VIP"),
    MASTER_VIP("Master VIP"),
    STAR_VIP("Star VIP"),
    BLACK_VIP("Black VIP");
    private String descricao;
    TipoQuarto(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }


}
