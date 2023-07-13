package relatorios;
import model.Hospede;
import model.Pessoa;
import javax.swing.table.AbstractTableModel;
import java.util.Vector;

    public class RelatorioHospede extends AbstractTableModel{

        private static final long serialVersionUID = 1L;

        public static final int INDEX_CODIGO = 0;
        public static final int INDEX_NOME = 1;
        public static final int INDEX_CPF = 2;
        public static final int INDEX_CELULAR = 3;
        public static final int INDEX_EMAIL = 4;

        public static final int INDEX_ESCONDIDO = 5;

        protected String[] nomeColunas;
        protected Vector<Hospede> vetorDados;

        public RelatorioHospede(String[] columnNames, Vector<Hospede> vetorDados) {
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
            Hospede registroPessoa = (Hospede) vetorDados.get(linha);
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
