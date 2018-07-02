package br.com.diegobiazin.javacore.lambda;

import java.security.PrivilegedAction;
import java.util.concurrent.Callable;
import java.util.function.Supplier;

public class LambdaTest2 {
    public static void main(String[] args) {
        Callable<Integer> c = () -> 100;
        PrivilegedAction<Integer> p = () -> 100;
        Supplier<String> sup1 = () -> "OI";

        System.out.println(sup1.get());
    }
}
