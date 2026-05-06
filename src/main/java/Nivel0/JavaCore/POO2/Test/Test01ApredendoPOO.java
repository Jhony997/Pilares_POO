package Nivel0.JavaCore.POO2.Test;

import Nivel0.JavaCore.POO2.Dominio.Computador;
import Nivel0.JavaCore.POO2.Dominio.Geladeira;
import Nivel0.JavaCore.POO2.Dominio.Skate;

public class Test01ApredendoPOO {
    public static void main(String[] args) throws Exception {
        Computador pc = new Computador("Xuxa17", (short) 1,30);
        Geladeira gl = new Geladeira("Frigoba",(short) 1, 1);
        Skate sk = new Skate("Skate-67", (short) 1,5);

        pc.info();

        gl.info();
        gl.interagir();
        gl.interagir();

        sk.info();
        sk.interagir();
    }
}
