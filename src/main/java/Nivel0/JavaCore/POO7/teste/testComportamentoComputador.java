package Nivel0.JavaCore.POO7.teste;

import Nivel0.JavaCore.POO7.metodo.Pc2004;
import Nivel0.JavaCore.POO7.metodo.PcGamer;
import Nivel0.JavaCore.POO7.metodo.PcXuxa;

public class testComportamentoComputador {
    public static void main(String[] args) {
        Pc2004 pc24 = new Pc2004("PC2000",1,1,0);
        PcXuxa pcXuxa = new PcXuxa("Xuxa Icore7",1,1,0);
        PcGamer gm = new PcGamer("Haizer-5",15_000,150,0);

        pc24.ligar();
        pc24.mexendoPC("java");
        pc24.acessandorPC();

        System.out.println(" ");

        pc24.AcessaDados();

        gm.cartas21();

    }
}
