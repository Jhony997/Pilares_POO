package Nivel0.JavaCore.POO3.teste;

import Nivel0.JavaCore.POO3.Event.Reatividade;
import Nivel0.JavaCore.POO3.metodo.Berilio;
import Nivel0.JavaCore.POO3.metodo.Hidrogenio;
import Nivel0.JavaCore.POO3.metodo.Litio;

public class Teste01 {
    public static void main(String[] args) {
        Berilio Be = new Berilio("Berílio",4,20,100);
        Litio Li = new Litio("Lítio",3,15,90);
        Hidrogenio H = new Hidrogenio("Hidrogênio",1,1,15);

        Be.material();
        Be.durabilidade();
        Be.uso();
        System.out.println(" ");

        Li.material();
        Li.durabilidade();
        Li.uso();
        System.out.println(" ");

        H.material();
        H.durabilidade();
        H.uso();
        System.out.println(" ");

        Reatividade rs = new Reatividade(1,1);
        rs.fusao(H);
    }
}
