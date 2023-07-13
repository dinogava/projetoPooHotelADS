package relatorios;
import model.Funcionario;
import model.Pessoa;
import javax.swing.table.AbstractTableModel;
import java.util.Vector;

public class RelatorioFuncionario extends AbstractTableModel{

    private static final long serialVersionUID = 1L;

    public static final int INDEX_CODIGO = 0;
    public static final int INDEX_NOME = 1;
    public static final int INDEX_CPF = 2;
    public static final int INDEX_CELULAR = 3;
    public static final int INDEX_EMAIL = 4;
    public static final int INDEX_CARGO = 5;
    public static final int INDEX_SALARIO = 6;

    public static final int INDEX_ESCONDIDO = 7;

    protected String[] nomeColunas;
    protected Vector<Funcionario> vetorDados;

    public RelatorioFuncionario(String[] columnNames, Vector<Funcionario> vetorDados) {
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
        Funcionario registroPessoa = (Funcionario) vetorDados.get(linha);
        switch (coluna) {
            case INDEX_CODIGO:
                return registroPessoa.getID();
            case INDEX_NOME:
                return registroPessoa.getNome();
            case INDEX_CPF:
                return registroPessoa.getCpf();
            case INDEX_CELULAR:
                return registroPessoa.getCelular();
            case INDEX_EMAIL:
                return registroPessoa.getEmail();
            case INDEX_CARGO:
                return registroPessoa.getCargo();
            case INDEX_SALARIO:
                return registroPessoa.getSalario();
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
