package br.com.diegobiazin.javacore.novasRegrasInterface.classes;

import br.com.diegobiazin.javacore.novasRegrasInterface.interfaces.InterfaceA;
import br.com.diegobiazin.javacore.novasRegrasInterface.interfaces.InterfaceB;
import br.com.diegobiazin.javacore.novasRegrasInterface.interfaces.InterfaceD;

public class C implements InterfaceA, InterfaceB {
    public static void main(String[] args) {
        new C().oi();
    }

    public void oi(){
        InterfaceB.super.oi();
    }
}
