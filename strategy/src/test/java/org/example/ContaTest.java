package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {

    @Test
    void deveDepositarNaConta() {
        Conta conta = new Conta();
        conta.depositar(100.0f, 20.0f);
        assertEquals(120.0f, conta.getSaldo());
    }

    @Test
    void deveSacarDaConta() {
        Conta conta = new Conta();
        conta.sacar(100.0f, 20.0f);
        assertEquals(80.0f, conta.getSaldo());
    }

    @Test
    void naoDeveDepositarNaContaValorMenorOuIgualAZero() {
        try {
            Conta conta = new Conta();
            conta.depositar(100.0f, 0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor menor ou igual a zero", e.getMessage());
        }
    }

    @Test
    void naoDeveSacarNaContaValorMenorOuIgualAZero() {
        try {
            Conta conta = new Conta();
            conta.sacar(100.0f, 0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor menor ou igual a zero", e.getMessage());
        }
    }

}