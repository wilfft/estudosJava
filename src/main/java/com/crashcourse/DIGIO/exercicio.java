package com.crashcourse.DIGIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class exercicio {

    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());

	String maiorPalavra = "";
	String frase = new String();
	int qtdeAbreviados = 0;
	Boolean continua = true;

	// CONCATENA UMA FRASE EM UM SÓ STRING
	while (st.hasMoreTokens()) {
	    frase = frase.concat(st.nextToken() + " ");
	}

	// TRANSFORMA A STRING EM UM ARRAY DE PALAVRAS
	String[] palavras = frase.split(" ");
	for (int i = 0; i < palavras.length; i++) {
	    if (palavras[i].contains(".")) {
		continua = false;
	    }
	}
	if (continua) {
	    for (int i = 0; i < palavras.length; i++) {
		if (maiorPalavra.length() < palavras[i].length()) {
		    maiorPalavra = palavras[i].toLowerCase();
		}
	    }
	    String abrev = maiorPalavra.charAt(0) + ".";

	    for (int i = 0; i < palavras.length; i++) {
		if (palavras[i].equals(maiorPalavra)) {
		    System.out.print(abrev + " ");
		    qtdeAbreviados++;
		} else {
		    System.out.print(palavras[i] + " ");
		}
	    }

	    System.out.println("\n" + qtdeAbreviados + "\n" + abrev + "=" + maiorPalavra);

	}

    }
}
