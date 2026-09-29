package org.example;

public class BeneficioCLTFactory implements BeneficioFactory {

    @Override
    public IBeneficio criarValeRefeicao() {
        return new BeneficioValeRefeicaoCLT();
    }

    @Override
    public IBeneficio criarPlanoSaude() {
        return new BeneficioPlanoSaudeCLT();
    }

    @Override
    public IBeneficio criarValeTransporte() {
        return new BeneficioValeTransporteCLT();
    }

    @Override
    public IBeneficio criarPrevidenciaPrivada() {
        return new BeneficioPrevidenciaPrivadaCLT();
    }
}
