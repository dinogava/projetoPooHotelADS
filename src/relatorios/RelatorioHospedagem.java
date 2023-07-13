package relatorios;
import model.*;

import javax.swing.table.AbstractTableModel;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class RelatorioHospedagem extends AbstractTableModel{

    private static final long serialVersionUID = 1L;
    public static final int INDEX_CODIGO = 0;
    public static final int INDEX_CHECKIN = 1;
    public static final int INDEX_CHECKOUT = 2;
    public static final int INDEX_HOSPEDE = 3;
    public static final int INDEX_QUANTIDADEDIARIAS = 4;
    public static final int INDEX_QUARTO = 5;
    public static final int INDEX_SERVICOS = 6;
    public static final int INDEX_VALORTOTALHOSPEDAGEM = 7;
    public static final int INDEX_ESCONDIDO = 8;

    protected String[] nomeColunas;
    protected Vector<Hospedagem> vetorDados;

    public RelatorioHospedagem(String[] columnNames, Vector<Hospedagem> vetorDados) {
        this.nomeColunas = columnNames;
        this.vetorDados = vetorDados;
    }

    @Override
    public String getColumnName(int column) {
        return nomeColunas[column];
    }

    @Override
    public boolean isCellEditable(int linha, int coluna) {
        if (coluna == INDEX_ESCONDIDO) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        Hospedagem registroHospedagem = (Hospedagem) vetorDados.get(linha);
        switch (coluna) {
            case INDEX_CODIGO:
                return registroHospedagem.getCodigo();
            case INDEX_CHECKIN:
                return registroHospedagem.getCheckin();
            case INDEX_CHECKOUT:
                return registroHospedagem.getCheckout();
            case INDEX_HOSPEDE:
                return registroHospedagem.getHospede();
            case INDEX_QUANTIDADEDIARIAS:
                return registroHospedagem.getQuantidadeDiarias();
            case INDEX_QUARTO:
                return registroHospedagem.getQuarto();
            case INDEX_SERVICOS:
                return registroHospedagem.getServicos();
            case INDEX_VALORTOTALHOSPEDAGEM:
                return registroHospedagem.getValorTotalHospedagem();
            default:
                return new Object();
        }
    }

    @Override
    public int getRowCount() {
        return vetorDados.size();
    }

    @Override
    public int getColumnCount() {
        return nomeColunas.length;
    }
}

