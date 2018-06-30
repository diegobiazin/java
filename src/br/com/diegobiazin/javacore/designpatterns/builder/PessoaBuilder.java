package br.com.diegobiazin.javacore.designpatterns.builder;

public class PessoaBuilder {
    private String nome;
    private String nomeDoMeio;
    private String ultimoNome;
    private String apelido;
    private String nomePai;

    public PessoaBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public PessoaBuilder nomeDoMeio(String nomeDoMeio) {
        this.nomeDoMeio = nomeDoMeio;
        return this;
    }

    public PessoaBuilder ultimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
        return this;
    }

    public PessoaBuilder apelido(String apelido) {
        this.apelido = apelido;
        return this;
    }

    public PessoaBuilder nomePai(String nomePai) {
        this.nomePai = nomePai;
        return this;
    }

    public Pessoa build() {
        return new Pessoa(nome, nomeDoMeio, ultimoNome, apelido, nomePai);
    }
}
