package Nivel0.JavaCore.POO11.dominio;

public class Pessoa {
    private int dinheiro;
    private String nome;

    public Pessoa(int dinheiro, String nome) {
        this.dinheiro = dinheiro;
        this.nome = nome;
    }

    public int ganharDinheiro(int valor){
        System.out.println("Trabalho concluido!");
        dinheiro+=valor;
        return valor;
    }

    public void Informacao(){
    System.out.println("Nome : " + this.nome+ " | Total na carteira : " + this.dinheiro+"$");
    }

    public int getDinheiro() {
        return dinheiro;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "dinheiro=" + dinheiro+ "$" +
                ", nome='" + nome + '\'' +
                '}';
    }
}
