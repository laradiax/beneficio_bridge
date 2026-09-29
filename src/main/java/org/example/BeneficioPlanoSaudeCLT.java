package org.example;

public class BeneficioPlanoSaudeCLT implements IBeneficio {

    @Override
    public String calcular() {
        return "Cálculo do Plano de Saúde CLT realizado";
    }

    @Override
    public String cancelar() {
        return "Plano de Saúde CLT cancelado";
    }
}