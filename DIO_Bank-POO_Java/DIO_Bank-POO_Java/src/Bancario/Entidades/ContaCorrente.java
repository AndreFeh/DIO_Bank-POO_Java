package Bancario.Entidades;

public class ContaCorrente extends Conta{
     // em vez de criar agencia e conta nas 2 contas, criar heranca com conta, ou banco

    //Criar Obrigatoriedade, de quando criar classe, vincular ela a cliente
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
     public void imprimirExtrato() {
         System.out.println("=== Extrato Conta Corrente ===");
         super.imprimirInfosPadrao();
     }
}
