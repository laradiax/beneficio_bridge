package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanoSaudeTest {

    @Test
    void deveRetornarPlanoSaudeComValorFixo() {
        CalculoBeneficio calculo = new ValorFixo(300.0f);
        PlanoSaude planoSaude = new PlanoSaude(3000.0f);

        planoSaude.setCalculoBeneficio(calculo);

        assertEquals(300.0f, planoSaude.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarPlanoSaudeComPercentual() {
        CalculoBeneficio calculo = new PercentualSalario(0.08f);
        PlanoSaude planoSaude = new PlanoSaude(3000.0f);

        planoSaude.setCalculoBeneficio(calculo);

        assertEquals(240.0f, planoSaude.calcularValor(), 0.01f);
    }
}