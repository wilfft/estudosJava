package com.crashcourse.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class hashMap {

    public static void main(String[] args) {
	Map<String, Integer> exMap = new HashMap<>();
	Map<String, List<Integer>> listaCsv = new HashMap<>();
	// pra trzer um campo de tabel,a e seu valores como lista

	List<Integer> numeros = new ArrayList<>();
	numeros.add(1);
	numeros.add(5);
	numeros.add(3);
	listaCsv.put("teste", numeros);

	exMap.put("willia", 29);
	exMap.put("theo", 4);
	exMap.put("pedro", 12);
	exMap.put("pamela", 25);
	exMap.put("joao", 10);
	System.out.println(exMap.get("theo"));
	System.out.println(exMap.containsKey("theo"));
	System.out.println(exMap.containsValue(29));
	exMap.remove("pedro");
	System.out.println(exMap.size());

	for (Map.Entry<String, Integer> entradas : exMap.entrySet()) {
	    System.out.println(entradas.getKey() + " : " + entradas.getValue());
	}

	for (String key : exMap.keySet()) {

	    System.out.println("KEY " + key + " : " + exMap.get(key));
	}
    }

}
