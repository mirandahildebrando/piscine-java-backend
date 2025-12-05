package com.brando_miranda.java_backend_piscine;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JavaBackendPiscineApplicationTests {

    
    @Test
    void deveSomarCorretamente() throws OperacaoInvalidaException {
        double resultado = Calculadora.calcular(10.0, 5.0, "+");
        assertEquals(15, resultado);
    }

   
    @Test
    void deveSubtrairCorretamente() throws OperacaoInvalidaException {
        double resultado = Calculadora.calcular(10.0, 5.0, "-");
        assertEquals(5.0, resultado);
    }

    
    @Test
    void deveMultiplicarCorretamente() throws OperacaoInvalidaException {
        double resultado = Calculadora.calcular(10.0, 5.0, "*");
        assertEquals(50.0, resultado);
    }

    
    @Test
    void deveDividirCorretamente() throws OperacaoInvalidaException {
        double resultado = Calculadora.calcular(10.0, 2.0, "/");
        assertEquals(5.0, resultado);
    }

    
    @Test
    void deveLancarArithmeticExceptionAoDividirPorZero() {
        assertThrows(ArithmeticException.class, () -> {
            Calculadora.calcular(10.0, 0.0, "/");
        });
    }

  
    @Test
    void deveLancarExcecaoPersonalizadaParaOperacaoInvalida() {
        assertThrows(OperacaoInvalidaException.class, () -> {
            Calculadora.calcular(10.0, 5.0, "x"); 
        });
    }
}


