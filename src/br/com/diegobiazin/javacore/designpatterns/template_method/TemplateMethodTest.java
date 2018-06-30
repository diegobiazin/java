package br.com.diegobiazin.javacore.designpatterns.template_method;

import br.com.diegobiazin.javacore.designpatterns.Item;
import br.com.diegobiazin.javacore.designpatterns.Orcamento;

public class TemplateMethodTest {
    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(600);
        orcamento.adicionarItem(new Item("CANETA", 250));
        orcamento.adicionarItem(new Item("LAPIS", 250));
        orcamento.adicionarItem(new Item("GELADEIRA", 250));
        orcamento.adicionarItem(new Item("FOGAO", 500));
        orcamento.adicionarItem(new Item("MICROONDAS", 250));
        orcamento.adicionarItem(new Item("XBOX", 250));

        TemplateDeImpostoCondicional icpp = new ICPP();
        TemplateDeImpostoCondicional ikcv = new IKCV();

        System.out.println(icpp.calcula(orcamento));
        System.out.println(ikcv.calcula(orcamento));
    }
}
