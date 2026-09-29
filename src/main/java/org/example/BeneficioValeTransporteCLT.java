package org.example;

public class BeneficioValeTransporteCLT implements IBeneficio {

    @Override
    public String calcular() {
        return "Cálculo do Vale Transporte CLT realizado";
    }

    @Override
    public String cancelar() {
        return "Vale Transporte CLT cancelado";
    }
}