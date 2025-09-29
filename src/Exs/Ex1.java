package Exs;

/*
1. Implemente um procedimento que percorra uma lista
de inteiros e conte quantas vezes um determinado valor aparece.
 */


import classe.ListaDuplamenteEncadeada;

public class Ex1 {

    //Metodo para percorrer a lista e contar a aparicao do valor
    public static void percorrerLista(ListaDuplamenteEncadeada lista, int valor) {
        //Criando um contador
        int quant = 0;

        if (lista.vazia()) {
            System.out.println("ListaDuplamenteEncadeada está vazia!");
        } else {
            while (!lista.vazia()) {
                if (valor == (int) lista.primeiro()) {

                    quant ++;
                }
                lista.removerInicio();
            }

            if (quant == 0) {
                System.out.println("O número " + valor + " não foi encontrado nessa lista");
            } else {
                System.out.println("O número " + valor + " foi encontrado nessa lista ");
                System.out.println("Quantidade: " + quant);
            }
        }
    }

    public static void main(String[] args) {

      //Criando a lista e populando-a
        ListaDuplamenteEncadeada<Integer> lista = new ListaDuplamenteEncadeada<>();
        lista.inserirInicio(1);
        lista.inserirFim(2);
        lista.inserirFim(3);
        lista.inserirPosicao(1,2);

        System.out.print("ListaDuplamenteEncadeada: [");
        lista.printListaDupla();
        System.out.println("]");

        //Valor a ser pesquisado
        int valor = 2;

        //Pesquisando e falando o resultado
        percorrerLista(lista, valor);
    }
}
