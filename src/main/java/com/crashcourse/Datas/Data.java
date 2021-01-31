package com.crashcourse.Datas;

import java.time.Instant;
import java.util.Date;

public class Data {
    public static void main(String[] args) {

	Date data = new Date();
	Long currentTimemillis = System.currentTimeMillis();
	Date dataManual = new Date(2012048037713L);

	System.out.println("data: " + data);
	System.out.println("dataManual: " + dataManual);

	System.out.println(currentTimemillis);
	System.out.println(data.after(dataManual));
	System.out.println(data.before(dataManual));

	System.out.println("compareTo: " + data.compareTo(dataManual));

	System.out.println("equals: " + data.equals(dataManual));

	System.out.println("getTime: " + data.getTime());

	System.out.println("toInstant: " + data.toInstant());

	// System.out.println(data.from(1612047558503));
	data.setTime(2012048037713L);
	System.out.println("data: " + data);

	boolean isAfter = data.after(dataManual);
	System.out.println("isAfter: " + isAfter);
	Instant instant = data.toInstant();
	System.out.println(instant);
	Date nascimento = new Date(670474800000L);
	boolean depoisDe15Maio = nascimento.after(new Date(1273892400000L));
	boolean antesDe15Maio = nascimento.before(new Date(1273892400000L));
	if (depoisDe15Maio) {
	    System.out.println("foi depois de 15 de maio 2010 ");
	}
	if (antesDe15Maio) {
	    System.out.println("foi antes de 15 de maio 2010 ");
	}
    }
}
