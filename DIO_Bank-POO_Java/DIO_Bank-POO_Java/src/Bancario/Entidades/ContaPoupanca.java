package Bancario.Entidades;

public class ContaPoupanca extends Conta {
    // em vez de criar agencia e conta nas 2 contas, criar heranca com conta, ou banco

    //Criar Obrigatoriedade, de quando criar classe, vincular ela a cliente
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosPadrao();
    }

}
