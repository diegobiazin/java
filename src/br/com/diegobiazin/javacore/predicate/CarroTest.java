package br.com.diegobiazin.javacore.predicate;

import br.com.diegobiazin.javacore.predicate.classes.Carro;
import br.com.diegobiazin.javacore.predicate.interfaces.CarroPredicate;
import br.com.diegobiazin.javacore.predicate.predicate.CarrosCorVerdePredicate;
import br.com.diegobiazin.javacore.predicate.predicate.CarrosCorVermelhoPredicate;
import br.com.diegobiazin.javacore.predicate.predicate.CarrosDezAnosFabricacaoPredicate;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.function.Predicate;

import static java.util.Arrays.asList;

public class CarroTest {
    public static void main(String[] args) {
        List<Carro> carros = asList(new Carro("Golf", "verde", 2011), new Carro("Astra", "vermelho", 2017), new Carro("Gol", "branco", 1995));
        List<Integer> numeros = asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        //        System.out.println(filtrarCarroVerde(carros));
//        System.out.println(filtrarCarroVermelho(carros));
//        System.out.println(filtrarCarroPorCor(carros, "verde"));
//        System.out.println(filtrarCarroPorCor(carros, "vermelho"));
//        System.out.println(filtrarCarrosDezAnosFabricados(carros));
        System.out.println(filtrarCarros(carros, new CarrosCorVerdePredicate()));
        System.out.println(filtrarCarros(carros, new CarrosCorVermelhoPredicate()));
        System.out.println(filtrarCarros(carros, new CarrosDezAnosFabricacaoPredicate()));

        System.out.println(filtrarCarros(carros, new CarroPredicate() {
            @Override
            public boolean test(Carro carro) {
                return "verde".equals(carro.getCor());
            }
        }));

        System.out.println(filtrar(carros, new Predicate<Carro>() {
            @Override
            public boolean test(Carro carro) {
                return "vermelho".equals(carro.getCor());
            }
        }));

        System.out.println(filtrar(numeros, new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        }));
    }

    private static <T> List<T> filtrar(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T element : list) {
            if (predicate.test(element))
                result.add(element);
        }
        return result;
    }

    private static List<Carro> filtrarCarros(List<Carro> carros, CarroPredicate carroPredicate) {
        List<Carro> result = new ArrayList<>();
        for (Carro carro : carros) {
            if (carroPredicate.test(carro))
                result.add(carro);
        }
        return result;
    }

    private static List<Carro> filtrarCarroVerde(List<Carro> carros) {
        List<Carro> result = new ArrayList<>();
        for (Carro carro : carros) {
            if ("verde".equals(carro.getCor()))
                result.add(carro);
        }
        return result;
    }

    private static List<Carro> filtrarCarroVermelho(List<Carro> carros) {
        List<Carro> result = new ArrayList<>();
        for (Carro carro : carros) {
            if ("vermelho".equals(carro.getCor()))
                result.add(carro);
        }
        return result;
    }

    private static List<Carro> filtrarCarroPorCor(List<Carro> carros, String cor) {
        List<Carro> result = new ArrayList<>();
        for (Carro carro : carros) {
            if (cor.equals(carro.getCor()))
                result.add(carro);
        }
        return result;
    }

    private static List<Carro> filtrarCarrosDezAnosFabricados(List<Carro> carros) {
        List<Carro> result = new ArrayList<>();
        for (Carro carro : carros) {
            if (carro.getAno() > Calendar.getInstance().get(Calendar.YEAR) - 10)
                result.add(carro);
        }
        return result;
    }
}
