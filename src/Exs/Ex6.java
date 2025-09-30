package Exs;

import classe.ListaDuplamenteEncadeada;

/*
6. Implemente um procedimento que insira os
elementos de uma lista de inteiros em ordem crescente,
mantendo a lista sempre ordenada após cada inserção.
 */
public class Ex6 {

    public static int inserir(int valor,int valorAnterior, ListaDuplamenteEncadeada<Integer> lista) {

        if (lista.vazia()) {
            lista.inserirInicio(valor);
            valorAnterior = valor;
        }

        if (valor > valorAnterior) {
            lista.inserirFim(valor);
            valorAnterior = valor;
        }

        if (valor < valorAnterior) {
            lista.inserirInicio(valor);
            valorAnterior = valor;
        }

        return valorAnterior;
    }

    public static void main(String[] args) {
        ListaDuplamenteEncadeada<Integer> lista = new ListaDuplamenteEncadeada<>();
        int valorAnterior = 0;

        valorAnterior = inserir(5,valorAnterior ,lista);
        System.out.print("Lista: [");
        lista.printListaDupla();
        System.out.println("]");

        valorAnterior = inserir(8,valorAnterior ,lista);
        System.out.print("Lista: [");
        lista.printListaDupla();
        System.out.println("]");

        inserir(3,valorAnterior ,lista);
        System.out.print("Lista: [");
        lista.printListaDupla();
        System.out.println("]");
    }
}
