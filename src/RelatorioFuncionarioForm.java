import model.Funcionario;
import relatorios.RelatorioFuncionario;
import relatorios.RelatorioHospede;

import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import java.util.Vector;

public class RelatorioFuncionarioForm extends JPanel {

    private static final long serialVersionUID = 1L;

    public static final String[] nomeColunas =
            {"Código", "Nome", "CPF", "Celular", "Email", "Cargo", "Salário"};

    protected JTable table;
    protected JScrollPane scroller;
    protected RelatorioFuncionario tabela;

    public RelatorioFuncionarioForm(Vector<Funcionario> vetorDados) {
        iniciarComponentes(vetorDados);
    }

    public void iniciarComponentes(Vector<Funcionario> vetorDados) {
        tabela = new RelatorioFuncionario(nomeColunas, vetorDados);
        table = new JTable();
        table.setModel(tabela);
        table.setSurrendersFocusOnKeystroke(true);
        scroller = new javax.swing.JScrollPane(table);
        table.setPreferredScrollableViewportSize(new java.awt.Dimension(500, 300));

//        TableColumn colunaEscondida = table.getColumnModel().getColumn(RelatorioHospede.INDEX_ESCONDIDO);
//        colunaEscondida.setMinWidth(2);
//        colunaEscondida.setPreferredWidth(2);
//        colunaEscondida.setMaxWidth(2);
        setLayout(new BorderLayout());
        add(scroller, BorderLayout.CENTER);
    }

    public static void emitirRelatorio(List<Funcionario> funcionarios) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            JFrame frame = new JFrame("Relatorio");

            frame.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent evt) {
                    frame.setVisible(false);
                    Main.chamaMenuPrincipal();
                }

            });
            Vector<Funcionario> vetorDados = new Vector<Funcionario>();
            for (Funcionario funcionario : funcionarios) {
                vetorDados.add(funcionario);
            }

            frame.getContentPane().add(new RelatorioFuncionarioForm(vetorDados));
            frame.pack();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}