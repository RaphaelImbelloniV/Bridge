package test;

import main.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PadraoTest {

    @Test
    void deveRetornarPrecoPadraoComSD() {
        QualidadeVideo qualidade = new SD();
        Padrao padrao = new Padrao(30.0f);
        padrao.setQualidade(qualidade);
        assertEquals(30.0f, padrao.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoPadraoComHD() {
        QualidadeVideo qualidade = new HD();
        Padrao padrao = new Padrao(30.0f);
        padrao.setQualidade(qualidade);
        assertEquals(36.0f, padrao.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoPadraoCom4K() {
        QualidadeVideo qualidade = new QuatroK();
        Padrao padrao = new Padrao(30.0f);
        padrao.setQualidade(qualidade);
        assertEquals(45.0f, padrao.calcularPreco(), 0.01f);
    }
}
