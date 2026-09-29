package org.example;

public class BeneficioPrevidenciaPrivadaPJ implements IBeneficio {

    @Override
    public String calcular() {
        return "Cálculo da Previdência Privada PJ realizado";
    }

    @Override
    public String cancelar() {
        return "Previdência Privada PJ cancelada";
    }
}