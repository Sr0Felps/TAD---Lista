package Exs;

import classe.ListaDuplamenteEncadeada;

/*
7. Implemente um procedimento que verifique se uma lista de caracteres forma um palíndromo.
Exemplo: [R, A, D, A, R] → true.
 */
public class Ex7 {

    public static boolean verificar(ListaDuplamenteEncadeada lista) {
        ListaDuplamenteEncadeada<String> listaSuporte = lista;
        boolean verificado = false;

       //Numero par de casas
        if (listaSuporte.tamanho() % 2 == 0) {
            for (int i = listaSuporte.tamanho() / 2; i > 0; i--) {
                if (lista.removerInicio() == lista.removerFim()) {
                    verificado = true;
                } else {
                    break;
                }
            }
        }

        //Numero impar de casas
        if (!(listaSuporte.tamanho() % 2 == 0)) {
            for (int i = listaSuporte.tamanho() / 2; i > 0; i--) {
                if (lista.removerInicio() == lista.removerFim()) {
                    verificado = true;
                } else {
                    break;
                }
            }
        }

        return verificado;
    }

    public static void main(String[] args) {

        //Lista de caracteres
        ListaDuplamenteEncadeada<String> lista = new ListaDuplamenteEncadeada<>();
        lista.inserirFim("A");
        lista.inserirFim("R");
        lista.inserirFim("A");
        lista.inserirFim("R");
        lista.inserirFim("A");

        System.out.print("Palavra: ");
        lista.printListaDupla();
        System.out.println(" ");

        if (verificar(lista)) {
            System.out.println("É um palíndromo");
        } else {
            System.out.println("Não é um palíndromo");
        }
    }
}
