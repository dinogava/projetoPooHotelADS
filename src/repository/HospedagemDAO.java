package repository;

import model.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HospedagemDAO {


    static List<Hospedagem> hospedagens = new ArrayList<>();

    public static void salvar(Hospedagem hospedagem) {
        if (hospedagem.getCodigo() == null) {
            hospedagem.setCodigo(hospedagens.size() + 1);
        } else {
            hospedagens.remove(hospedagem.getCodigo() - 1);
        }
        hospedagens.add(hospedagem);
    }

    public static void excluir(Hospedagem hospedagem) {
        hospedagens.remove(hospedagem);
    }


    public static List<Hospedagem> buscaTodos() {
        if (hospedagens.isEmpty()) {
        }
        return hospedagens;
    }

    public static Object[] findhospedagensInArray() {
        List<Hospedagem> hospedagens = buscaTodos();
        List<Integer> hospedagemCodigo = new ArrayList<>();

        for (Hospedagem hospedagem : hospedagens) {
            hospedagemCodigo.add(hospedagem.getCodigo());
        }

        return hospedagemCodigo.toArray();
    }

    public static Object[] findhospedagensDisponivelInArray() {
        List<Hospedagem> hospedagens = buscaTodos();
        List<Integer> hospedagemCodigo = new ArrayList<>();

        for (Hospedagem hospedagem : hospedagens) {
            if (hospedagem.getCheckout() == null) {
                hospedagemCodigo.add(hospedagem.getCodigo());
            }
        }

        return hospedagemCodigo.toArray();
    }


    public static List<Hospedagem> buscarPorCodigo(Integer codigo) {
        List<Hospedagem> hospedagemFiltradas = new ArrayList<>();
        for (Hospedagem hospedagem : hospedagens) {
            if (hospedagem.getCodigo() == Integer.parseInt(String.valueOf(codigo))) {
                hospedagemFiltradas.add(hospedagem);
            }
        }
        return hospedagemFiltradas;
    }




    public static void removerHospede(Hospede hospedeSelecionado) {

    }
}
