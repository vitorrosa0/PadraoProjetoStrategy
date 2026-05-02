package org.example;

public class OperacaoDepositar implements Operacao {

    public float calcular(float saldo, float valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor menor ou igual a zero");
        }

        return saldo + valor;
    }
}
