package Nivel0.JavaCore.POO11.Event;

import Nivel0.JavaCore.POO11.dominio.Banco;
import Nivel0.JavaCore.POO11.dominio.ExtraTerrestre;
import Nivel0.JavaCore.POO11.dominio.Pessoa;

public class Server {
    private Banco bc;
    private ExtraTerrestre et;
    private Pessoa pe;
    private int valorBancoRegistro = 0;

    public Server(Banco bc, ExtraTerrestre et, Pessoa pe) {
        this.bc = bc;
        this.et = et;
        this.pe = pe;
    }

    public Banco logar(Pessoa pe){
        bc.CadastroPesoas(valorBancoRegistro,pe);


        bc.loginBancoV2(valorBancoRegistro);
        valorBancoRegistro++;
        return bc;
    }

    public void acessarPerfis(int index,Banco bc){
        try {
            bc.loginBancoV2(index);
        }catch (Exception e){
            System.out.println(e.getCause() + " | Pessoa não registrada!");
        }

    }

    public Pessoa trabalhar(int valor){
        pe.ganharDinheiro(valor);
        pe.Informacao();
        return pe;
    }
}
