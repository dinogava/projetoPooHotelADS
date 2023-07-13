package model;

public enum EscolheServico {

        CAFE_MANHA_SIMPLES("Café da manhã simples"),
        CAFE_MANHA_PREMIUM("Café da manhã premium"),
        ALMOCO("Almoço"),
        JANTA("Janta");
//        SERVICO_QUARTO ("Serviço de quarto");


    private String descricao;

        EscolheServico(String descricao) {
            this.descricao = descricao;
    }

    public static String getEnumByString(String code) {
        for (EscolheServico e : EscolheServico.values()) {
            if (e.descricao.equals(code)) {
                return e.name();
            }
        }
        return null;
    }
    public static void add(EscolheServico escolheServico) {

    }

    public String getDescricao() {
            return descricao;
        }
    }
