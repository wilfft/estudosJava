package com.crashcourse.maps;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class hashTree {

    public static void main(String[] args) {
	TreeMap<String, String> arvoreHash = new TreeMap<>();
	arvoreHash.put("Wil", "Pai");
	arvoreHash.put("pamela", "mae");
	arvoreHash.put("theo", "filho");

	System.out.println(arvoreHash.firstKey());
	System.out.println(arvoreHash.lastKey());

	// PEGANDO O KEY de quem esta ABAIXO DE PAMELA
	System.out.println(arvoreHash.lowerKey("pamela"));

	// PEGANDO O KEY de quem esta ACIMA DE WIL
	System.out.println(arvoreHash.higherKey("Wil"));

	// pegando PRIMEIRO ITEM DA ARVORE
	System.out.println(arvoreHash.firstEntry().getKey() + " : " + arvoreHash.firstEntry().getValue());

	// pegando ITEM ABAIXO DO PARAMETRO
	System.out
		.println(arvoreHash.lowerEntry("pamela").getValue() + " : " + arvoreHash.lowerEntry("pamela").getKey());

	// pegando ITEM ACIMA DO PARAMETRO
	System.out.println(
		arvoreHash.higherEntry("pamela").getValue() + " : " + arvoreHash.higherEntry("pamela").getKey());

	Iterator<String> iteraArvoreHash = arvoreHash.keySet().iterator();

	while (iteraArvoreHash.hasNext()) {
	    System.out.println(">>" + iteraArvoreHash.next());

	}

	for (String item : arvoreHash.keySet()) {
	    System.out.println("===>" + item + " : " + arvoreHash.get(item));
	}

	for (Entry<String, String> valor : arvoreHash.entrySet()) {

	    System.out.println(valor.getValue() + ":::>" + valor.getKey());
	}
    }

}
