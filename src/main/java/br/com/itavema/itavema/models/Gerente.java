package br.com.itavema.itavema.models;

public class Gerente extends Funcionario {

    private Integer codGerente;

    public Gerente(String nome, Integer idade, String cpf, String endereco, Double salario, Integer codGerente) {
        super(nome, idade, cpf, endereco, salario);
        this.codGerente = codGerente;
    }

    @Override
    public Double getSalarioComissao() {
        return (super.getSalario() * 2.5);
    }

    public Integer getCodGerente() {
        return codGerente;
    }

    public void setCodGerente(Integer codGerente) {
        this.codGerente = codGerente;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "codGerente=" + codGerente +
                "calculaComissao" + this.getSalarioComissao() +
                "} " + super.toString();
    }
}
