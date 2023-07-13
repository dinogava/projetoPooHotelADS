package relatorios;
import model.Hospede;
import model.Pessoa;
import model.Servico;

import javax.swing.table.AbstractTableModel;
import java.util.Vector;

public class RelatorioServico extends AbstractTableModel{

    private static final long serialVersionUID = 1L;

    public static final int INDEX_CODIGO = 0;
    public static final int INDEX_TIPO = 1;
    public static final int INDEX_VALOR = 2;
    public static final int INDEX_ESCONDIDO = 3;

    protected String[] nomeColunas;
    protected Vector<Servico> vetorDados;

    public RelatorioServico(String[] columnNames, Vector<Servico> vetorDados) {
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
        Servico registroServico = (Servico) vetorDados.get(linha);
        switch (coluna) {
            case INDEX_CODIGO:
                return registroServico.getCodigo();
            case INDEX_TIPO:
                return registroServico.getTipo();
            case INDEX_VALOR:
                return registroServico.getValor();
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
