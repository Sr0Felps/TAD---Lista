package Exs;

import classe.ListaDuplamenteEncadeada;

/*
9. Implemente um procedimento que divida uma lista encadeada
de inteiros em duas: uma contendo apenas elementos menores
que um valor X e outra contendo os elementos maiores ou iguais a X.
 */
public class Ex9 {
    public static void dividirLista(ListaDuplamenteEncadeada original, int x, ListaDuplamenteEncadeada maiores, ListaDuplamenteEncadeada menores) {
        for (int i = original.tamanho() - 1; i > 0; i--) {
            if ((int) original.get(i) >= x + 1) {
                maiores.inserirInicio(i);
            } else {
                menores.inserirInicio(i);
            }
        }

        System.out.print("Lista Maiores e igual: ");
        maiores.printListaDupla();
        System.out.println(" ");

        System.out.print("Lista Menores: ");
        menores.printListaDupla();
        System.out.println(" ");

    }

    public static void main(String[] args) {
        //Lista original
        ListaDuplamenteEncadeada<Integer> listaPrincipal = new ListaDuplamenteEncadeada<>();
        listaPrincipal.inserirFim(1);
        listaPrincipal.inserirFim(2);
        listaPrincipal.inserirFim(3);
        listaPrincipal.inserirFim(4);
        listaPrincipal.inserirFim(5);
        listaPrincipal.inserirFim(6);
        listaPrincipal.inserirFim(7);
        listaPrincipal.inserirFim(8);
        listaPrincipal.inserirFim(9);
        listaPrincipal.inserirFim(10);

        System.out.print("Lista Original: ");
        listaPrincipal.printListaDupla();
        System.out.println(" ");

        //Valor X
        int x = 5;
        System.out.println("Valor de X: " + x);


        ListaDuplamenteEncadeada<Integer> listaMenores = new ListaDuplamenteEncadeada<>();
        ListaDuplamenteEncadeada<Integer> listaMaiores = new ListaDuplamenteEncadeada<>();

        dividirLista(listaPrincipal, x, listaMaiores, listaMenores);
    }
}
