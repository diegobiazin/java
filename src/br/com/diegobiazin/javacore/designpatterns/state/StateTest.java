package br.com.diegobiazin.javacore.designpatterns.state;

import br.com.diegobiazin.javacore.designpatterns.Orcamento;

public class StateTest {

    public static void main(String[] args) {
        Orcamento reforma = new Orcamento(500);

        System.out.println(reforma.getValor());

        reforma.aplicaDescontoExtra();
        System.out.println(reforma.getValor());

        reforma.aprova();

        reforma.aplicaDescontoExtra();
        System.out.println(reforma.getValor());

        reforma.finaliza();
    }
}
