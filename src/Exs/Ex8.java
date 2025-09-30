package Exs;

import classe.ListaDuplamenteEncadeada;

/*
8. Implemente um procedimento que, em uma lista duplamente encadeada
de strings, percorra do início para o fim e depois do fim para o início,
imprimindo todos os elementos nas duas ordens.
 */
public class Ex8 {
    public static void percorrer(ListaDuplamenteEncadeada lista) {
        //Percorrer na ordem orginal
        System.out.print("Ordem original: ");
        for (int i = 0; i < lista.tamanho(); i++) {
            System.out.print(lista.get(i) + " ");
        }
        System.out.println(" ");

        //Percorrer ma ordem invertida
        System.out.print("Ordem inversa: ");
        for (int p = lista.tamanho() - 1; p >= 0; p--) {
            System.out.print(lista.get(p) + " ");
        }
        System.out.println(" ");

        System.out.println("----------------------------------------");
    }

    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> lista = new ListaDuplamenteEncadeada<>();
        lista.inserirFim("A");
        lista.inserirFim("B");
        lista.inserirFim("C");
        lista.inserirFim("D");
        lista.inserirFim("E");
        lista.inserirFim("F");

        System.out.println("----------------------------------------");
        System.out.print("Lista: ");
        lista.printListaDupla();
        System.out.println(" ");
        System.out.println("----------------------------------------");

        percorrer(lista);
    }
}
