package model;

import java.math.BigDecimal;

public class Quarto {
    private Integer id;
    private TipoQuarto tipoQuarto;
    private BigDecimal valor;
    private String numQuarto;
    private DisponibilidadeQuarto disponibilidade;
    private Integer limitePessoas;

    public Quarto(Integer id, TipoQuarto tipoQuarto, BigDecimal valor, String numQuarto,
                  DisponibilidadeQuarto disponibilidade, Integer limitePessoas) {
        this.id = id;
        this.tipoQuarto = tipoQuarto;
        this.valor = valor;
        this.numQuarto = numQuarto;
        this.disponibilidade = disponibilidade;
        this.limitePessoas = limitePessoas;
    }

    public DisponibilidadeQuarto getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(DisponibilidadeQuarto disponibilidade) {

        this.disponibilidade = disponibilidade;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoQuarto getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(TipoQuarto tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getNumQuarto() {
        return numQuarto;
    }

    public void setNumQuarto(String numQuarto) {
        this.numQuarto = numQuarto;
    }
    public Integer getLimitePessoas() {
        return limitePessoas;
    }

    public void setLimitePessoas(Integer limitePessoas) {
        this.limitePessoas = limitePessoas;
    }

    @Override
    public String toString() {
        return  "" +
                "\nTipo de quarto : " + tipoQuarto +
                "\nValor da diária : " + valor +
                "\nNumero do quarto : " + numQuarto +
                "\nLimite de pessoas : " + limitePessoas +
                " ";
    }
}