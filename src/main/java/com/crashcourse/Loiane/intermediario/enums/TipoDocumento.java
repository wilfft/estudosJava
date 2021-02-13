package com.crashcourse.Loiane.intermediario.enums;

public enum TipoDocumento {
    CPF {
	@Override
	public String geraNumero() {
	    // TODO Auto-generated method stub
	    Double cpf = Math.random() * 100000;
	    String numero = cpf.toString();
	    return numero;
	}
    },
    CNPJ {
	@Override
	public String geraNumero() {
	    // TODO Auto-generated method stub
	    Double cnpj = Math.random() * 100000;
	    String numero = cnpj.toString();
	    return numero;
	}
    };

    public abstract String geraNumero();

}
