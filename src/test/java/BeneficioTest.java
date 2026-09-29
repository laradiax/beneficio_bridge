import org.example.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeneficioTest {

    @Test
    void deveCalcularValeRefeicaoCLT() {
        BeneficioFactory factory = new BeneficioCLTFactory();
        Beneficio beneficio = new Beneficio(factory);

        assertEquals(
                "Cálculo do Vale Refeição CLT realizado",
                beneficio.calcularValeRefeicao()
        );
    }

    @Test
    void deveCalcularValeRefeicaoPJ() {
        BeneficioFactory factory = new BeneficioPJFactory();
        Beneficio beneficio = new Beneficio(factory);

        assertEquals(
                "Cálculo do Vale Refeição PJ realizado",
                beneficio.calcularValeRefeicao()
        );
    }

    @Test
    void deveCalcularPlanoSaudeCLT() {
        BeneficioFactory factory = new BeneficioCLTFactory();
        Beneficio beneficio = new Beneficio(factory);

        assertEquals(
                "Cálculo do Plano de Saúde CLT realizado",
                beneficio.calcularPlanoSaude()
        );
    }

    @Test
    void deveCalcularPlanoSaudePJ() {
        BeneficioFactory factory = new BeneficioPJFactory();
        Beneficio beneficio = new Beneficio(factory);

        assertEquals(
                "Cálculo do Plano de Saúde PJ realizado",
                beneficio.calcularPlanoSaude()
        );
    }

    @Test
    void deveCalcularValeTransporteCLT() {
        BeneficioFactory factory = new BeneficioCLTFactory();
        Beneficio beneficio = new Beneficio(factory);

        assertEquals(
                "Cálculo do Vale Transporte CLT realizado",
                beneficio.calcularValeTransporte()
        );
    }

    @Test
    void deveCalcularValeTransportePJ() {
        BeneficioFactory factory = new BeneficioPJFactory();
        Beneficio beneficio = new Beneficio(factory);

        assertEquals(
                "Cálculo do Vale Transporte PJ realizado",
                beneficio.calcularValeTransporte()
        );
    }

    @Test
    void deveCalcularPrevidenciaPrivadaCLT() {
        BeneficioFactory factory = new BeneficioCLTFactory();
        Beneficio beneficio = new Beneficio(factory);

        assertEquals(
                "Cálculo da Previdência Privada CLT realizado",
                beneficio.calcularPrevidenciaPrivada()
        );
    }

    @Test
    void deveCalcularPrevidenciaPrivadaPJ() {
        BeneficioFactory factory = new BeneficioPJFactory();
        Beneficio beneficio = new Beneficio(factory);

        assertEquals(
                "Cálculo da Previdência Privada PJ realizado",
                beneficio.calcularPrevidenciaPrivada()
        );
    }
}