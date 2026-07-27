package Nivel0.JavaCore.POO13.teste;

import Nivel0.JavaCore.POO13.metodo.Pessoa;

public class test01 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(23,"Jonas",50);
        System.out.println(p1.nomePessoa() + " | " + p1.idade() +" year");
        p1.estadoAtual(Pessoa.Estados.ANDANDO);
        p1.estadoAtual(Pessoa.Estados.CANSADO);
        p1.estadoAtual(Pessoa.Estados.DESCANSANDO);
    }
}
