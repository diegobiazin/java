package br.com.diegobiazin.javacore.streams.classes;

import java.util.List;
import java.util.Objects;

import static java.util.Arrays.asList;

public class Pessoa {
    private String nome;
    private int idade;
    private double salario;

    public Pessoa(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static List<Pessoa> bancoDePessoas() {
        return asList(
                new Pessoa("Diego", 24, 2000),
                new Pessoa("Biazin", 22, 3500),
                new Pessoa("Joao", 34, 1895),
                new Pessoa("Juliano", 29, 1900),
                new Pessoa("Mayron", 37, 4000),
                new Pessoa("Hugo", 28, 8000),
                new Pessoa("Luan", 21, 2700),
                new Pessoa("Dunha", 21, 3200)
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nome, pessoa.nome);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nome);
    }
}
