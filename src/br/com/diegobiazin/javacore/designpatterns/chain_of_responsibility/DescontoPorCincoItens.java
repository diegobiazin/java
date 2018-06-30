package br.com.diegobiazin.javacore.designpatterns.chain_of_responsibility;

import br.com.diegobiazin.javacore.designpatterns.Orcamento;

public class DescontoPorCincoItens implements Desconto {

    private Desconto proximo;

    public DescontoPorCincoItens(Desconto proximo){
        this.proximo = proximo;
    }

    @Override
    public double desconta(Orcamento orcamento) {
        if (orcamento.getItens().size() > 5)
            return orcamento.getValor() * 0.1;

        return proximo.desconta(orcamento);
    }

}
