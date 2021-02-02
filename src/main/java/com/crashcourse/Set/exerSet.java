package com.crashcourse.Set;

import java.util.TreeSet;

public class exerSet {
    public static void main(String[] args) {
	TreeSet<Integer> numeros = new TreeSet<>();
	numeros.add(3);
	numeros.add(88);
	numeros.add(20);
	numeros.add(44);
	numeros.add(3);
	for (Integer item : numeros) {
	    System.out.println(item);
	}
	numeros.size();
	numeros.add(23);
	System.out.println(numeros.size());
	numeros.pollFirst();

	System.out.println(numeros.isEmpty());
    }
}
