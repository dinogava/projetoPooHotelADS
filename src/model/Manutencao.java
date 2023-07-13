package model;


import java.time.LocalDate;

public class Manutencao {

    private Integer idManutencao;
    private Integer tipoManutencao;
    private String quarto;
    private String funcionario;
    private String empresaTerceira;
    private String descricaoManutencao;
    private LocalDate dataCadastro;
    private LocalDate dataConclusao;


    public Manutencao(Integer tipoManutencao, String quarto, String empresaTerceira, String descricaoManutencao, LocalDate dataCadastro) {
        this.tipoManutencao = tipoManutencao;
        this.quarto = quarto;
        this.empresaTerceira = empresaTerceira;
        this.descricaoManutencao = descricaoManutencao;
        this.dataCadastro = dataCadastro;
    }

    public Manutencao(Integer tipoManutencao, String quarto, String descricaoManutencao, LocalDate dataCadastro, String funcionario) {
        this.tipoManutencao = tipoManutencao;
        this.quarto = quarto;
        this.funcionario = funcionario;
        this.descricaoManutencao = descricaoManutencao;
        this.dataCadastro = dataCadastro;
    }

    public Integer getIdManutencao() {
        return idManutencao;
    }

    public void setIdManutencao(Integer idManutencao) {
        this.idManutencao = idManutencao;
    }

    public Integer getTipoManutencao() {
        return tipoManutencao;
    }

    public void setTipoManutencao(Integer tipoManutencao) {
        this.tipoManutencao = tipoManutencao;
    }

    public String getQuarto() {
        return quarto;
    }

    public void setQuarto(String quarto) {
        this.quarto = quarto;
    }

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public String getEmpresaTerceira() {
        return empresaTerceira;
    }

    public void setEmpresaTerceira(String empresaTerceira) {
        this.empresaTerceira = empresaTerceira;
    }

    public String getDescricaoManutencao() {
        return descricaoManutencao;
    }

    public void setDescricaoManutencao(String descricaoManutencao) {
        this.descricaoManutencao = descricaoManutencao;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalDate getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(LocalDate dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    @Override
    public String toString() {
        return "Manutencao{" +
                "idManutencao=" + idManutencao +
                ", tipoManutencao=" + tipoManutencao +
                ", quarto=" + quarto +
                ", funcionario=" + funcionario +
                ", empresaTerceira='" + empresaTerceira + '\'' +
                ", descricaoManutencao='" + descricaoManutencao + '\'' +
                ", dataCadastro=" + dataCadastro +
                ", dataConclusao=" + dataConclusao +
                '}';
    }
}


