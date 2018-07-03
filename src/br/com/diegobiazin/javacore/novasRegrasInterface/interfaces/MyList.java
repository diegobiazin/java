package br.com.diegobiazin.javacore.novasRegrasInterface.interfaces;

public interface MyList {
    static void sort(){
        System.out.println("Dentro do sort.");
    }

    void add();

    default void remove(){
        System.out.println("Dentro do remove.");
    }
}
