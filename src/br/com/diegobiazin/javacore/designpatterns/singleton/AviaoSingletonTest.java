package br.com.diegobiazin.javacore.designpatterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AviaoSingletonTest {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        agendarAssento("1A");
        agendarAssento("1A");

        AviaoSingleton aviaoSingleton1 = AviaoSingleton.getINSTANCE();
        AviaoSingleton aviaoSingleton2 = null;

        Constructor[] constructors = AviaoSingleton.class.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            constructor.setAccessible(true);
            aviaoSingleton2 = (AviaoSingleton) constructor.newInstance();
            break;
        }

        System.out.println(aviaoSingleton1.hashCode());
        System.out.println(aviaoSingleton2.hashCode());
    }

    public static void agendarAssento(String assento){
        AviaoSingleton a = AviaoSingleton.getINSTANCE();
        System.out.println(a.bookAssento(assento));
    }
}
