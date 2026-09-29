package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValeRefeicaoTest {

    @Test
    void deveRetornarValeRefeicaoComValorFixo() {
        CalculoBeneficio calculo = new ValorFixo(500.0f);
        ValeRefeicao valeRefeicao = new ValeRefeicao(3000.0f);

        valeRefeicao.setCalculoBeneficio(calculo);

        assertEquals(500.0f, valeRefeicao.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValeRefeicaoComPercentual() {
        CalculoBeneficio calculo = new PercentualSalario(0.10f);
        ValeRefeicao valeRefeicao = new ValeRefeicao(3000.0f);

        valeRefeicao.setCalculoBeneficio(calculo);

        assertEquals(300.0f, valeRefeicao.calcularValor(), 0.01f);
    }
}