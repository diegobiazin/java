package br.com.diegobiazin.javacore.designpatterns.strategy;

import br.com.diegobiazin.javacore.designpatterns.Orcamento;

public class ISS implements Imposto {

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.1;
    }
}
