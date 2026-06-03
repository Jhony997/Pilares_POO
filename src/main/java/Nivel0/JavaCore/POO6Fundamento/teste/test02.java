package Nivel0.JavaCore.POO6Fundamento.teste;

import Nivel0.JavaCore.POO6Fundamento.dominio.Pessoa;

public class test02 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Jonas",22,0,10);

        p1.dinheiro(2);
        p1.trabalhar();
       boolean beber = p1.beberAgua(true);

        System.out.println(" ");

        p1.carteira();
        System.out.println(p1);
    }
}
