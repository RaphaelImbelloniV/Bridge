package test;

import main.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BasicoTest {

    @Test
    void deveRetornarPrecoBasicoComSD() {
        QualidadeVideo qualidade = new SD();
        Basico basico = new Basico(20.0f);
        basico.setQualidade(qualidade);
        assertEquals(20.0f, basico.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoBasicoComHD() {
        QualidadeVideo qualidade = new HD();
        Basico basico = new Basico(20.0f);
        basico.setQualidade(qualidade);
        assertEquals(24.0f, basico.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoBasicoCom4K() {
        QualidadeVideo qualidade = new QuatroK();
        Basico basico = new Basico(20.0f);
        basico.setQualidade(qualidade);
        assertEquals(30.0f, basico.calcularPreco(), 0.01f);
    }
}
