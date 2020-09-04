package br.com.itavema.itavema.models;

import br.com.itavema.itavema.interfaces.Comissionado;

public abstract class Funcionario implements Comissionado {

    private String nome;
    private Integer idade;
    private String cpf;
    private String endereco;
    private Double salario;

    public Funcionario(String nome, Integer idade, String cpf, String endereco, Double salario) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = endereco;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public Double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                ", salario=" + salario +
                '}';
    }
}
