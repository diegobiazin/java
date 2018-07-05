package br.com.diegobiazin.javacore.optional.test;

import java.util.Optional;

public class OptionalTest {
    private String nome;

    public static void main(String[] args) {
        OptionalTest ot = new OptionalTest();
        Optional<String> optional = Optional.of("Diego");
        Optional<String> optional2 = Optional.empty();
        Optional<String> optional3 = Optional.ofNullable(ot.nome);

        System.out.println(optional);
        System.out.println(optional2);
        System.out.println(optional3);

        System.out.println(optional.orElse("vazio"));
        if (optional2.isPresent())
            System.out.println(optional2.get());
        System.out.println(optional2.orElse("optional2 vazio"));
        System.out.println(optional2.orElse("optional3 vazio"));
    }
}
