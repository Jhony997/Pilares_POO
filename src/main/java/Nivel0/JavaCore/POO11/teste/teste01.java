package Nivel0.JavaCore.POO11.teste;

import Nivel0.JavaCore.POO11.dominio.Banco;
import Nivel0.JavaCore.POO11.dominio.ExtraTerrestre;
import Nivel0.JavaCore.POO11.dominio.Pessoa;

import java.util.ArrayList;

public class teste01 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(15,"Jonas");
        Pessoa p2 = new Pessoa(0,"Carlos");
        ExtraTerrestre et = new ExtraTerrestre(0,"ET Bilu");


        p2.ganharDinheiro(105);
        p2.Informacao();

        Banco bc = new Banco("Banco Bradesco",p1,new ArrayList<>());
        Banco bd = new Banco("Banco Guatemala",p2,new ArrayList<>());
        Banco be = new Banco("Banco Ets",et,new ArrayList<>());

      et.ganharDinheiro(100);

        bc.CadastrarPessoa();
        bd.CadastrarPessoa();
        be.CadastrarPessoa();

        System.out.println(" ");

        bc.loginBancoV1();

    }
}
