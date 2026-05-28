package Nivel0.JavaCore.POO7.teste;

import Nivel0.JavaCore.POO7.metodo.Pc2004;
import Nivel0.JavaCore.POO7.metodo.PcGamer;
import Nivel0.JavaCore.POO7.metodo.PcXuxa;

public class testToString {
    public static void main(String[] args) {
        Pc2004 pc1 = new Pc2004("Windows XP", 1_500, 20,0);
        Pc2004 pc2 = new Pc2004("Windows 10", 1_900, 30,0);
        PcGamer pcGamer = new PcGamer("Pc Mil grau", 3_900, 90,0);
        PcXuxa xuxa = new PcXuxa("Xuxa 2000 Icore 3 Geração", 150, 15_000,0);

        System.out.println(pc1);
        System.out.println(pc2);
        System.out.println(pcGamer);
        System.out.println(xuxa);
    }
}
