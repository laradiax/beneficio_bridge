package org.example;

public class BeneficioValeTransportePJ implements IBeneficio {

    @Override
    public String calcular() {
        return "Cálculo do Vale Transporte PJ realizado";
    }

    @Override
    public String cancelar() {
        return "Vale Transporte PJ cancelado";
    }
}