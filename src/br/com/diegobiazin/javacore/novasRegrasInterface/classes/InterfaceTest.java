package br.com.diegobiazin.javacore.novasRegrasInterface.classes;

import br.com.diegobiazin.javacore.novasRegrasInterface.interfaces.MyList;

public class InterfaceTest implements MyList {
    public static void main(String[] args) {
        MyList.sort();
        new InterfaceTest().remove();
    }

    @Override
    public void add() {
        System.out.println("Dentro do add.");
    }
}
