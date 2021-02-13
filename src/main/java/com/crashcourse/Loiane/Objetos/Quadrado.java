package com.crashcourse.Loiane.Objetos;

public class Quadrado extends Figura3D {
    private int lado;

    /**
     * @return the lado
     */
    public int getLado() {
	return lado;
    }

    /**
     * @param lado the lado to set
     */
    public void setLado(int lado) {
	this.lado = lado;
    }

    @Override
    public double calcularArea() {
	return lado * lado;
	// return Math.pow(lado, 2);
    }

    @Override
    public double calcularVolume() {
	// TODO Auto-generated method stub
	return 0;
    }

}
