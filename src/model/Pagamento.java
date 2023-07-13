package model;
import java.math.BigDecimal;
import javax.swing.JOptionPane;
import java.time.LocalDateTime;

public class Pagamento {
    private static Integer proximoId = 1;
    private Integer id;
    private FormaPagamento formasDePagamento;
    private LocalDateTime dataHora;
    private BigDecimal valorTotal;
    private Hospedagem hospedagem;

    public Pagamento(FormaPagamento formasDePagamento, LocalDateTime dataHora, BigDecimal valorTotal, Hospedagem hospedagem) {
        this.id = proximoId;
        proximoId ++;
        this.formasDePagamento = formasDePagamento;
        this.dataHora = dataHora;
        this.valorTotal = valorTotal;
        this.hospedagem = hospedagem;
    }
    public String mensagemPagto(){
        return  "Pagamento : "+
                "\ncodigo : "+ id +
                "\nvalor total: "+ valorTotal +
                "\nforma de pagamento: "+ formasDePagamento+
                "\ndata: "+ dataHora +
                "\nhospedagem: " + hospedagem;

    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public FormaPagamento getFormasDePagamento() {
        return formasDePagamento;
    }
    public void setFormasDePagamento(FormaPagamento formasDePagamento) {
        this.formasDePagamento = formasDePagamento;
    }
    public LocalDateTime getDataHora() {
        return dataHora;
    }
    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
    public BigDecimal getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }
    public Hospedagem getHospedagem() {
        return hospedagem;
    }
    public void setHospedagem(Hospedagem hospedagem) {
        this.hospedagem = hospedagem;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "id=" + id +
                ", formasDePagamento=" + formasDePagamento +
                ", dataHora=" + dataHora +
                ", valorTotal=" + valorTotal +
                ", hospedagem=" + hospedagem +
                '}';
    }
}


/*//        TableColumn colunaEscondida = table.getColumnModel().getColumn(RelatorioHospede.INDEX_ESCONDIDO);
//        colunaEscondida.setMinWidth(2);
//        colunaEscondida.setPreferredWidth(2);
//        colunaEscondida.setMaxWidth(2);
        setLayout(new BorderLayout());
        add(scroller, BorderLayout.CENTER);
    }*/