package br.com.diegobiazin.javacore.streams.test;

import br.com.diegobiazin.javacore.streams.classes.Pessoa;

import java.util.Comparator;
import java.util.List;

public class StreamTest3 {
    public static void main(String[] args) {
        List<Pessoa> pessoas = Pessoa.bancoDePessoas();
        System.out.println(pessoas.stream().anyMatch(p -> p.getSalario() > 4000)); // Alguém com salário maior que 4000 ?
        System.out.println(pessoas.stream().allMatch(p -> p.getIdade() > 18)); // Todos são maiores de 18 ?
        System.out.println(pessoas.stream().noneMatch(p -> p.getIdade() > 18)); // Alguém não é menor do que 18 ?

        pessoas.stream()
                .filter(p -> p.getIdade() < 25)
                .findAny()
                .ifPresent(p -> System.out.println(p.getNome()));

        pessoas.stream()
                .filter(p -> p.getIdade() > 30)
                .sorted(Comparator.comparing(Pessoa::getIdade).reversed())
                .findFirst()
                .ifPresent(p -> System.out.println(p.getNome()));
    }
}
