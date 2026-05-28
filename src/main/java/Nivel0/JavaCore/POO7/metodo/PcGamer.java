package Nivel0.JavaCore.POO7.metodo;

import java.util.Scanner;

public class PcGamer extends Computador{

    public PcGamer(String nome, int valor, int poder, int estadoPc) {
        super(nome, valor, poder, estadoPc);
    }

    public void cartas21(){
        int valor;
        int atualCartas = 0;
        boolean jogo = true;
        int valorBotCartas = (int)(Math.random() * 6) + 15;
        String input;
        Scanner stringValue = new Scanner(System.in);

        while (jogo){
            System.out.println("Digite \"sim\" para continuar e \"n\" parar | valor suas cartas : " + atualCartas);
            input = stringValue.next();

            if (input.equalsIgnoreCase("sim")){
               valor = (int)(Math.random() * 11 ) + 1;
               atualCartas += valor;
            }else {
                jogo = false;
            }

            if(atualCartas > 21){
                System.out.println("Você perdeu");
                jogo = false;
            }
        }

        // preciso fazer o empate vai ser de  boa
        if(valorBotCartas > atualCartas){
            System.out.println("Você perdeu suas cartas : " + atualCartas + " | Cartas do bot : " + valorBotCartas);
        }else {
            System.out.println("Você venceu o bot! suas cartas : " + atualCartas + " | Cartas do bot : " + valorBotCartas);

        }
    }
}
