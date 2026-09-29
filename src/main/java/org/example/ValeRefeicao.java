package org.example;

public class ValeRefeicao extends Beneficio {

    public ValeRefeicao(float salarioBase) {
        super(salarioBase);
    }

    public float calcularValor() {
        return this.calculoBeneficio.calcular(this.salarioBase);
    }
}