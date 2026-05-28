package Nivel0.JavaCore.POO6Fundamento.dominio;

public class Pessoa {
    private String nome;
    private int idade;
    private double dinheiro;
    private double salarioTrabalho;

    public Pessoa(String nome, int idade, double dinheiro, double salarioTrabalho) {
        this.nome = nome;
        this.idade = idade;
        this.dinheiro = dinheiro;
        this.salarioTrabalho = salarioTrabalho;
    }

    public void carteira(){
        System.out.println("[Carteira] Nome : " + this.nome + " | " + "Idade : " + this.idade + " | " + "Dinheiro : " + this.dinheiro);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dinheiro=" + dinheiro +
                '}';
    }

    public double dinheiroSoma(){
        System.out.println(this.nome + " Somou seu moneu em +1.1 ");
        return dinheiro += 1.1;
    }

    public void trabalhar(){
        System.out.println("Trabalho concluido " + nome + " !");

        dinheiro += salarioTrabalho;
    }

}
