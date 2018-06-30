package br.com.diegobiazin.javacore.designpatterns.chain_of_responsibility;

import br.com.diegobiazin.javacore.designpatterns.Item;
import br.com.diegobiazin.javacore.designpatterns.Orcamento;

public class CalculadorDeDescontosTest {

    public static void main(String[] args) {
        CalculadorDeDescontos calculador = new CalculadorDeDescontos();

        Orcamento orcamento = new Orcamento(500);
        orcamento.adicionarItem(new Item("CANETA", 250));
        orcamento.adicionarItem(new Item("LAPIS", 250));
        orcamento.adicionarItem(new Item("GELADEIRA", 250));
        orcamento.adicionarItem(new Item("FOGAO", 250));
        orcamento.adicionarItem(new Item("MICROONDAS", 250));
        orcamento.adicionarItem(new Item("XBOX", 250));

        double desconto = calculador.calcula(orcamento);

        System.out.println(desconto);
    }
}
