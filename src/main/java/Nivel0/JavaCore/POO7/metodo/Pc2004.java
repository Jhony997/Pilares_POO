package Nivel0.JavaCore.POO7.metodo;

public class Pc2004 extends Computador{

    public Pc2004(String nome, int valor, int poder, int estadoPc) {
        super(nome, valor, poder, estadoPc);
    }

    public void AcessaDados(){
        int value = (int)(Math.random() * 6) + 1;

        switch (value){
            case 1:
                System.out.println("Valor 1 | Azarado");
                break;
            case 2:
                System.out.println("Valor 2 | Meio-Azarado");
                break;
            case 3:
                System.out.println("Valor 3 | Não deu bom");
                break;
            case 4:
                System.out.println("Valor 4 | Sorutdo");
                break;
            case 5:
                System.out.println("Valor 5 | Mega-Sortudo");
                break;
            case 6:
                System.out.println("Valor 6 | UAU, mais fds né?");
                break;
        }
    }
}
