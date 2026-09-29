package org.example;

public class BeneficioValeRefeicaoCLT implements IBeneficio {

    @Override
    public String calcular() {
        return "Cálculo do Vale Refeição CLT realizado";
    }

    @Override
    public String cancelar() {
        return "Vale Refeição CLT cancelado";
    }
}