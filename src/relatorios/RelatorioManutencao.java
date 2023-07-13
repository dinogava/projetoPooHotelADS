package relatorios;
import model.Manutencao;


import javax.swing.table.AbstractTableModel;
import java.util.Vector;

public class RelatorioManutencao extends AbstractTableModel{

    private static final long serialVersionUID = 1L;
    public static final int INDEX_ID_MANUTENCAO = 0;
    public static final int INDEX_TIPO_MANUTENCAO = 1;
    public static final int INDEX_QUARTO = 2;
    public static final int INDEX_FUNCIONARIO = 3;
    public static final int INDEX_EMPRESA_TERCEIRA = 4;
    public static final int INDEX_DESCRICAO = 5;
    public static final int INDEX_DATA_CADASTRO = 6;
    public static final int INDEX_DATA_CONCLUSAO = 7;

    public static final int INDEX_ESCONDIDO = 8;

    protected String[] nomeColunas;
    protected Vector<Manutencao> vetorDados;

    public RelatorioManutencao(String[] columnNames, Vector<Manutencao> vetorDados) {
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
        Manutencao registroManut = (Manutencao) vetorDados.get(linha);
        switch (coluna) {
            case INDEX_ID_MANUTENCAO:
                return registroManut.getIdManutencao();
            case INDEX_TIPO_MANUTENCAO:
                int tipoManutencao = registroManut.getTipoManutencao();
                if (tipoManutencao == 1){
                    return "Manutenção da parte elétrica";
                }
                if (tipoManutencao == 2){
                    return "Manutenção estrutural";
                }
                if (tipoManutencao == 3){
                    return "Dedetização";
                }
            case INDEX_QUARTO:
                return registroManut.getQuarto();
            case INDEX_FUNCIONARIO:
                return registroManut.getFuncionario();
            case INDEX_EMPRESA_TERCEIRA:
                return registroManut.getEmpresaTerceira();
            case INDEX_DESCRICAO:
                return registroManut.getDescricaoManutencao();
            case INDEX_DATA_CADASTRO:
                return registroManut.getDataCadastro();
            case INDEX_DATA_CONCLUSAO:
                return registroManut.getDataConclusao();
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

