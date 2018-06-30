package br.com.diegobiazin.javacore.designpatterns;

import br.com.diegobiazin.javacore.designpatterns.state.EmAprovacao;
import br.com.diegobiazin.javacore.designpatterns.state.EstadoDeUmOrcamento;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {

    public final int EM_APROVACAO = 1;
    public final int APROVADO = 1;
    public final int REPROVADO = 1;
    public final int FINALIZADO = 1;

    private double valor;
    private List<Item> itens;
    private EstadoDeUmOrcamento estadoAtual;

    public Orcamento(double valor) {
        this.valor = valor;
        this.itens = new ArrayList<Item>();
        this.estadoAtual = new EmAprovacao();
    }

    public EstadoDeUmOrcamento getEstadoAtual() {
        return estadoAtual;
    }

    public void setEstadoAtual(EstadoDeUmOrcamento estadoAtual) {
        this.estadoAtual = estadoAtual;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public void aplicaDescontoExtra() {
        estadoAtual.aplicaDescontoExtra(this);
    }

    public void aprova() {
        estadoAtual.aprova(this);
    }

    public void reprova() {
        estadoAtual.reprova(this);
    }

    public void finaliza() {
        estadoAtual.finaliza(this);
    }
//    public void AplicaDescontoExtra() {
//        if (getEstadoAtual() == EM_APROVACAO)
//            setValor(getValor() - (getValor() * 0.5));
//        else if (getEstadoAtual() == APROVADO)
//            setValor(getValor() - (getValor() * 0.2));
//        else
//            System.out.println("Orcamentos reprovados/finalizados não recebem desconto extra");
//    }
}
