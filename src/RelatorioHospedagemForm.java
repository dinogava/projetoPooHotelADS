import model.Hospedagem;
import relatorios.RelatorioHospedagem;
import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import java.util.Vector;

public class RelatorioHospedagemForm extends JPanel {

    private static final long serialVersionUID = 1L;

    public static final String[] nomeColunas =
            {"Código","Check-in","Check-out","Hóspede","Quantidade de diárias","Quarto","Consumo","Valor Total",""};

    protected JTable table;
    protected JScrollPane scroller;
    protected RelatorioHospedagem tabela;
//"Hóspede", "Quantidade de dias", "Quarto","Total",""
    public RelatorioHospedagemForm(Vector<Hospedagem> vetorDados) {
       iniciarComponentes(vetorDados);
    }

    public void iniciarComponentes(Vector<Hospedagem> vetorDados) {
        tabela = new RelatorioHospedagem(nomeColunas, vetorDados);
        table = new JTable();
        table.setModel(tabela);
        table.setSurrendersFocusOnKeystroke(true);
        scroller = new javax.swing.JScrollPane(table);
        table.setPreferredScrollableViewportSize(new java.awt.Dimension(500, 300));

        TableColumn colunaEscondida = table.getColumnModel().getColumn(RelatorioHospedagem.INDEX_ESCONDIDO);
        colunaEscondida.setMinWidth(2);
        colunaEscondida.setPreferredWidth(2);
        colunaEscondida.setMaxWidth(2);
        setLayout(new BorderLayout());
        add(scroller, BorderLayout.CENTER);
    }

    public static void emitirRelatorio(List<Hospedagem> hospedagens) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            JFrame frame = new JFrame("Relatorio");

            frame.addWindowListener(new WindowAdapter() {
               public void windowClosing(WindowEvent evt) {
                    frame.setVisible(false);
                    Main.chamaMenuPrincipal();
                }

            });
            Vector<Hospedagem> vetorDados = new Vector<Hospedagem>();
            for (Hospedagem hospedagem : hospedagens) {
                vetorDados.add(hospedagem);
            }

            frame.getContentPane().add(new RelatorioHospedagemForm(vetorDados));
            frame.pack();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}