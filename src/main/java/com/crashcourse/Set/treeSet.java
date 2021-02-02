package com.crashcourse.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class treeSet {

    public static void main(String[] args) {
	TreeSet<String> arvore = new TreeSet<>();
	arvore.add("itu");
	arvore.add("sao paulo");
	arvore.add("sorocaba");
	arvore.add("sorocaba");
	arvore.add("jundiai");
	arvore.add("salto");
	System.out.println(arvore);
	// itu, jundiai, salto, sao paulo, sorocaba
	System.out.println(arvore.first()); // itu
	System.out.println(arvore.last()); // sorocaba
	System.out.println(arvore.lower("jundiai")); // itu
	System.out.println(arvore.higher("jundiai")); // salto
	System.out.println(arvore.pollFirst());
	System.out.println(arvore.pollLast());
	System.out.println(arvore);

	Iterator<String> iteraArvore = arvore.iterator();
	while (iteraArvore.hasNext()) {
	    System.out.println(">>>" + iteraArvore.next());

	}
    }

}
