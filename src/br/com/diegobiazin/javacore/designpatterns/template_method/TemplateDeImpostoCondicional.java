package br.com.diegobiazin.javacore.designpatterns.template_method;

import br.com.diegobiazin.javacore.designpatterns.Orcamento;

public abstract class TemplateDeImpostoCondicional {

    public double calcula(Orcamento orcamento){
        if (deveUsarMaximaTaxacao(orcamento))
            return maximaTaxacao(orcamento);

        return minimaTaxacao(orcamento);
    }

    protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
    protected abstract double maximaTaxacao(Orcamento orcamento);
    protected abstract double minimaTaxacao(Orcamento orcamento);
}
