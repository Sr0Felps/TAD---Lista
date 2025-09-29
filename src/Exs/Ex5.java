package Exs;

/*
5. Implemente um procedimento que, dada uma lista circular de inteiros,
percorra-a duas voltas completas imprimindo os elementos.
 */

import classe.ListaCircular;

public class Ex5 {
    public static void percorrerLista(ListaCircular lista) {

        System.out.print("Lista: [");

        for (int p = 0; p < 2; p++) {

            for (int i = 0; i < lista.tamanho(); i++) {

                if (lista.get(i) == lista.tamanho() && p == 1) {
                    System.out.println(lista.get(i) + "]");
                } else {
                    System.out.print(lista.get(i) + " -> ");
                }
            }
        }
    }

    public static void main(String[] args) {
        //Criando a lista
        ListaCircular<Integer> listaCircular = new ListaCircular<>();
        listaCircular.inserirFim(1);
        listaCircular.inserirFim(2);
        listaCircular.inserirFim(3);
        listaCircular.inserirFim(4);
        listaCircular.inserirFim(5);
        listaCircular.inserirFim(6);
        listaCircular.inserirFim(7);

        System.out.print("Lista Original: [");
        listaCircular.printLista();
        System.out.println("]");

        percorrerLista(listaCircular);
    }
}
