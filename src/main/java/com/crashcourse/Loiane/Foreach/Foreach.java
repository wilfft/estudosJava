package com.crashcourse.Loiane.Foreach;

import java.util.Random;

public class Foreach {
    public static void main(String[] args) {

	Random random = new Random();

	int[] notas = new int[10];

	for (int i = 0; i < notas.length; i++) {
	    notas[i] = random.nextInt(10);
	}
	for (

	int nota : notas) {
	    System.out.println(nota);
	}
    }

}