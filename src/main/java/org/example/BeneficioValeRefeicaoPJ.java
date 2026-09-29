package org.example;

public class BeneficioValeRefeicaoPJ implements IBeneficio {

    @Override
    public String calcular() {
        return "Cálculo do Vale Refeição PJ realizado";
    }

    @Override
    public String cancelar() {
        return "Vale Refeição PJ cancelado";
    }
}