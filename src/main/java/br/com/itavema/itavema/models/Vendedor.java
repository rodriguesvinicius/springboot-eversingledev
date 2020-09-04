package br.com.itavema.itavema.models;

public class Vendedor extends Funcionario {

    private Integer codVendedor;

    public Vendedor(String nome, Integer idade, String cpf, String endereco, Double salario, Integer codVendedor) {
        super(nome, idade, cpf, endereco, salario);
        this.codVendedor = codVendedor;
    }

    @Override
    public Double getSalarioComissao() {
        return (super.getSalario() * 1.4);
    }

    public Integer getCodVendedor() {
        return codVendedor;
    }

    public void setCodVendedor(Integer codVendedor) {
        this.codVendedor = codVendedor;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "codVendedor=" + codVendedor +
                "calculaComissao" + this.getSalarioComissao() +
                "} " + super.toString();
    }
}
