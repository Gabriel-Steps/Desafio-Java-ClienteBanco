package desafio;

import java.time.LocalDate;
public class Produto {
    private String nome;
    private double valor;
    private LocalDate data;

    public Produto(String nome,double valor,LocalDate data){
        this.nome = nome;
        this.valor = valor;
        this.data = data;
    }
    public String getNome(){
        return nome;
    }
    public double getValor(){
        return valor;
    }
    public LocalDate getData(){
        return data;
    }
}
