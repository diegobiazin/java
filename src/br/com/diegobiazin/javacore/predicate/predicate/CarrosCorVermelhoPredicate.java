package br.com.diegobiazin.javacore.predicate.predicate;

import br.com.diegobiazin.javacore.predicate.classes.Carro;
import br.com.diegobiazin.javacore.predicate.interfaces.CarroPredicate;

public class CarrosCorVermelhoPredicate implements CarroPredicate {
    @Override
    public boolean test(Carro carro) {
        return "vermelho".equals(carro.getCor());
    }
}
