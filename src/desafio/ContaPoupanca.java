package desafio;

import java.util.*;
public class ContaPoupanca extends Conta{
    
    protected Set<Produto> historico = new LinkedHashSet<>();
    
    public void inserirHistorico(Produto produto){
        this.historico.add(produto);
    }
    public Set<Produto> getHistorico(){
        return historico;
    }
    public void setHistorico(Set<Produto> historico){
        this.historico = historico;
    }
    @Override
    public boolean equals(Object a){
        if(this == a) return true;
        if(a == null || getClass() != a.getClass()) return false;
        ContaPoupanca conta_poupanca = (ContaPoupanca) a;
        return Objects.equals(historico,conta_poupanca.historico);
    }
    public int hashCode(){
        return Objects.hash(historico);
    }
    @Override
    public double rendimento() {
        return 0;
    }
    public String toString(){
        return "\nNome: " + getNome() + "\nCpf: " + getCpf() + "\nHistorico: " + this.historico + "\nSaldo: " + getSaldo();
    }
}
