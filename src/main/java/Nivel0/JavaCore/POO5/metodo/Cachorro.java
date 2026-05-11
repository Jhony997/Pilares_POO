package Nivel0.JavaCore.POO5.metodo;

public class Cachorro extends Animal{

    public Cachorro(String nome, int forca, int vida, String localAtual) {
        super(nome, forca, vida, localAtual);
    }

    public void EstadoCachorro(int comportamento){
        switch (comportamento){
            case 1:
                System.out.println(getNome() + " Está agressivo");
                setForca(getForca() + 1);
                break;
            case 2:
                System.out.println(getNome() + " Está calmo");
                setForca(getForca() - 1);
                break;
            case 3:
                System.out.println(getNome() + " Está ferido");
                setForca(1);
                break;
            case 4:
                System.out.println(getNome() + " Lambeu o saco e recuperou vida");
                setVida(getVida() + 1);
                break;
            default:
                System.out.println(getNome() + " Não fez nada");
                break;
        }
    }
}
