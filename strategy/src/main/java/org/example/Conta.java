package org.example;

public class Conta {

    private float saldo;

    public float getSaldo() {
        return saldo;
    }

    public void depositar(float saldo, float valor) {
        CalculadoraSaldo calculadoraSaldo = new CalculadoraSaldo(saldo, valor);
        this.saldo = calculadoraSaldo.calcular(new OperacaoDepositar());
    }

    public void sacar(float saldo, float valor) {
        CalculadoraSaldo calculadoraSaldo = new CalculadoraSaldo(saldo, valor);
        this.saldo = calculadoraSaldo.calcular(new OperacaoSacar());
    }
}
