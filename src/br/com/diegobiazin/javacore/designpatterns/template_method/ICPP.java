package br.com.diegobiazin.javacore.designpatterns.template_method;

import br.com.diegobiazin.javacore.designpatterns.Orcamento;

public class ICPP extends TemplateDeImpostoCondicional {
    @Override
    protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() >= 500;
    }

    @Override
    protected double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.07;
    }

    @Override
    protected double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.05;
    }
}
