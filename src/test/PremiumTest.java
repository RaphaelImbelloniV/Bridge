package test;

import main.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PremiumTest {

    @Test
    void deveRetornarPrecoPremiumComSD() {
        QualidadeVideo qualidade = new SD();
        Premium premium = new Premium(50.0f);
        premium.setQualidade(qualidade);
        assertEquals(50.0f, premium.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoPremiumComHD() {
        QualidadeVideo qualidade = new HD();
        Premium premium = new Premium(50.0f);
        premium.setQualidade(qualidade);
        assertEquals(60.0f, premium.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoPremiumCom4K() {
        QualidadeVideo qualidade = new QuatroK();
        Premium premium = new Premium(50.0f);
        premium.setQualidade(qualidade);
        assertEquals(75.0f, premium.calcularPreco(), 0.01f);
    }
}
