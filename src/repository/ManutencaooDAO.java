package repository;

import model.Manutencao;
import model.Servico;

import java.util.ArrayList;
import java.util.List;

public class ManutencaooDAO {

    static List<Manutencao> manutencoes = new ArrayList<>();

    private static ManutencaooDAO instance;

    public static ManutencaooDAO getInstance(){
        if (instance == null){
            instance = new ManutencaooDAO();
        }
        return instance;
    }

    public void gravarManutencao(Manutencao manutencao){
        if (manutencao.getIdManutencao() == null) {
            manutencao.setIdManutencao(manutencoes.size() + 1);
        } else {
            manutencoes.remove(manutencao.getIdManutencao() - 1);
        }
        manutencoes.add(manutencao);
    }

    public static List<Manutencao> buscaTodos() {

        return manutencoes;
    }

    public static Object[] findManutInArray() {
        List<Manutencao> manutencaos = buscaTodos();
        List<Integer> codManutencao = new ArrayList<>();

        for (Manutencao manutencao : manutencaos) {
            codManutencao.add(manutencao.getIdManutencao());
        }
        return codManutencao.toArray();
    }

    public static List<Manutencao> buscarPorCodigo(Integer codigo) {
        buscaTodos();
        List<Manutencao> filtroManutencao = new ArrayList<>();
        for (Manutencao manutencao : manutencoes) {
            if (manutencao.getIdManutencao() == codigo) {
                filtroManutencao.add(manutencao);
            }
        }
        return filtroManutencao;
    }

    public static void excluirManutencao(Manutencao manutencao) {
        manutencoes.remove(manutencao);
    }


}
