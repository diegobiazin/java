package br.com.diegobiazin.javacore.designpatterns.observer;

public class ItemPedidoDeVenda {
    private int codigo;
    private String descricao;
    private double valorUnitario;

    public ItemPedidoDeVenda(int codigo, String descricao, double valorUnitario) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }
}
