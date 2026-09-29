package org.example;

public class BeneficioPlanoSaudePJ implements IBeneficio {

    @Override
    public String calcular() {
        return "Cálculo do Plano de Saúde PJ realizado";
    }

    @Override
    public String cancelar() {
        return "Plano de Saúde PJ cancelado";
    }
}