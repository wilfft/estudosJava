package com.crashcourse;

import java.util.Date;

//@SpringBootApplication
public class EstudosJavaApplication {

    public static void main(String[] args) {
	Date data = new Date();
	Long currentTimemillis = System.currentTimeMillis();
	System.out.println(data);
	System.out.println(currentTimemillis);
	Date dataManual = new Date(2012048037713L);

	System.out.println(dataManual);

	/*
	 * ArrayList teste = new ArrayList();
	 * 
	 * IntStream.range(0, 10).forEach(n -> { System.out.println(n);
	 * 
	 * });
	 * 
	 * IntStream.of(1, 2, 3, 4, 5).forEach(n -> {
	 * 
	 * System.out.println(n);
	 * 
	 * });
	 */
    }

}
// SpringApplication.run(EstudosJavaApplication.class, args);

// Automovel trator1 = new Trator();
//	trator1.registro("1i1i190");

// System.out.print(trator1.ligar());
