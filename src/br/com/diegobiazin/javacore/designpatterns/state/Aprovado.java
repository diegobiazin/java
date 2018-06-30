package br.com.diegobiazin.javacore.designpatterns.state;

import br.com.diegobiazin.javacore.designpatterns.Orcamento;

public class Aprovado implements EstadoDeUmOrcamento {

    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        orcamento.setValor(orcamento.getValor() - (orcamento.getValor() * 0.02));
    }

    @Override
    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já está em estado de aprovação");
    }

    @Override
    public void reprova(Orcamento orcamento) {
        orcamento.setEstadoAtual(new Reprovado());
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        orcamento.setEstadoAtual(new Finalizado());
    }
}
