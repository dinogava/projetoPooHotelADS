package repository;

import model.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PagamentoDAO {

    static List<Pagamento> pagamentos = new ArrayList<>();

    public static void salvar(Pagamento pagamento) {
        pagamentos.add(pagamento);
    }

    public static void excluir(Pagamento pagamento) {
        pagamentos.remove(pagamento);
    }


    public static List<Pagamento> buscaTodos() {
        if (pagamentos.isEmpty()) {
            pagamentos.add(new Pagamento(FormaPagamento.DINHEIRO, LocalDateTime.now(),null,null));

            pagamentos.add(new Pagamento(FormaPagamento.CARTAO_DEBITO,LocalDateTime.now(),null,null));

            pagamentos.add(new Pagamento(FormaPagamento.CARTAO_CREDITO,LocalDateTime.now(),null,null));

            pagamentos.add(new Pagamento(FormaPagamento.PIX,LocalDateTime.now(),null,null));

            pagamentos.add(new Pagamento(FormaPagamento.DINHEIRO,LocalDateTime.now(),null,null));
        }
        return pagamentos;
    }

    public static Object[] findPagamentosInArray() {
        List<Pagamento> pagamentos = buscaTodos();
        List<Integer> pagamentoCodigo = new ArrayList<>();

        for (Pagamento pagamento : pagamentos) {
            pagamentoCodigo.add(pagamento.getId());
        }

        return pagamentoCodigo.toArray();
    }


    public static List<Pagamento> buscarPorCodigo(Integer codigo) {
        List<Pagamento> pagamentoFiltradas = new ArrayList<>();
        for (Pagamento pagamento : pagamentos) {
            if (pagamento.getId() == codigo) {
                pagamentoFiltradas.add(pagamento);
            }
        }
        return pagamentoFiltradas;
    }



}
