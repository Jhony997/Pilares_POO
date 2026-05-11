package Nivel0.JavaCore.POO4.metodo;

public class Celular extends Objeto{
    public Celular(String nome, int preco, int quantidade) {
        super(nome, preco, quantidade);
    }

    @Override
    public void funcao(String input) {
        super.funcao(input);

        if(input.equalsIgnoreCase("on")){
            System.out.println("celular ligado");
        }
        if(input.equalsIgnoreCase("off")){
            System.out.println("Desligando celular");
        }
    }
}
