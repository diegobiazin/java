package br.com.diegobiazin.javacore.optional.test;

import br.com.diegobiazin.javacore.optional.classes.Carro;
import br.com.diegobiazin.javacore.optional.classes.Pessoa;
import br.com.diegobiazin.javacore.optional.classes.Seguradora;

import java.util.Optional;

public class OptionalTest2 {
    public static void main(String[] args) {
        Seguradora s = new Seguradora("Nova Seguradora");
        Carro carro = new Carro(s, "Golf");
        Pessoa p = new Pessoa(carro, "Diego");
        String retorno = obterNomeSeguradora(Optional.ofNullable(p));
        System.out.println(retorno);

        checarNomeSeguradora(s);
        checarNomeSeguradoraOptional(s);

        p.setIdade(20);
        System.out.println(obterNomeSeguradoraComIdade(p, 18));

        System.out.println(stringToInt("A"));
    }

    private static Optional<Integer> stringToInt(String numero) {
        try {

            return Optional.of(Integer.parseInt(numero));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }

    @Deprecated
    private static void checarNomeSeguradora(Seguradora seguradora) {
        if (seguradora != null && seguradora.getNome().equals("Nova Seguradora"))
            System.out.println("é a Seguradora");
    }

    private static void checarNomeSeguradoraOptional(Seguradora seguradora) {
        Optional.ofNullable(seguradora).filter(s -> s.getNome().equals("Nova Seguradora"))
                .ifPresent(x -> System.out.println("é a Seguradora"));
    }

    public static String obterNomeSeguradora(Optional<Pessoa> p) {
        return p.flatMap(Pessoa::getCarro)
                .flatMap(Carro::getSeguradora)
                .map(Seguradora::getNome)
                .orElse("Não existe seguradora");
    }

    public static String obterNomeSeguradoraComIdade(Pessoa pessoa, int idadeMinima) {
        return Optional.ofNullable(pessoa)
                .filter(p -> p.getIdade() >= idadeMinima)
                .flatMap(Pessoa::getCarro)
                .flatMap(Carro::getSeguradora)
                .map(Seguradora::getNome)
                .orElse("Não existe seguradora ou a idade minima não foi atingida.");
    }

    /*public static String getNomeSeguradora(Pessoa p) {
        if (p != null)
            Carro c = p.getCarro();
        if (c != null) {
            Seguradora s = c.getSeguradora();
            if (s != null)
                return s.getNome();
        }
        return "";
    }*/
}
