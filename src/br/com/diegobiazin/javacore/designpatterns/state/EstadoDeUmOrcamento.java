package br.com.diegobiazin.javacore.designpatterns.state;

import br.com.diegobiazin.javacore.designpatterns.Orcamento;

public interface EstadoDeUmOrcamento {
    void aplicaDescontoExtra(Orcamento orcamento);
    void aprova(Orcamento orcamento);
    void reprova(Orcamento orcamento);
    void finaliza(Orcamento orcamento);
}
