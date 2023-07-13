package repository;
import model.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import static repository.HospedeDAO.hospedes;

public class HospedeDAO {

    static List<Hospede> hospedes = new ArrayList<>();

    public static void salvar(Hospede hospede) {
        if (hospede.getID() == null) {
            hospede.setId(hospedes.size() + 1);
        } else {
            hospedes.remove(hospede.getID() - 1);
        }
        hospedes.add(hospede);
    }

    public static List<Hospede> buscaTodosh() {
        if (hospedes.isEmpty()) {
            hospedes.add(new Hospede(1, "Manoel Gomes", "095.547.142-27", "(48) 9780-9850", "manoelgomes@gmail.com"));
            hospedes.add(new Hospede(2, "Ednaldo Pereira", "110.741.248-07", "(49) 9842-5874", "ednaldopereira@hotmail.com"));
            hospedes.add(new Hospede(3, "Anderson Silva", "075.124.159-35", "(51) 9750-4750", "andersonsilva@gmail.com"));
            hospedes.add(new Hospede(4, "Gustavo Kunst", "075.124.159-35", "(51) 9750-4750", "gustavoknust@gmail.com"));
            hospedes.add(new Hospede(5, "Rogério Skynet", "075.124.159-35", "(51) 9750-4750", "rogerioskylab@gmail.com"));
        }
        return hospedes;
    }

    public static List<Hospede> buscarPorNome(String nome) {
        buscaTodosh();
        List<Hospede> hospedeFiltrado = new ArrayList<>();
        for (Hospede hospede : hospedes) {
            if (hospede.getNome() == nome) {
                hospedeFiltrado.add(hospede);
            }
        }
        return hospedeFiltrado;
    }

    public static Object[] findHospedeInArray() {
        List<Hospede> hospedes = buscaTodosh();
        List<String> hospedeDesc = new ArrayList<>();

        for (Hospede hospede : hospedes) {
            hospedeDesc.add(hospede.getNome());
        }
        return hospedeDesc.toArray();
    }

    public static void removerHospede(Hospede hospede) {hospedes.remove(hospede);}

}