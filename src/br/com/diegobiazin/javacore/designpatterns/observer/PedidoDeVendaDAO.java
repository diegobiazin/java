package br.com.diegobiazin.javacore.designpatterns.observer;

public class PedidoDeVendaDAO implements AcoesPedidoDeVenda {
    @Override
    public void executar(PedidoDeVenda pedidoDeVenda) {
        System.out.println("Salvo no banco!");
    }
}
