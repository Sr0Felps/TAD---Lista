package Exs;

/*
2. Implemente um procedimento que receba uma lista
de strings e inverta a ordem dos elementos, modificando
a lista original.
 */

import classe.ListaDuplamenteEncadeada;

public class Ex2 {
    public static void main(String[] args) {

        //Criando a lista e populando-a
        ListaDuplamenteEncadeada<String> lista = new ListaDuplamenteEncadeada<>();

        lista.inserirInicio("C");
        lista.inserirInicio("B");
        lista.inserirInicio("A");
        lista.inserirFim("D");

        System.out.print("ListaDuplamenteEncadeada Original: [");
        lista.printListaDupla();
        System.out.println("] ");

        inverter(lista);
    }

    public static void inverter(ListaDuplamenteEncadeada<String> lista){

        for (int i = lista.tamanho(); i > 0; i--) {
            lista.inserirFim(lista.removerPosicao(i - 1) );
        }
        System.out.print("ListaDuplamenteEncadeada Invertida: [");
        lista.printListaDupla();
        System.out.println("] ");
    }
}
