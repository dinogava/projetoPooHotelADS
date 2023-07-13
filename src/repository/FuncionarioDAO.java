package repository;

import model.Funcionario;
import model.Hospede;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO {

    static List<Funcionario> funcionarios = new ArrayList<>();

    public static void salvar(Funcionario funcionario) {
        if (funcionario.getID() == null) {
            funcionario.setId(funcionarios.size() + 1);
        } else {
            funcionarios.remove(funcionario.getID() - 1);
        }
        funcionarios.add(funcionario);
    }

    public static Object[] findFunciInArray() {
        List<Funcionario> funcionarios2 = buscaTodosf();
        List<String> funciDesc = new ArrayList<>();

        for (Funcionario funcionario : funcionarios) {
            funciDesc.add(funcionario.getNome());
        }

        return funciDesc.toArray();
    }

    public static List<Funcionario> buscaTodosf() {
        return new ArrayList<>(funcionarios);
    }

    public static List<Funcionario> buscarPorNomef(String nome) {
        buscaTodosf();
        List<Funcionario> funcionarioFiltrado = new ArrayList<>();
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equals(nome)) {
                funcionarioFiltrado.add(funcionario);
            }
        }
        return funcionarioFiltrado;
    }

    public static void removerFuncionario(Funcionario funcionario) {funcionarios.remove(funcionario);}

    public static List<Funcionario> todosFuncionarios() {
        if (funcionarios.isEmpty()) {
            funcionarios.add(new Funcionario(1, "Maria Silva","987.654.321-09", "+55 11 98765-4321", "marisilva@gmail.com", "Recepção", BigDecimal.valueOf(1200.00)));
            funcionarios.add(new Funcionario(2, "João Santos","111.222.333-44", "+55 21 91234-5678", "joaosantos@gmail.com", "Recepção", BigDecimal.valueOf(1200.00)));
            funcionarios.add(new Funcionario(3, "Ana Oliveira","555.666.777-88", "+55 47 99876-5432", "anaoliveira@gmail.com", "Recepção", BigDecimal.valueOf(1200.00)));
            funcionarios.add(new Funcionario(4, "Pedro Rodrigues","999.888.777-66", "+55 31 87654-3210", "pedrorodrigues@gmail.com", "Recepção", BigDecimal.valueOf(1200.00)));
            funcionarios.add(new Funcionario(5, "Sofia Almeida","444.333.222-11", "+55 82 94567-8901", "sofiaalmeida@gmail.com", "Recepção", BigDecimal.valueOf(1200.00)));
        }
        return new ArrayList<>(funcionarios);
    }
}
