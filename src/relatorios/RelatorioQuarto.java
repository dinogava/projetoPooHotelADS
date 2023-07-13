package relatorios;
import model.Hospede;
import model.Pessoa;
import model.Quarto;
import model.Servico;

import javax.swing.table.AbstractTableModel;
import java.util.Vector;

public class RelatorioQuarto extends AbstractTableModel{

    private static final long serialVersionUID = 1L;

    public static final int INDEX_CODIGO = 0;
    public static final int INDEX_TIPO = 1;
    public static final int INDEX_VALOR = 2;
    public static final int INDEX_NUMQUARTO = 3;
    public static final int INDEX_DISPONIBILIDADE = 4;
    public static final int INDEX_LIMITEPESSOAS = 5;
    public static final int INDEX_ESCONDIDO = 6;

    protected String[] nomeColunas;
    protected Vector<Quarto> vetorDados;


    public RelatorioQuarto(String[] columnNames, Vector<Quarto> vetorDados) {
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
        Quarto registroQuarto = (Quarto) vetorDados.get(linha);
        switch (coluna) {
            case INDEX_CODIGO:
                return registroQuarto.getId();
            case INDEX_TIPO:
                return registroQuarto.getTipoQuarto();
            case INDEX_VALOR:
                return registroQuarto.getValor();
            case INDEX_NUMQUARTO:
                return registroQuarto.getNumQuarto();
            case INDEX_DISPONIBILIDADE:
                return registroQuarto.getDisponibilidade();
            case INDEX_LIMITEPESSOAS:
                return registroQuarto.getLimitePessoas();
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
