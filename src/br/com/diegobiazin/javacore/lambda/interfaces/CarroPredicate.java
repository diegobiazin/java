package br.com.diegobiazin.javacore.lambda.interfaces;

import br.com.diegobiazin.javacore.lambda.classes.Carro;

@FunctionalInterface
public interface CarroPredicate {
    boolean test(Carro carro);
}
