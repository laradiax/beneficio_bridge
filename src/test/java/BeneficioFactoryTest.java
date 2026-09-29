import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BeneficioFactoryTest {

    @Test
    void deveCriarFamiliaCLT() {
        BeneficioFactory factory = new BeneficioCLTFactory();

        IBeneficio valeRefeicao = factory.criarValeRefeicao();
        IBeneficio planoSaude = factory.criarPlanoSaude();
        IBeneficio valeTransporte = factory.criarValeTransporte();
        IBeneficio previdenciaPrivada = factory.criarPrevidenciaPrivada();

        assertEquals(
                BeneficioValeRefeicaoCLT.class,
                valeRefeicao.getClass()
        );

        assertEquals(
                BeneficioPlanoSaudeCLT.class,
                planoSaude.getClass()
        );

        assertEquals(
                BeneficioValeTransporteCLT.class,
                valeTransporte.getClass()
        );

        assertEquals(
                BeneficioPrevidenciaPrivadaCLT.class,
                previdenciaPrivada.getClass()
        );
    }

    @Test
    void deveCriarFamiliaPJ() {
        BeneficioFactory factory = new BeneficioPJFactory();

        IBeneficio valeRefeicao = factory.criarValeRefeicao();
        IBeneficio planoSaude = factory.criarPlanoSaude();
        IBeneficio valeTransporte = factory.criarValeTransporte();
        IBeneficio previdenciaPrivada = factory.criarPrevidenciaPrivada();

        assertEquals(
                BeneficioValeRefeicaoPJ.class,
                valeRefeicao.getClass()
        );

        assertEquals(
                BeneficioPlanoSaudePJ.class,
                planoSaude.getClass()
        );

        assertEquals(
                BeneficioValeTransportePJ.class,
                valeTransporte.getClass()
        );

        assertEquals(
                BeneficioPrevidenciaPrivadaPJ.class,
                previdenciaPrivada.getClass()
        );
    }
}