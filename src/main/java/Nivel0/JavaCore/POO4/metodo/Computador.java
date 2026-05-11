package Nivel0.JavaCore.POO4.metodo;

public class Computador extends Objeto{

    public Computador(String nome, int preco, int quantidade) {
        super(nome, preco, quantidade);
    }

    @Override
    public void funcao(String input) {
        super.funcao(input);

        if(input.equalsIgnoreCase("on")){
            System.out.println("computador ligando");
        }
        if(input.equalsIgnoreCase("off")){
            System.out.println("Desligando computador");
        }
    }
}
