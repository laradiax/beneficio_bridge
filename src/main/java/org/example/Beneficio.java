package org.example;

public abstract class Beneficio {

    protected CalculoBeneficio calculoBeneficio;

    protected float salarioBase;

    public Beneficio(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setCalculoBeneficio(CalculoBeneficio calculoBeneficio) {
        this.calculoBeneficio = calculoBeneficio;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract float calcularValor();
}