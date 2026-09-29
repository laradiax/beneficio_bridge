package org.example;

public class BeneficioPrevidenciaPrivadaCLT implements IBeneficio {

    @Override
    public String calcular() {
        return "Cálculo da Previdência Privada CLT realizado";
    }

    @Override
    public String cancelar() {
        return "Previdência Privada CLT cancelada";
    }
}