package br.com.diegobiazin.javacore.designpatterns.state;

import br.com.diegobiazin.javacore.designpatterns.Orcamento;

public class EmAprovacao implements EstadoDeUmOrcamento {

    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        orcamento.setValor(orcamento.getValor() - (orcamento.getValor() * 0.05));
    }

    @Override
    public void aprova(Orcamento orcamento) {
        orcamento.setEstadoAtual(new Aprovado());
    }

    @Override
    public void reprova(Orcamento orcamento) {
        orcamento.setEstadoAtual(new Reprovado());
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        throw new RuntimeException("Orcamento em aprovação não podem ir para finalizado diretamente");
    }
}
