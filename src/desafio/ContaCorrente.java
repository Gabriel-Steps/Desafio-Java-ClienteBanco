package desafio;

import java.util.*;
import java.time.LocalDate;
public class ContaCorrente extends Conta{
    
    @Override
    public double rendimento() {
        return 0;
    }
    public boolean verificarSaldo(double valor){
        if(getSaldo() < valor){
            return false;
        }else{
            return true;
        }
    }
    public void transferirParaPoupanca(double valor,ContaPoupanca poupanca){
        if(verificarSaldo(valor)){
            double novoValor = poupanca.getSaldo() + valor;
            double novoValorConta = getSaldo() - valor;
            setSaldo(novoValorConta);
            poupanca.setSaldo(novoValor);
            System.out.println("O dinheiro foi transferido com sucesso para a poupança!");
        }else{
            System.out.println("Você não tem saldo o suficiente para transferir na poupança!");
        }
    }
    public boolean comprarProduto(Produto produto){
        if(verificarSaldo(produto.getValor())){
            double novoValor = getSaldo() - produto.getValor();
            setSaldo(novoValor);
            System.out.println("Compra realizada com sucesso");
            return true;
        }else{
            System.out.println("Você não tem saldo o suficiente para compra o produto");
            return false;
        }
    }
    
}
