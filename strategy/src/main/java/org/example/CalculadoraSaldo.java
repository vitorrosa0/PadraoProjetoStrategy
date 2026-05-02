package org.example;

public class CalculadoraSaldo {

    private float saldo;
    private float valor;

    public CalculadoraSaldo(float saldo, float valor) {
        this.saldo = saldo;
        this.valor = valor;
    }

    public float calcular(Operacao operacao) {
        return operacao.calcular(saldo, valor);
    }
}
