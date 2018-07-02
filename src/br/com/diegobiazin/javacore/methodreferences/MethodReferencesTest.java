package br.com.diegobiazin.javacore.methodreferences;

import br.com.diegobiazin.javacore.methodreferences.classes.ComparadorCarro;
import br.com.diegobiazin.javacore.methodreferences.classes.Carro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.*;

import static java.util.Arrays.asList;

public class MethodReferencesTest {
    public static void main(String[] args) {
        forEach(asList("Diego", "Biazin", "Dota 2"), System.out::println);
        List<Carro> carros = asList(new Carro("verde", 1999), new Carro("vermelho", 2005), new Carro("branco", 1985));

        //Reference to a static method
        Collections.sort(carros, (c1, c2) -> ComparadorCarro.comparePorCor(c1, c2));
        Collections.sort(carros, ComparadorCarro::comparePorCor);
        System.out.println(carros);

        //Reference to an instance method of a particular object
        ComparadorCarro comparadorCarro = new ComparadorCarro();
        Collections.sort(carros, comparadorCarro::comparePorAno);
        System.out.println(carros);

        //Reference to an instance method of arbitrary object of a particular type
        List<String> nomes = asList("Diego", "Biazin", "Franscisco");
        nomes.sort((s1, s2) -> s2.compareTo(s1));
        nomes.sort(String::compareTo);
        System.out.println(nomes);

        Function<String, Integer> stringToInteger = (String s) -> Integer.parseInt(s);
        Function<String, Integer> stringToInteger2 = Integer::parseInt;
        System.out.println(stringToInteger2.apply("10"));

        BiPredicate<List<String>, String> contains = (lista, elemento) -> lista.contains(elemento);
        BiPredicate<List<String>, String> contains2 = List::contains;
        System.out.println(contains2.test(nomes, "Diego"));

        //Reference to a constructor
        Supplier<ComparadorCarro> comparadorCarroSupplier = ComparadorCarro::new;
        Collections.sort(carros, comparadorCarroSupplier.get()::comparePorAno);

        BiFunction<String, Integer, Carro> carroBiFunction = (s, i) -> new Carro(s, i);
        BiFunction<String, Integer, Carro> carroBiFunction2 = Carro::new;
        System.out.println(carroBiFunction.apply("azul", 1997));
        System.out.println(carroBiFunction2.apply("prata", 2001));
    }

    public static <T> void forEach(List<T> list, Consumer<T> c) {
        for (T e : list) {
            c.accept(e);
        }
    }
}
