package br.com.diegobiazin.javacore.designpatterns.chain_of_responsibility;

import br.com.diegobiazin.javacore.designpatterns.Orcamento;

public class DescontoPorMaisDeQuinhentosReais implements Desconto {

    private Desconto proximo;

    public DescontoPorMaisDeQuinhentosReais(Desconto proximo){
        this.proximo = proximo;
    }

    @Override
    public double desconta(Orcamento orcamento) {
        if (orcamento.getValor() > 500)
            return orcamento.getValor() * 0.07;

        return proximo.desconta(orcamento);
    }

}
