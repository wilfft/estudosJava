package com.crashcourse.Listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class exemploListas {

    public static void main(String[] args) {

	List<String> nomes = new ArrayList<>();
	List<Integer> numeros = new ArrayList<>();

	nomes.add("william");
	nomes.add("fabiana");
	nomes.add("pedro");
	nomes.add("jose");
	Collections.sort(nomes);
	nomes.set(1, "IMPOSTOR");
	nomes.remove(1);
	nomes.remove("IMPOSTOR");
	nomes.get(1);
	nomes.size();
	nomes.contains("IMPOSTOR");
	nomes.indexOf("IMPOSTOR");
	nomes.clear();
	nomes.isEmpty();
	for (String item : nomes) {
	    // TODO System out item
	}

	/* ----- ITERATOR >> RETORNA ITERATOR DE STRING ----- */
	// iterator prove 2 metodos interessantes
	// hasNext : Sempre que ouver um proximo elemento na lista, retorma true false
	// next() : Retorna o objeto que estou iterando, no caso uma String

	Iterator<String> iterator = nomes.iterator();
	while (iterator.hasNext()) {
	    System.out.println(iterator.next());
	}

    }

}
