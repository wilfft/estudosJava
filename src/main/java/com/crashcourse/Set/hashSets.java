package com.crashcourse.Set;

import java.util.HashSet;
import java.util.Iterator;

public class hashSets {

    public static void main(String[] args) {

	HashSet<Double> lista = new HashSet<>();
	lista.add(1.2);
	lista.add(1.2);
	lista.add(4.4);
	lista.add(4.9);
	lista.add(3.2);

	lista.add(9.9);
	lista.remove(9.9);
	lista.size();
	lista.clear();
	lista.isEmpty();
	for (Double item : lista) {
	    System.out.println(item);
	}

	Iterator<Double> iteraLista = lista.iterator();
	while (iteraLista.hasNext()) {
	    System.out.println("==> " + iteraLista.next());
	}
    }
}
