package Bancario.Entidades;

import Bancario.Interface.InterfaceConta;

    /*Abstrata Pois nao pode ser instanciado*/
public abstract class Conta implements InterfaceConta {

    protected static int SEQUENCIAL = 1111111;          /* PARA QUE A CONTA GERE AUTOMATICAMENTE EM SEQUENCIA*/
    protected static final int AGENCIA_PADRAO = 8969;   /*AGENCIA PADRAO, NAO MUDA*/

    protected int agencia; //-> PROTECTED Acessar nas subclasses
    protected int conta;
    protected double saldo; /*Nao é necessario utilizar no construtor*/
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.conta = Conta.SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor; //Saldo - Saldo = Valor
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);

    }

    //        Criar construtores nas subclasses

    //    Get para vizualiar ou pegar as informações
    //    Set para enviar ou alterar as informações

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    protected void imprimirInfosPadrao() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.conta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

}
