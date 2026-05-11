package Nivel0.JavaCore.POO5.metodo;

public class Animal {
    private String nome;
    private int forca;
    private int vida;
    protected String localAtual;

    public Animal(String nome, int forca, int vida, String localAtual) {
        this.nome = nome;
        this.forca = forca;
        this.vida = vida;
        this.localAtual = localAtual;
    }

    public String getNome() {
        return nome;
    }

    public int getForca() {
        return forca;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }
}
