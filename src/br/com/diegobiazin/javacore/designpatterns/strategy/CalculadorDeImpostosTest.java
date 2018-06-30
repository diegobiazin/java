package br.com.diegobiazin.javacore.designpatterns.strategy;

import br.com.diegobiazin.javacore.designpatterns.Orcamento;

public class CalculadorDeImpostosTest {

    public static void main(String[] args) {
        Imposto iss = new ISS();
        Imposto icms = new ICMS();

        Orcamento orcamento = new Orcamento(500.0);

        CalculadorDeImpostos calculador = new CalculadorDeImpostos();

        calculador.realizaCalculo(orcamento, icms);
        calculador.realizaCalculo(orcamento, iss);
    }
}
