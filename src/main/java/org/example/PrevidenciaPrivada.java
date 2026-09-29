package org.example;

public class PrevidenciaPrivada extends Beneficio {

    public PrevidenciaPrivada(float salarioBase) {
        super(salarioBase);
    }

    public float calcularValor() {
        return this.calculoBeneficio.calcular(this.salarioBase);
    }
}