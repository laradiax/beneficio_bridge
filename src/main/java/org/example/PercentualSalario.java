package org.example;

public class PercentualSalario implements CalculoBeneficio {

    private float percentual;

    public PercentualSalario(float percentual) {
        this.percentual = percentual;
    }

    public float calcular(float salarioBase) {
        return salarioBase * this.percentual;
    }
}