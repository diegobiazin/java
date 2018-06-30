package br.com.diegobiazin.javacore.designpatterns.strategy;

import br.com.diegobiazin.javacore.designpatterns.Orcamento;

public class CalculadorDeImpostos {

    public void realizaCalculo(Orcamento orcamento, Imposto imposto){
        double resultado = imposto.calcula(orcamento);
        System.out.println(resultado);
    }
}
