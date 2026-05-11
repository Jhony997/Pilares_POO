package Nivel0.JavaCore.POO4.metodo;
// preciso colocar estrutura de condição chega de usar só objeto!
// coloquei só o básico aqui nada funciona só para ter algo para testar com condição

public class Objeto {
    private String nome;
    private int preco;
    private int quantidade;

    public Objeto(String nome, int preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void funcao(String input){
        System.out.println("Item usado : " + this.nome );
    }
}
