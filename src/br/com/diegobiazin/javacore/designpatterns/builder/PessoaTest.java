package br.com.diegobiazin.javacore.designpatterns.builder;

public class PessoaTest {

    public static void main(String[] args) {
        Pessoa p = new PessoaBuilder()
                .nome("Diego")
                .nomeDoMeio("Biazin")
                .ultimoNome("da Silva")
                .apelido("Biazin")
                .nomePai("Francisco")
                .build() ;

        System.out.println(p);
    }
}
