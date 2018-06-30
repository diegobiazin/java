package br.com.diegobiazin.javacore.designpatterns.chain_of_responsibility;

import br.com.diegobiazin.javacore.designpatterns.Orcamento;

public class SemDesconto implements Desconto {

    @Override
    public double desconta(Orcamento orcamento) {
        return 0;
    }

}
