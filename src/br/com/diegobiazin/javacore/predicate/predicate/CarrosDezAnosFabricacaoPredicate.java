package br.com.diegobiazin.javacore.predicate.predicate;

import br.com.diegobiazin.javacore.predicate.classes.Carro;
import br.com.diegobiazin.javacore.predicate.interfaces.CarroPredicate;

import java.util.Calendar;

public class CarrosDezAnosFabricacaoPredicate implements CarroPredicate {
    @Override
    public boolean test(Carro carro) {
        return carro.getAno() > Calendar.getInstance().get(Calendar.YEAR) - 10;
    }
}
