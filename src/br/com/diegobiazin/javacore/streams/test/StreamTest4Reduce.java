package br.com.diegobiazin.javacore.streams.test;

import br.com.diegobiazin.javacore.streams.classes.Pessoa;

import java.util.Optional;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class StreamTest4Reduce {
    public static void main(String[] args) {
        Optional<Integer> reduce =  getStream().reduce((x, y) -> x + y);
        System.out.println(reduce.get());

        Integer soma =  getStream().reduce(0, (x, y) -> x + y);
        System.out.println(soma);

        Optional<Integer> soma2 =  getStream().reduce(Integer::sum);
        System.out.println(soma2.get());

        Integer mult = getStream().reduce(0, (x, y) -> x * y);
        System.out.println(mult);

        Optional<Integer> max = getStream().reduce((x, y) -> x > y ? x : y);
        System.out.println(max.get());

        Optional<Integer> max2 = getStream().reduce(Integer::max);
        System.out.println(max2.get());

        Optional<Double> somaSalario = getBancoPessoa().filter(p -> p.getSalario() > 4000)
                .map(Pessoa::getSalario)
                .reduce(Double::sum);
        System.out.println(somaSalario.get());

        double sum = getBancoPessoa()
                .filter(p -> p.getSalario() > 4000)
                .mapToDouble(Pessoa::getSalario)
                .sum();
        System.out.println(sum);


        DoubleStream doubleStream = getBancoPessoa()
                .filter(p -> p.getSalario() > 4000)
                .mapToDouble(Pessoa::getSalario);

        Stream<Double> doubleStream1 = doubleStream.boxed();
    }

    private static Stream<Pessoa> getBancoPessoa() {
        return Pessoa.bancoDePessoas().stream();
    }

    private static Stream<Integer> getStream() {
        return asList(1,2,3,4,5,6).stream();
    }
}
