package Nivel0.JavaCore.POO13.metodo;
//https://www.dio.me/articles/dicas-de-uso-em-enums-java
public class Pessoa {
    private int idade;
    private String nome;
    private int energia;


    public Pessoa(int idade, String nome, int energia) {
        this.idade = idade;
        this.nome = nome;
        this.energia = energia;
    }

    public int idade(){
        return idade;
    }
    public String nomePessoa(){
        return nome;
    }

    public enum Estados{
        CANSADO,DESCANSANDO,ANDANDO
    }

    public void estadoAtual(Estados fs){
        switch (fs){
            case Estados.CANSADO:
                System.out.println("Cansada");
                break;
            case Estados.DESCANSANDO:
                System.out.println("Descansado");
                break;
            case Estados.ANDANDO:
                System.out.println("Andando");
                break;
            default:
                System.out.println(nome + " : Não entendi!");
                break;
        }
    }
}
