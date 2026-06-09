package Nivel0.JavaCore.POO8.teste;

import Nivel0.JavaCore.POO8.metodo.Acao;
import Nivel0.JavaCore.POO8.metodo.FiltroAguaException;
import Nivel0.JavaCore.POO8.metodo.PessoaF;

public class test01 {
    public static void main(String[] args){
        PessoaF jhon = new PessoaF(false);

        Acao.bebeAgua(jhon);

        System.out.println(" ");

        jhon.bebeAgua("KAKA");
        jhon.bebeAgua("SEDE");
    }
}
