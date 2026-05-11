package Nivel0.JavaCore.POO3.teste;

import Nivel0.JavaCore.POO3.metodo.Berilio;
import Nivel0.JavaCore.POO3.metodo.Hidrogenio;
import Nivel0.JavaCore.POO3.metodo.Litio;

public class Test02 {
    public static void main(String[] args) {
        Berilio Be = new Berilio("Berílio",4,20,100);
        Litio Li = new Litio("Lítio",3,15,90);
        Hidrogenio H = new Hidrogenio("Hidrogênio",1,1,15);

        Be.uso();
        Li.uso();
        H.uso();

        //preciso fazer comportamento das classes filhas
    }
}
