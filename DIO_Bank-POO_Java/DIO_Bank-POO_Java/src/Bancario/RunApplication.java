package Bancario;

import Bancario.Entidades.Cliente;
import Bancario.Entidades.Conta;
import Bancario.Entidades.ContaCorrente;
import Bancario.Entidades.ContaPoupanca;

public class RunApplication {
    public static void main(String[] args) {
        Cliente andre = new Cliente();
        andre.setNome("André");
        andre.setRg(896502357);

        Conta cc = new ContaCorrente(andre);
        Conta cp = new ContaPoupanca(andre);

        cc.transferir(100, cp);
        cp.depositar(120);
        cp.transferir(50, cc);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}
