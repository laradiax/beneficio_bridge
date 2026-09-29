package org.example;

public class PlanoSaude extends Beneficio {

    public PlanoSaude(float salarioBase) {
        super(salarioBase);
    }

    public float calcularValor() {
        return this.calculoBeneficio.calcular(this.salarioBase);
    }
}