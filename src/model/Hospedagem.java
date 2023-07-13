package model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import model.Servico;

public class Hospedagem {
    private Integer codigo;
    private LocalDate checkin;
    private LocalDate checkout;
    private Hospede hospede;
    private Integer quantidadeDiarias;
    private Quarto quarto;
    private List<Servico> servicos = new ArrayList<>();
    private BigDecimal valorTotalHospedagem;

    public Hospedagem(Integer codigo, LocalDate checkin, LocalDate checkout, Hospede hospede, Integer quantidadeDiarias, Quarto quarto) {
        this.codigo = codigo;
        this.checkin = checkin;
        this.checkout = checkout;
        this.hospede = hospede;
        this.quantidadeDiarias = quantidadeDiarias;
        this.quarto = quarto;

    }

    public Hospedagem(LocalDate checkin, Hospede hospede, Quarto quarto) {
        this.checkin = checkin;
        this.hospede = hospede;
        this.quarto = quarto;
    }

    public BigDecimal calculaValorConsumo() {
        BigDecimal valCons = BigDecimal.ZERO;
        for (Servico servico : this.servicos) {
            valCons = valCons.add(servico.getValor());
        }

        return valCons;


    }

    public BigDecimal calculaValorTotalHospedagem() {
        BigDecimal consumoLocal = calculaValorConsumo();
        BigDecimal valorDiaria = this.quarto.getValor();

        BigDecimal valorTot = consumoLocal.add(valorDiaria.multiply(BigDecimal.valueOf(quantidadeDiarias)));
        this.valorTotalHospedagem = valorTot;
        return valorTot;
    }

    public void addServico(Servico servico) {
        this.servicos.add(servico);

    }


    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDate checkin) {
        this.checkin = checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public Integer getQuantidadeDiarias() {
        return quantidadeDiarias;
    }

    public void setQuantidadeDiarias(Integer quantidadeDiarias) {
        this.quantidadeDiarias = quantidadeDiarias;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }


    public BigDecimal getValorTotalHospedagem() {
        return valorTotalHospedagem;
    }

    public void setValorTotalHospedagem(BigDecimal valorTot) {
        this.valorTotalHospedagem = valorTot;
    }

    public List<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(List<Servico> servicos) {
        this.servicos = servicos;
    }

    @Override
    public String toString() {
        String consumoString = servicos.stream()
                .map(consumo -> consumo.getTipo() + ": " + consumo.getValor())
                .collect(Collectors.joining(", "));

        return "Hospedagem" +
                "\nCódigo: " + codigo +
                "\nCheck-in: " + checkin +
                "\nCheck-out: " + checkout +
                "\n\nHóspede: " + hospede +
                "\n\nQuantidade de diárias: " + quantidadeDiarias +
                "\n\nQuarto: " + quarto +
                "\n\nConsumos: " + consumoString +
                "\n\nValor total de consumo: " + calculaValorConsumo() +
                "\n\nValor total da hospedagem: " + valorTotalHospedagem +
                " ";
    }

}


