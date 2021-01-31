package com.crashcourse.Listas;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class queueLista {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Queue<String> filaBanco = new LinkedList<>();
	filaBanco.add("william");
	filaBanco.add("joao");
	filaBanco.add("pedro");
	filaBanco.add("marcos");
	filaBanco.add("jose");
	filaBanco.add("pamela");
	System.out.println(filaBanco);

	// Removendo o ultimo elemento da fila
	String primeiro = filaBanco.poll();

	System.out.println(primeiro);

	System.out.println(filaBanco);

	primeiro = filaBanco.peek();

	System.out.println(primeiro);
	// filaBanco.clear();
	// primeiro elemento ou retorna erro se nao existir
	// String elemento = filaBanco.element();
	String elemento = filaBanco.peek(); // retorna null
	System.out.println("elemento  " + elemento);

	for (String cliente : filaBanco) {
	    System.out.println("cliente: " + cliente);
	}

	Iterator<String> IteratorFilaBanco = filaBanco.iterator();

	while (IteratorFilaBanco.hasNext()) {
	    System.out.println("iterator:" + IteratorFilaBanco.next());
	}
    }

}
