package Nivel0.JavaCore.POO12.metodo;

import java.util.Scanner;

public class JogoTest {
    Boolean game = true;
    Scanner in = new Scanner(System.in);


    public void gampelay(int valor){
        while (game){
            Rendererizacao.grid();
            System.out.println(" ");
            System.out.println("Digite Jogador 1 (X) : casa valor jogar");

            valor = in.nextInt();

            Rendererizacao.jogarX(valor);

            if(Rendererizacao.vencerX()){
                System.out.println("Jogo encerrado jogador 1 venceu!");
                game = false;
            }else {
                System.out.println("Digite Jogador 2 (O) : casa valor jogar");
                valor = in.nextInt();
                Rendererizacao.jogarO(valor);
            }if (Rendererizacao.vencerO()){
                System.out.println("Jogo encerrado, jogador 2 venceu!");
                game = false;
            }
        }
    }
}
