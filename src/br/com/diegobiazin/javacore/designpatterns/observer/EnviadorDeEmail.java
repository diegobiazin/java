package br.com.diegobiazin.javacore.designpatterns.observer;

public class EnviadorDeEmail implements AcoesPedidoDeVenda {
    @Override
    public void executar(PedidoDeVenda pedidoDeVenda) {
        System.out.println("Enviando e-mail!");
    }
}
