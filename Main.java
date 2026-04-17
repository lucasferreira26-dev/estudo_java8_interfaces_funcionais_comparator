package Aula3_Interfaces_Funcionais_labs;

import java.util.*;

public class Main {

    public static void main(String[] args){

        // Esse exercicio busca explorar uma interface funcional, no caso a interface Comparator
        // em conjunto com uma expressão lambda, que não é obrigatória, mas ela ajuda a deixar
        // nosso código muito mais enxuto

        List<Pedido> pedidos = Arrays.asList(
                new Pedido("Lucas", 300),
                new Pedido("Ana", 700),
                new Pedido("Carlos", 1200)
        );

        // Criamos uma cópia da lista original para analisar os critérios, e assim deixamos ela intacta
        List<Pedido> copiaPedidos = new ArrayList<>(pedidos);

        // Nesse exercicio vamos ordenar os pedido em ordem crescente antes de apresentar seus objetos
        // Comparator é uma interface funcional
        Comparator<Pedido> ordernarPorValor = (pedido1, pedido2) ->
                // O método Double.compare(d1, d2) em Java é um método estático
                // utilizado para comparar dois valores primitivos double de forma segura e precisa,
                // retornando um inteiro: 0 se forem iguais, um valor menor que 0 se d1 < d2, e
                // maior que 0 se d1 > d2
                Double.compare(pedido1.getValor(), pedido2.getValor());

        Collections.sort(copiaPedidos, ordernarPorValor);

        copiaPedidos.forEach(p -> System.out.println(p.getCliente() + " - R$ " + p.getValor()));


        System.out.println("-----------------------");

        // Desafio 1: Ordenar a lista de forma decrescente
        Comparator<Pedido> ordenarDecrescente = (pedido1, pedido2) ->
                Double.compare(pedido2.getValor(), pedido1.getValor());

        Collections.sort(copiaPedidos,ordenarDecrescente);

        copiaPedidos.forEach(p -> System.out.println(p.getCliente() + " - R$ " + p.getValor()));

        System.out.println("-----------------------");

        // Desafio 2: Ordenar a lista por ordem alfabética dos nomes dos clientes
        Comparator<Pedido> ordenarPorNome = (pedido1, pedido2) ->
                // O método compareTo em Java compara o objeto atual com outro objeto (passado como argumento)
                //  para determinar a ordem, retornando um inteiro. Ele é usado para ordenação,
                //  retornando: zero se iguais, um valor negativo se o atual for menor, e positivo se o
                //  atual for maior.
                pedido1.getCliente().compareTo(pedido2.getCliente());

        Collections.sort(copiaPedidos, ordenarPorNome);

        copiaPedidos.forEach(p -> System.out.println(p.getCliente() + " - R$ " + p.getValor()));

        System.out.println("-----------------------");

        // Desafio 3: criar um método estático que recebe uma Lista de pedidos e um Comparator. Esse método vai
        // receber a cópia da lista e todos os critérios que vimos neste exercicio

        ordenaPedido(copiaPedidos, ordernarPorValor);

        System.out.println("-----------------------");

        ordenaPedido(copiaPedidos, ordenarDecrescente);

        System.out.println("-----------------------");

        ordenaPedido(copiaPedidos, ordenarPorNome);

    }

    public static void ordenaPedido(List<Pedido> pedidos, Comparator<Pedido> criterio){

        List<Pedido> copiaPedidos = new ArrayList<>(pedidos);

        Collections.sort(copiaPedidos, criterio);

        copiaPedidos.forEach(p -> System.out.println(p.getCliente() + " - R$ " + p.getValor()));
    }
}
