package org.example;

public class ValorFixo implements CalculoBeneficio {

    private float valor;

    public ValorFixo(float valor) {
        this.valor = valor;
    }

    public float calcular(float salarioBase) {
        return this.valor;
    }
}