package br.com.diegobiazin.javacore.predicate.interfaces;

import br.com.diegobiazin.javacore.predicate.classes.Carro;

public interface CarroPredicate {
    boolean test(Carro carro);
}
