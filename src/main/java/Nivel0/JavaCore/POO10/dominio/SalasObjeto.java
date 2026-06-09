package Nivel0.JavaCore.POO10.dominio;

public class SalasObjeto implements SalasImplement {
    private String nome;
    private boolean temPessoa;

    public SalasObjeto(String nome, boolean temPessoa) {
        this.nome = nome;
        this.temPessoa = temPessoa;
    }

    public void pessoaSala(){
        if(temPessoa){
            System.out.println(this.nome + " Tem pessoa na sala!");
        }
    }

    @Override
    public void entrar() {
        temPessoa = true;
    }

    @Override
    public String nome() {
        return nome;
    }
}
