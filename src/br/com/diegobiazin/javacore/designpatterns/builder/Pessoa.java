package br.com.diegobiazin.javacore.designpatterns.builder;

public class Pessoa {
    private String nome;
    private String nomeDoMeio;
    private String ultimoNome;
    private String apelido;
    private String nomePai;

    public Pessoa(String nome, String nomeDoMeio, String ultimoNome, String apelido, String nomePai) {
        this.nome = nome;
        this.nomeDoMeio = nomeDoMeio;
        this.ultimoNome = ultimoNome;
        this.apelido = apelido;
        this.nomePai = nomePai;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeDoMeio() {
        return nomeDoMeio;
    }

    public void setNomeDoMeio(String nomeDoMeio) {
        this.nomeDoMeio = nomeDoMeio;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", nomeDoMeio='" + nomeDoMeio + '\'' +
                ", ultimoNome='" + ultimoNome + '\'' +
                ", apelido='" + apelido + '\'' +
                ", nomePai='" + nomePai + '\'' +
                '}';
    }
}
