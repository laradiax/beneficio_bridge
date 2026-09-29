package org.example;

public interface BeneficioFactory {

    IBeneficio criarValeRefeicao();

    IBeneficio criarPlanoSaude();

    IBeneficio criarValeTransporte();

    IBeneficio criarPrevidenciaPrivada();
}
