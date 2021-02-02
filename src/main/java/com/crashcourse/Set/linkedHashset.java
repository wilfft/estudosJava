package com.crashcourse.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedHashset {

    public static void main(String[] args) {
	LinkedHashSet<Double> listaLinked = new LinkedHashSet<>();
	listaLinked.add(9.32);
	listaLinked.add(2.33);
	listaLinked.add(1.32);
	listaLinked.remove(9.32);
	listaLinked.size();
	listaLinked.isEmpty();

	Iterator<Double> iteraLinked = listaLinked.iterator();
	while (iteraLinked.hasNext()) {
	    System.out.println(iteraLinked.next());
	}

    }

}
