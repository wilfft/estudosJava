package com.crashcourse.Loiane.intermediario.enums;

public enum DiaDaSemana {
    SEGUNDA(1), TERCA(2);

    private int dia;

    private DiaDaSemana(int dia) {
	this.dia = dia;
    }

    public int getDia() {
	return dia;
    }
}
