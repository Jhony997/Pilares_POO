package Nivel0.JavaCore.POO8.metodo;

public class Acao {

    public static boolean bebeAgua(PessoaF pessoaF){
        if(pessoaF.temSede()){
            System.out.println("Bebeu água");
            return true;
        } else {
            System.out.println("Não Bebeu água");
            return false;
        }
    }
}
