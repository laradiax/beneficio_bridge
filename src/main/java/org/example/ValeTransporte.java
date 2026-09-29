package org.example;

public class ValeTransporte extends Beneficio {

    public ValeTransporte(float salarioBase) {
        super(salarioBase);
    }

    public float calcularValor() {
        return this.calculoBeneficio.calcular(this.salarioBase);
    }
}