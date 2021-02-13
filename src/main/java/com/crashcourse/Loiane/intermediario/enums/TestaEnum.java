package com.crashcourse.Loiane.intermediario.enums;

public class TestaEnum {

    public static void main(String[] args) {

	DiaDaSemana segunda = DiaDaSemana.SEGUNDA;
	System.out.println(segunda.toString() + " " + segunda.getDia());

	DiaDaSemana[] dias = DiaDaSemana.values();
	System.out.println("VALUE: " + dias[1]);

	for (DiaDaSemana dia : dias) {
	    System.out.println(dia);

	}

	Pessoa p1 = new Pessoa();

	p1.setDocumento(Enum.valueOf(TipoDocumento.class, "CPF"));
	p1.setNumeroDocumento(p1.getDocumento().geraNumero());

	System.out.println(p1.getDocumento());

	System.out.println(p1.getNumeroDocumento());
	Pessoa p2 = new Pessoa();

	p2.setDocumento(Enum.valueOf(TipoDocumento.class, "CNPJ"));
	p2.setNumeroDocumento(p1.getDocumento().geraNumero());

	System.out.println(p2.getDocumento());

	System.out.println(p2.getNumeroDocumento());
    }

}
