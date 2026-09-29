package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParametrosTest {

    @Test
    public void deveRetornarEmpresa() {
        Parametros.getInstance().setEmpresa("Empresa 1");

        assertEquals(
                "Empresa 1",
                Parametros.getInstance().getEmpresa()
        );
    }

    @Test
    public void deveRetornarUsuarioLogado() {
        Parametros.getInstance().setUsuarioLogado("Usuario 1");

        assertEquals(
                "Usuario 1",
                Parametros.getInstance().getUsuarioLogado()
        );
    }
}