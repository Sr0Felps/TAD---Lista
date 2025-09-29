package Exs;

import classe.ListaDuplamenteEncadeada;

/*
4. Implemente um procedimento que receba
uma lista de inteiros e remova todos os
elementos pares, preservando apenas os ímpares.
 */
public class Ex4 {
    public static void removerPares(ListaDuplamenteEncadeada lista) {
        ListaDuplamenteEncadeada<Integer> listaImpares = new ListaDuplamenteEncadeada<>();

        while (!lista.vazia()) {
            if ((int) lista.primeiro() % 2 == 0) {
                lista.removerInicio();
            } else {
                listaImpares.inserirFim((int) lista.removerInicio());
            }
        }

        System.out.print("ListaDuplamenteEncadeada sem números pares: [");
        listaImpares.printListaDupla();
        System.out.println("] ");
    }

    public static void main(String[] args) {
        //Criando a lista
        ListaDuplamenteEncadeada<Integer> lista = new ListaDuplamenteEncadeada<>();
        lista.inserirFim(1);
        lista.inserirFim(2);
        lista.inserirFim(3);
        lista.inserirFim(4);
        lista.inserirFim(5);
        lista.inserirFim(6);

        System.out.print("ListaDuplamenteEncadeada Original: [");
        lista.printListaDupla();
        System.out.println("] ");

        //Criando a lista de impares
        removerPares(lista);
    }
}
