import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ListaDupla lista = new ListaDupla();

        System.out.println("-------------------------------");
        lista.adicionar("Homer");
        lista.adicionar("Maggie");
        System.out.println(lista.imprimir());

        lista.esvaziaLista();
        System.out.println(lista.imprimir());

        lista.adicionar("Homer");
        lista.adicionarNoComeco("Bart");
        lista.adicionar(1, "Moll");
        System.out.println(lista.imprimir());

        lista.esvaziaLista();
        System.out.println(lista.imprimir());
        System.out.println("-------------------------------");

        lista.adicionar("Homer");
        lista.adicionar("Bart");
        lista.adicionarNoComeco("Lisa");
        System.out.println(lista.imprimir() + "\ntamanho da lista: " + lista.tamanho());

        lista.esvaziaLista();
        System.out.println(lista.imprimir());

        lista.adicionar("Homer");
        lista.adicionar("Maggie");
        lista.adicionar(0, "Bart");
        lista.adicionar(1, "Marge");
        System.out.println(lista.imprimir() + "\n" + lista.contem("Lisa"));

        lista.esvaziaLista();
        System.out.println(lista.imprimir());
        System.out.println("-------------------------------");

        lista.adicionar("Homer");
        lista.adicionarNoComeco("Bart");
        System.out.println(lista.imprimir() + "\ntamanho da lista: " + lista.tamanho());

        boolean[] check_0 = { lista.contem("Marge"), lista.contem("Homer"), lista.contem("Bart"), lista.contem("Maggie") };
        System.out.println(Arrays.toString(check_0) + "\ntamanho da lista: " + lista.tamanho());

        lista.esvaziaLista();
        System.out.println(lista.imprimir());

        lista.adicionarNoComeco("Homer");
        lista.adicionarNoComeco("Bart");
        lista.adicionar("Marge");
        lista.adicionar(1, "Maggie");
        lista.adicionarNoComeco("Ned Flanders");
        lista.adicionar(lista.tamanho(), "Sr. Burns");
        System.out.println(lista.imprimir());

        lista.remove(lista.tamanho() - 1);
        System.out.println(lista.imprimir());

        lista.remove(1);
        System.out.println(lista.imprimir() + "\ntamanho da lista: " + lista.tamanho());
        boolean[] check_1 = { lista.contem("Marge"), lista.contem("Homer"), lista.contem("Bart"),
                lista.contem("Maggie") };
        System.out.println(Arrays.toString(check_1) + "\ntamanho da lista: " + lista.tamanho());

        lista.removedoComeco();
        System.out.println(lista.imprimir() + "\ntamanho da lista: " + lista.tamanho());

        boolean[] check_2 = { lista.contem("Marge"), lista.contem("Homer"), lista.contem("Bart"),
                lista.contem("Maggie") };
        System.out.println(Arrays.toString(check_2) + "\ntamanho da lista: " + lista.tamanho());

        lista.esvaziaLista();
        System.out.println(lista.imprimir());

    }
}
