package br.com.diegobiazin.javacore.designpatterns.chain_of_responsibility;

import br.com.diegobiazin.javacore.designpatterns.Orcamento;

public class CalculadorDeDescontos {

    public double calcula(Orcamento orcamento) {
//        if (orcamento.getItens().size() >= 5)
//            return orcamento.getValor() * 0.1;
//        else if (orcamento.getValor() >= 500.0)
//            return orcamento.getValor() *0.7;
//
//        return 0;

        Desconto desconto = new DescontoPorCincoItens(
                new DescontoPorMaisDeQuinhentosReais(
                        new SemDesconto()));

        return desconto.desconta(orcamento);
    }
}
