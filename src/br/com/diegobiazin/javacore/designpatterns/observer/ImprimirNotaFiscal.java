package br.com.diegobiazin.javacore.designpatterns.observer;

public class ImprimirNotaFiscal implements AcoesPedidoDeVenda {
    @Override
    public void executar(PedidoDeVenda pedidoDeVenda) {
        System.out.println("Imprimindo nota fiscal.");
    }
}
