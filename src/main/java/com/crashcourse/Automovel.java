package com.crashcourse;

public interface Automovel {
    String registro();

    default String ligar( ) {
	return "ligou " + registro();
    }

}
