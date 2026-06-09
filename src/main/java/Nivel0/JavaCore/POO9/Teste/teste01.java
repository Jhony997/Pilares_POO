package Nivel0.JavaCore.POO9.Teste;

import Nivel0.JavaCore.POO9.Metodo.BombaBifurcada;
// apartir do momento que usa interface fica muito dificil cria regras

public class teste01 {
    public static void main(String[] args) {
        BombaBifurcada bf = new BombaBifurcada(0,0,"BF_BOMB");

        bf.raioDeExplosao();
        bf.danoExplosao();

        bf.informacaoBomba();
    }
}
