package Exs;

/*
3. Implemente um procedimento que concatene duas listas
encadeadas simples em uma terceira lista, preservando
a ordem dos elementos.
 */

import classe.ListaDuplamenteEncadeada;

public class Ex3 {
    public static ListaDuplamenteEncadeada concatenarListas(ListaDuplamenteEncadeada a, ListaDuplamenteEncadeada b) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada<>();

        while (!a.vazia()) {
            lista.inserirFim(a.removerInicio());
        }

        while (!b.vazia()) {
            lista.inserirFim(b.removerInicio());
        }

        return lista;
    }

    public static void main(String[] args) {

        //Construindo as listas
        ListaDuplamenteEncadeada<Integer> lista1 = new ListaDuplamenteEncadeada<>();
        lista1.inserirInicio(3);
        lista1.inserirInicio(2);
        lista1.inserirInicio(1);
        System.out.print("ListaDuplamenteEncadeada 1: [");
        lista1.printListaDupla();
        System.out.println("] ");

        ListaDuplamenteEncadeada<Integer> lista2 = new ListaDuplamenteEncadeada<>();
        lista2.inserirInicio(6);
        lista2.inserirInicio(5);
        lista2.inserirInicio(4);
        System.out.print("ListaDuplamenteEncadeada 2: [");
        lista2.printListaDupla();
        System.out.println("] ");

        //Construindo a lista 3 já na concatenacao
        ListaDuplamenteEncadeada<Integer> lista3 = concatenarListas(lista1, lista2);
        System.out.print("ListaDuplamenteEncadeada 3: [");
        lista3.printListaDupla();
        System.out.println("] ");
    }
}
