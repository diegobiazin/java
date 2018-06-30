package br.com.diegobiazin.javacore.designpatterns.strategy;

import br.com.diegobiazin.javacore.designpatterns.Orcamento;

public interface Imposto {

    double calcula(Orcamento orcamento);
}
