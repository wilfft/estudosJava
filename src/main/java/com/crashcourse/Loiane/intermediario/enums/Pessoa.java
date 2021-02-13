package com.crashcourse.Loiane.intermediario.enums;

public class Pessoa {
    private TipoDocumento documento;
    private String NumeroDocumento;

    public String getNumeroDocumento() {
	return NumeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
	NumeroDocumento = numeroDocumento;
    }

    public TipoDocumento getDocumento() {
	return documento;
    }

    public void setDocumento(TipoDocumento documento) {
	this.documento = documento;
    }

}
