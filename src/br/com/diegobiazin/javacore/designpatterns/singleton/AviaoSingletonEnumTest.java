package br.com.diegobiazin.javacore.designpatterns.singleton;

public class AviaoSingletonEnumTest {
    public static void main(String[] args) {
        AviaoSingletonEnum.agendarAssento("1B");
        AviaoSingletonEnum.agendarAssento("1B");
    }
}
