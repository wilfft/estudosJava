package com.crashcourse.Listas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class exercicioLista {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	List<String> nomes = new ArrayList<>();

	Queue<String> filaNomes = new LinkedList<>();
	filaNomes.add("Juliana");
	filaNomes.add("Pedro");
	filaNomes.add("Carlos");
	filaNomes.add("Larissa");
	filaNomes.add("Joao");

	for (String nome : filaNomes) {
	    System.out.println(nome);
	}

	String primeiro = filaNomes.peek();
	System.out.println("PRIMEIRO:" + primeiro);
	String primeirFora = filaNomes.poll();
	System.out.println("PRIMEIRO FORA:" + primeirFora);
	System.out.println(filaNomes);
	filaNomes.add("Daniel");
	System.out.println(filaNomes);
	System.out.println(filaNomes.size());
	System.out.println(filaNomes.isEmpty());
	System.out.println(filaNomes.contains("Carlos"));

	nomes.add("Juliana");
	nomes.add("Pedro");
	nomes.add("Carlos");
	nomes.add("Larissa");
	nomes.add("Joao");
	System.out.println(nomes);

    }

}
