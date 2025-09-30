package Exs;

import classe.ListaCircular;

/*
10. Implemente um procedimento que, em uma lista circular,
realize uma simulação da “brincadeira da batata quente”:
dada uma lista de nomes e um número K, percorra a lista
contando até K, remova o elemento atual e continue até
restar apenas um nome (o vencedor).
*/
public class Ex10 {

    public static void brincar(ListaCircular<String> lista, int k) {
        if (lista.tamanho() < 1) {
            System.out.println("Não há participantes para brincar.");
            return;
        }

        int indiceInicial = 0;

        while (lista.tamanho() > 1) {
            System.out.println("\n-------------------------------------------");
            lista.printLista();
            System.out.println("\nPróxima contagem K = " + k);

            int passos = k - 1;

            int indiceAlvo = (indiceInicial + passos) % lista.tamanho();

            String eliminado = lista.get(indiceAlvo);

            System.out.println("Ba-ta-ta, quente, quente, quente... QUEIMOU!");
            System.out.println("O eliminado é: " + eliminado + " (na posição " + indiceAlvo + ")");

            lista.removerPosicao(indiceAlvo);

            if (indiceAlvo == lista.tamanho()) {
                indiceInicial = 0;
            } else {
                indiceInicial = indiceAlvo;
            }
        }

        if (lista.tamanho() == 1) {
            String vencedor = lista.get(0);
            System.out.println("\n*******************************************");
            System.out.println("Lista Final: " + lista.toString());
            System.out.println("O VENCEDOR é: " + vencedor);
            System.out.println("*******************************************");
        } else {
            System.out.println("\nFim do jogo.");
        }
    }

    public static void main(String[] args) {
        ListaCircular<String> listaCircular = new ListaCircular<>();
        listaCircular.inserirFim("João");
        listaCircular.inserirFim("Fernando");
        listaCircular.inserirFim("Rafael");
        listaCircular.inserirFim("Helena");
        listaCircular.inserirFim("Isadora");
        listaCircular.inserirFim("Leonardo");
        listaCircular.inserirFim("Maria");

        int k = 4;

        brincar(listaCircular, k);
    }
}