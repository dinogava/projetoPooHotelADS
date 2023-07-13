package repository;

import model.EscolheServico;
import model.Funcionario;
import model.Hospedagem;
import model.Servico;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ServicoDAO {

    static List<Servico> servicos = new ArrayList<>();

    public static void salvar(Servico servico) {
        if (servico.getCodigo() == null) {
            servico.setCodigo(servicos.size() + 1);
        } else {
            servicos.remove(servico.getCodigo() - 1);
        }
        servicos.add(servico);
    }


    public static void remover(Servico servico) {
        if (servico.getCodigo() != null) {
            servicos.remove((int) (servico.getCodigo() - 1));
        }
    }

    public static void excluirServico(Servico servico) {
        servicos.remove(servico);
    }

    public static List<Servico> buscaTodos() {
        if (servicos.isEmpty()) {
            servicos.add(new Servico(1, "Cafe da manhã simples", BigDecimal.valueOf(20.00)));
            servicos.add(new Servico(2, "Cafe da manhã premium", BigDecimal.valueOf(40.00)));
            servicos.add(new Servico(2, "Cafe da manhã simples + serviço de quarto", BigDecimal.valueOf(70.00)));
            servicos.add(new Servico(3, "Almoço", BigDecimal.valueOf(60.00)));
            servicos.add(new Servico(4, "Janta", BigDecimal.valueOf(75.00)));
        }
        return servicos;
    }

    public static List<Servico> findServicos() {
        servicos.add((Servico) buscaTodos());
        return servicos;
    }


    public static Object[] findServicosInArray() {
        List<Servico> servicos = buscaTodos();
        List<String> servicosDescricao = new ArrayList<>();

        for (Servico servico : servicos) {
            servicosDescricao.add(servico.getTipo());
        }

        return servicosDescricao.toArray();
    }

    public static List<Servico> buscarPorTipo(String tipo) {
        List<Servico> servicoFiltradas = new ArrayList<>();
        for (Servico servico : servicos) {
            if (servico.getTipo() == tipo) {
                servicoFiltradas.add(servico);
            }
        }
        return servicoFiltradas;
    }
}

