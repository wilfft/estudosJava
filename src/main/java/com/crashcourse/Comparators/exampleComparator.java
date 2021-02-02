package com.crashcourse.Comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class exampleComparator {

    public static void main(String[] args) {
	List<Estudante> estudantes = new ArrayList<>();
	estudantes.add(new Estudante("joaoo", 15));
	estudantes.add(new Estudante("william", 30));
	estudantes.add(new Estudante("pedro", 1));
	System.out.println(estudantes);

	estudantes.sort((a, b) -> a.getIdade() - b.getIdade());
	System.out.println(estudantes);

	estudantes.sort((a, b) -> b.getIdade() - a.getIdade());
	System.out.println(estudantes);

	estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
	System.out.println(estudantes);

	estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
	System.out.println(estudantes);

	Collections.sort(estudantes, new EstudanteComparatorMenor());

    }

}
