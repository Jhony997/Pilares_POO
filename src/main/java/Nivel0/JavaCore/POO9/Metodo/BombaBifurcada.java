package Nivel0.JavaCore.POO9.Metodo;

public class BombaBifurcada extends  BombaTemplate{

    public BombaBifurcada(int dano, int alcance, String nome) {
        super(dano, alcance, nome);
    }

    @Override
    public int raioDeExplosao() {
        super.setAlcance(getAlcance() + 10);
        return super.raioDeExplosao();
    }

    @Override
    public int danoExplosao() {
        super.setDano(getDano() + 2);
        return super.danoExplosao();
    }
}
