package br.com.diegobiazin.javacore.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class PedidoDeVenda {
    private int codigo;
    private List<ItemPedidoDeVenda> itens = new ArrayList<>();
    private double valorTotal;
    private String observacao;
    private List<AcoesPedidoDeVenda> acoesPedidoDeVendas = new ArrayList<>();

    public PedidoDeVenda(int codigo, String observacao) {
        this.codigo = codigo;
        this.observacao = observacao;
    }

    public int getCodigo() {
        return codigo;
    }

    public List<ItemPedidoDeVenda> getItens() {
        return itens;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public String getObservacao() {
        return observacao;
    }

    public List<AcoesPedidoDeVenda> getAcoesPedidoDeVendas() {
        return acoesPedidoDeVendas;
    }

    public void adicionarItem(ItemPedidoDeVenda item) {
        this.itens.add(item);
        this.valorTotal += item.getValorUnitario();
    }

    public void adicionarAcaoPedidoDeVenda(List<AcoesPedidoDeVenda> acoes) {
        this.acoesPedidoDeVendas = acoes;
    }

    public void executarAcoes(PedidoDeVenda pedido) {
        for (AcoesPedidoDeVenda acao : getAcoesPedidoDeVendas()) {
            acao.executar(pedido);
        }
    }

    @Override
    public String toString() {
        return "PedidoDeVenda{" +
                "codigo=" + codigo +
                ", valorTotal=" + valorTotal +
                ", observacao='" + observacao + '\'' +
                '}';
    }
}
