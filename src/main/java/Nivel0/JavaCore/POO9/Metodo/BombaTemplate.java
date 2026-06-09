package Nivel0.JavaCore.POO9.Metodo;

public class BombaTemplate implements bomba{
    private int dano;
    private int alcance;
    private String nome;

    public BombaTemplate(int dano, int alcance, String nome) {
        this.dano = dano;
        this.alcance = alcance;
        this.nome = nome;
    }

    public void informacaoBomba(){
        System.out.println("Nome da bomba : " + nome);
        System.out.println("Dano da bomba : " + dano + " | " + "Alcance da bomba : " + alcance);
    }

    @Override
    public int raioDeExplosao() {
        return alcance;
    }

    @Override
    public int danoExplosao() {
        return dano;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getAlcance() {
        return alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }
}
