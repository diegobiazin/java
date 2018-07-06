package br.com.diegobiazin.javacore.streams.test;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest5GerandoStreams {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 50).filter(n -> n % 2 == 0).forEach(s -> System.out.print(s + " "));
        System.out.println();
        IntStream.range(1, 50).filter(n -> n % 2 == 0).forEach(s -> System.out.print(s + " "));

        Stream<String> stringStream = Stream.of("Diego", "Biazin", "Dota 2");
        stringStream.map(String::toUpperCase).forEach(s -> System.out.println(s + " "));
        Stream<String> empty = Stream.empty();

        int nums[] = {1, 2, 3, 4, 5, 6};
        OptionalDouble average = Arrays.stream(nums).average();
        System.out.println(average);

        try (Stream<String> lines = Files.lines(Paths.get("src\\br\\com\\diegobiazin\\javacore\\streams\\teste.txt"), Charset.defaultCharset())) {
            lines.flatMap(l -> Arrays.stream(l.split("\n")))
                    .filter(p -> p.contains("Kunkka"))
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Se não colocar limite haverá estouro de memória
        Stream.iterate(1, n -> n + 2).limit(10).forEach(System.out::println);

        Stream.iterate(new int[]{0, 1}, a -> new int[]{a[1], a[0] + a[1]})
                .limit(5)
                .forEach(t -> System.out.println(Arrays.toString(t)));

        Stream.iterate(new int[]{0, 1}, a -> new int[]{a[1], a[0] + a[1]})
                .limit(10)
                .map(t -> t[0])
                .forEach(System.out::println);

        Stream.generate(Math::random).limit(10).forEach(System.out::println);

        ThreadLocalRandom current = ThreadLocalRandom.current();
        Stream.generate(() -> current.nextInt(1,100)).limit(100).forEach(System.out::println);
    }
}
