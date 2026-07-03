package Nivel0.JavaCore.POO11.teste;

import Nivel0.JavaCore.POO11.Event.Server;
import Nivel0.JavaCore.POO11.dominio.Banco;
import Nivel0.JavaCore.POO11.dominio.ExtraTerrestre;
import Nivel0.JavaCore.POO11.dominio.Pessoa;

import java.util.ArrayList;

public class teste02 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(0,"Jonas");
        Pessoa p2 = new Pessoa(0,"Marcos Tulio");
        ExtraTerrestre et1 = new ExtraTerrestre(0,"Et-Bilu");
        Banco bc = new Banco("Bradesco",p1,new ArrayList<>());
        Server server = new Server(bc,et1,p1);

        server.logar(p1);
        System.out.println(" ");
        server.trabalhar(10);
        System.out.println(" ");
        server.logar(p1);

        System.out.println(" ");
        System.out.println("----- Pessoa 2 -----");
        System.out.println(" ");
        server.logar(p2);


        System.out.println(" ");
        System.out.println("--- Carregando perfis ---");
        server.acessarPerfis(3,bc);
        server.acessarPerfis(2,bc);
        server.acessarPerfis(1,bc);
        server.acessarPerfis(0,bc);
    }
}
