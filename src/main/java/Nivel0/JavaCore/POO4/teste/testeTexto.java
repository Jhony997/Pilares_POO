package Nivel0.JavaCore.POO4.teste;

import Nivel0.JavaCore.POO4.metodo.Celular;
import Nivel0.JavaCore.POO4.metodo.Computador;

public class testeTexto {
    public static void main(String[] args) {
        Computador pc = new Computador("Haizer-5",1_500,1);
        Celular cl = new Celular("Iphone-12",12_000,1);

        pc.funcao("on");
        pc.funcao("off");

        cl.funcao("on");
        cl.funcao("off");
    }
}
