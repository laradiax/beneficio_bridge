package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrevidenciaPrivadaTest {

    @Test
    void deveRetornarPrevidenciaPrivadaComValorFixo() {
        CalculoBeneficio calculo = new ValorFixo(250.0f);
        PrevidenciaPrivada previdenciaPrivada =
                new PrevidenciaPrivada(3000.0f);

        previdenciaPrivada.setCalculoBeneficio(calculo);

        assertEquals(
                250.0f,
                previdenciaPrivada.calcularValor(),
                0.01f
        );
    }

    @Test
    void deveRetornarPrevidenciaPrivadaComPercentual() {
        CalculoBeneficio calculo = new PercentualSalario(0.05f);
        PrevidenciaPrivada previdenciaPrivada =
                new PrevidenciaPrivada(3000.0f);

        previdenciaPrivada.setCalculoBeneficio(calculo);

        assertEquals(
                150.0f,
                previdenciaPrivada.calcularValor(),
                0.01f
        );
    }
}