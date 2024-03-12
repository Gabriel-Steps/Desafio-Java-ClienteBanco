package desafio;

import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        Produto produtoNovo = new Produto("Shamppo", 20, LocalDate.now());
        ContaCorrente conta1 = new ContaCorrente();
        conta1.setNome("Gabriel");
        conta1.setSaldo(200);
        conta1.setCpf("123456789");

        ContaPoupanca conta1Poupanca = new ContaPoupanca();
        conta1Poupanca.setNome("Gabriel P");
        conta1Poupanca.setAgencia("Banco Novo");
        conta1Poupanca.setCpf("123456789");
        
        if(conta1.comprarProduto(produtoNovo)){
            conta1.comprarProduto(produtoNovo);
            conta1Poupanca.inserirHistorico(produtoNovo);
        }
        conta1.transferirParaPoupanca(30, conta1Poupanca);
        System.out.println(conta1Poupanca);
    }
}
