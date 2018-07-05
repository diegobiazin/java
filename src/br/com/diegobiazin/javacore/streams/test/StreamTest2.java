package br.com.diegobiazin.javacore.streams.test;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class StreamTest2 {
    public static void main(String[] args) {
        List<List<String>> nomes = new ArrayList<>();
        nomes.add(asList("Diego", "Biazin"));
        nomes.add(asList("João", "Kleber"));
        List<String> collect = nomes.stream().flatMap(Collection::stream).collect(Collectors.toList());
        collect.forEach(System.out::println);

        List<String> palavras = asList("Dota 2", "JAVA");
        String[] split = palavras.get(0).split("");
        System.out.println(Arrays.toString(split));

        List<String[]> collect1 = palavras.stream().map(p -> p.split("")).collect(Collectors.toList());
        Stream<String> stream = Arrays.stream((String[]) palavras.toArray());
        List<String> collect2 = palavras.stream()
                .map(p -> p.split("")) // Stream<String[]>
                .flatMap(Arrays::stream) // Stream<String>
                .collect(Collectors.toList());
        System.out.println(collect2);

    }
}
