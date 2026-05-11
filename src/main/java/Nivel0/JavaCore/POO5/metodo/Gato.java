package Nivel0.JavaCore.POO5.metodo;

public class Gato extends Animal{

    public Gato(String nome, int forca, int vida, String localAtual) {
        super(nome, forca, vida, localAtual);
    }

    public void EstadoGato(int comportamento) {
        switch (comportamento) {
            case 1:
                System.out.println(getNome() + " Está nervoso");
                setForca(getForca() + 1);
                break;
            case 2:
                System.out.println(getNome() + " Está agressivo");
                setForca(getForca() + 1);
                break;
            case 3:
                System.out.println(getNome() + " Está ferido");
                setForca(1);
                break;
            case 4:
                System.out.println(getNome() + " Se recuperou do dano");
                setVida(getVida() + 1);
                break;
            default:
                System.out.println(getNome() + " Não fez nada");
                break;
        }
    }
}
