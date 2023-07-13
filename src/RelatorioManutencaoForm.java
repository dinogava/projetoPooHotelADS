import model.Funcionario;
import model.Manutencao;
import relatorios.RelatorioManutencao;
import repository.StatusManutencao;
import repository.TipoManutencao;

import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDate;
import java.util.List;
import java.util.Vector;

public class RelatorioManutencaoForm extends JPanel {

    private static final long serialVersionUID = 1L;

    public static final String[] nomeColunas =
            {"Código", "Tipo de Manutenção", "Quarto","Funcionário","Empresa Terceira","Descrição","Data Cadastro", "Data Conclusão", ""};

    protected JTable table;
    protected JScrollPane scroller;
    protected RelatorioManutencao tabela;

    public RelatorioManutencaoForm(Vector<Manutencao> vetorDados) {
        iniciarComponentes(vetorDados);
    }

    public void iniciarComponentes(Vector<Manutencao> vetorDados) {
        tabela = new RelatorioManutencao(nomeColunas, vetorDados);
        table = new JTable();
        table.setModel(tabela);
        table.setSurrendersFocusOnKeystroke(true);
        scroller = new javax.swing.JScrollPane(table);
        table.setPreferredScrollableViewportSize(new java.awt.Dimension(500, 300));

        TableColumn colunaEscondida = table.getColumnModel().getColumn(RelatorioManutencao.INDEX_ESCONDIDO);
        colunaEscondida.setMinWidth(2);
        colunaEscondida.setPreferredWidth(2);
        colunaEscondida.setMaxWidth(2);
        setLayout(new BorderLayout());
        add(scroller, BorderLayout.CENTER);
    }

    public static void emitirRelatorio(List<Manutencao> manutencaos) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            JFrame frame = new JFrame("Relatorio");

            frame.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent evt) {
                    frame.setVisible(false);
                    Main.chamaMenuPrincipal();
                }

            });
            Vector<Manutencao> vetorDados = new Vector<Manutencao>();
            for (Manutencao manutencao : manutencaos) {
                vetorDados.add(manutencao);
            }

            frame.getContentPane().add(new RelatorioManutencaoForm(vetorDados));
            frame.pack();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


