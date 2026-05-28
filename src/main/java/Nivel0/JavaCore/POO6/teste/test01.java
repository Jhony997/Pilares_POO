package Nivel0.JavaCore.POO6.teste;

import Nivel0.JavaCore.POO6.dominio.Pessoa;

public class test01 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Jonas",21,150.6,50.5);
        Pessoa p2 = new Pessoa("Carlos",25,1500.45,150.5);

        p1.carteira();
        p2.carteira();

        System.out.println(p1);
        System.out.println(p2);

        p1.dinheiroSoma();


        p2.trabalhar();
        p2.carteira();
    }
}
