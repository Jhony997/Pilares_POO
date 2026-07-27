package Nivel0.JavaCore.POO14.metodo;

public class CriarPessoas {
    private Pessoa pessoa = new Pessoa("",0);

    public void criar(){
        for (int i = 0; i < 20; i++) {
            int idade = 2;
            idade *=i;
            pessoa = new Pessoa( "Pessoa Test",idade);
            System.out.println(pessoa);
        }
    }
}
