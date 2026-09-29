package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValeTransporteTest {

    @Test
    void deveRetornarValeTransporteComValorFixo() {
        CalculoBeneficio calculo = new ValorFixo(400.0f);
        ValeTransporte valeTransporte = new ValeTransporte(3000.0f);

        valeTransporte.setCalculoBeneficio(calculo);

        assertEquals(400.0f, valeTransporte.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValeTransporteComPercentual() {
        CalculoBeneficio calculo = new PercentualSalario(0.06f);
        ValeTransporte valeTransporte = new ValeTransporte(3000.0f);

        valeTransporte.setCalculoBeneficio(calculo);

        assertEquals(180.0f, valeTransporte.calcularValor(), 0.01f);
    }
}