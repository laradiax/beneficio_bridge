package org.example;

public class BeneficioPJFactory implements BeneficioFactory {

    @Override
    public IBeneficio criarValeRefeicao() {
        return new BeneficioValeRefeicaoPJ();
    }

    @Override
    public IBeneficio criarPlanoSaude() {
        return new BeneficioPlanoSaudePJ();
    }

    @Override
    public IBeneficio criarValeTransporte() {
        return new BeneficioValeTransportePJ();
    }

    @Override
    public IBeneficio criarPrevidenciaPrivada() {
        return new BeneficioPrevidenciaPrivadaPJ();
    }
}
