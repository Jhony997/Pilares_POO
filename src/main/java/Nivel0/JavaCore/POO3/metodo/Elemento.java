package Nivel0.JavaCore.POO3.metodo;

public class Elemento implements Acao {
    private String nome;
    private int elemento;
    private int reacao;
    private int durabilidade;

    public Elemento(String nome, int elemento, int reacao, int durabilidade) {
        this.nome = nome;
        this.elemento = elemento;
        this.reacao = reacao;
        this.durabilidade = durabilidade;
    }

    @Override
    public void material() {
        System.out.println("Material + Elemento : " + nome + " | " + elemento);
    }

    @Override
    public void uso() {
        System.out.println("Quantidade de reação : " + reacao);
    }

    @Override
    public void durabilidade() {
        System.out.println("Durabilidade atual : " + durabilidade);
    }

    public void setReacao(int reacao) {
        this.reacao = reacao;
    }

    public String getNome() {
        return nome;
    }

    public int getElemento() {
        return elemento;
    }

    public int getReacao() {
        return reacao;
    }

    public int getDurabilidade() {
        return durabilidade;
    }
}
