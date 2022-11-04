package Bancario.Interface;

import Bancario.Entidades.Conta;

public interface InterfaceConta { //metodos abstratos; sem corpo "{}"
    // Toda as classes que contem a interface, deve implementar todos os metodos

    /*Metodos devem ser publicos para faciliar na alteração de dados*/
    void sacar(double valor);                               // Metodo = Ação
    void depositar(double valor);                           // Metodo = Ação
    void transferir(double valor, Conta contaDestino);      // Metodo = Ação
    void imprimirExtrato();

}
