package br.com.diegobiazin.javacore.designpatterns.chain_of_responsibility;

import br.com.diegobiazin.javacore.designpatterns.Orcamento;

public interface Desconto {
    double desconta(Orcamento orcamento);
}
