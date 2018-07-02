package br.com.diegobiazin.javacore.lambda;

import br.com.diegobiazin.javacore.lambda.classes.Carro;
import br.com.diegobiazin.javacore.lambda.interfaces.CarroPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import static java.util.Arrays.asList;

public class LambdaTest {
    // anonima // function // passada por parametro ou variavel // consisa
    // Assinatura funcional: test(Carro carro)
    // Programação funcional: Passagem de comportamento para métodos através de interfaces funcionais
    // (parametro) -> <expressao>
    // (Carro carro) - > carro.getCor().equals("verde");

    public static void main(String[] args) {

        carroPredicateXLambda();
        runnableLambda();

        forEach(asList("Diego", "Biazin", "Dota 2"), (String s) -> System.out.println(s));

        List<Integer> list = retornaTamanhoDaPalavra(asList("Diego", "Biazin", "Dota 2"), (String s) -> s.length());
        System.out.println(list);
    }

    public static void carroPredicateXLambda() {
        CarroPredicate carroPredicate = new CarroPredicate() {
            @Override
            public boolean test(Carro carro) {
                return "verde".equals(carro.getCor());
            }
        };

        Predicate<Carro> carroPredicate2 = carro -> "verde".equals(carro.getCor());

        System.out.println(carroPredicate.test(new Carro("Gol", "verde", 2012)));
        System.out.println(carroPredicate2.test(new Carro("Gol", "verde", 2012)));
    }

    public static void runnableLambda() {
        Runnable runnable = () -> System.out.println("Dentro do run");
        new Thread(runnable).start();
    }

    public static void consumerAccept(){
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String strings) {
                System.out.println(strings);
            }
        };

        for (String nome : asList("Diego", "Biazin", "Dota 2"))
            consumer.accept(nome);
    }

    public static <T> void forEach(List<T> list, Consumer<T> c) {
        for (T e : list) {
            c.accept(e);
        }
    }

    public static <T, R> List<R> retornaTamanhoDaPalavra(List<T> list, Function<T, R> f) {
        List<R> result = new ArrayList<>();
        for (T e : list) {
            result.add(f.apply(e));
        }
        return result;
    }
}
