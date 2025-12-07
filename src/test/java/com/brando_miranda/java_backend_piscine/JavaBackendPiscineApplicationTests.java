package com.brando_miranda.java_backend_piscine;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class JavaBackendPiscineApplicationTests {

    
    @Test
    void deveSomarCorretamente() throws OperacaoInvalidaException {
        double resultado = Calculator.calcular(10, 5, "+");
        assertEquals(15, resultado);
    }

   
    @Test
    void deveSubtrairCorretamente() throws OperacaoInvalidaException {
        double resultado = Calculator.calcular(10, 5, "-");
        assertEquals(5, resultado);
    }

    
    @Test
    void deveMultiplicarCorretamente() throws OperacaoInvalidaException {
        double resultado = Calculator.calcular(10, 5, "*");
        assertEquals(50, resultado);
    }

    
    @Test
    void deveDividirCorretamente() throws OperacaoInvalidaException {
        double resultado = Calculator.calcular(10, 2, "/");
        assertEquals(5, resultado);
    }

    
    @Test
    void deveLancarArithmeticExceptionAoDividirPorZero() {
        assertThrows(OperacaoInvalidaException.class, () -> {
            Calculator.calcular(10, 0, "/");
        });
    }

  
    @Test
    void deveLancarExcecaoPersonalizadaParaOperacaoInvalida() {
        assertThrows(OperacaoInvalidaException.class, () -> {
            Calculator.calcular(10, 5, "x"); 
        });
    }
}


