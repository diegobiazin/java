package br.com.diegobiazin.javacore.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class PedidoDeVendaTest {
    public static void main(String[] args) {
        PedidoDeVenda pedidoDeVenda = new PedidoDeVenda(1, "Pedido de venda teste.");

        List<AcoesPedidoDeVenda> acoes = new ArrayList<>();
        acoes.add(new ImprimirNotaFiscal());
        acoes.add(new EnviadorDeEmail());
        acoes.add(new PedidoDeVendaDAO());

        pedidoDeVenda.adicionarAcaoPedidoDeVenda(acoes);
        pedidoDeVenda.adicionarItem(new ItemPedidoDeVenda(1, "IPhone X", 8000));
        pedidoDeVenda.adicionarItem(new ItemPedidoDeVenda(1, "Motorola Z3 Play", 2500.99));
        pedidoDeVenda.adicionarItem(new ItemPedidoDeVenda(1, "Nokia 2380", 10000.25));

        System.out.println(pedidoDeVenda);

        pedidoDeVenda.executarAcoes(pedidoDeVenda);
    }
}
