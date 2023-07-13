package repository;

import model.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class QuartoDAO {
    static List<Quarto> quartos = new ArrayList<>();

    public static Object[] findquartosInArray() {
        buscaTodosQuarto();
        List<Quarto> quartos= buscaTodosQuarto();
        List<Integer> quartoNumero = new ArrayList<>();

        for (Quarto quarto : quartos) {
            quartoNumero.add(Integer.valueOf(quarto.getNumQuarto()));
        }

        return quartoNumero.toArray();
    }

    public static void salvar(Quarto quartos) {
        QuartoDAO.quartos.add(quartos);
    }

    public static List<Quarto> buscaTodosQuarto() {

        if (quartos.isEmpty()) {
            quartos.add(new Quarto(40, TipoQuarto.VIP, BigDecimal.valueOf(100), "201", DisponibilidadeQuarto.DISPONIVEL, 3));
            quartos.add(new Quarto(20, TipoQuarto.MASTER_VIP, BigDecimal.valueOf(100), "301", DisponibilidadeQuarto.DISPONIVEL, 4));
            quartos.add(new Quarto(50, TipoQuarto.STAR_VIP, BigDecimal.valueOf(100), "401", DisponibilidadeQuarto.DISPONIVEL, 5));
            quartos.add(new Quarto(10, TipoQuarto.BLACK_VIP, BigDecimal.valueOf(100), "501", DisponibilidadeQuarto.DISPONIVEL, 6));
            quartos.add(new Quarto(30, TipoQuarto.BLACK_VIP, BigDecimal.valueOf(100), "502", DisponibilidadeQuarto.DISPONIVEL, 6));
        }

        return quartos;
    }

    public static List<Quarto> buscarPorNumQuarto(String numQuarto) {
        buscaTodosQuarto();
        List<Quarto> filtrados = new ArrayList<>();
        for (Quarto quarto : quartos) {
            if (quarto.getNumQuarto().equals(numQuarto)) {
                filtrados.add(quarto);
            }
        }
        return filtrados;
    }

}
