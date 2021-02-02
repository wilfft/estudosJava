package com.crashcourse.maps;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

public class hashTable {

    public static void main(String[] args) {
	Hashtable<String, Integer> hashTable = new Hashtable<>();
	hashTable.put("WIl", 29);
	hashTable.put("pedro", 10);
	hashTable.put("flavio", 23);
	hashTable.put("joao", 1);

	Iterator<String> iteraHash = hashTable.keySet().iterator();
	System.out.println(hashTable.get("WIl"));
	hashTable.size();

	for (Entry<String, Integer> entry : hashTable.entrySet()) {
	    System.out.println(entry.getKey() + ":" + entry.getValue());
	}

	for (String key : hashTable.keySet()) {
	    System.out.println(key + ":" + hashTable.get(key));
	}
	// while (iteraHash.hasNext()) {
	// System.out.println(hashTable.get(iteraHash()) + ":" + iteraHash.next() +
	// ":");
	// }
    }

}
