package br.com.diegobiazin.javacore.designpatterns.state;

import br.com.diegobiazin.javacore.designpatterns.Orcamento;

public class Finalizado implements EstadoDeUmOrcamento {

    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {

    }

    @Override
    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Não posso mudar mais, já estou finalizado!");
    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Não posso mudar mais, já estou finalizado!");
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        throw new RuntimeException("Não posso mudar mais, já estou finalizado!");
    }
}
