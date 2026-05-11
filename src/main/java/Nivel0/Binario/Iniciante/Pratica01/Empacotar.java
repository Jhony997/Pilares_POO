package Nivel0.Binario.Iniciante.Pratica01;
// Habblet para lógica jogos
// Valor empacotado tem que ser menor que 15

public class Empacotar {
    public static void main(String[] args) {
        int livro = 0;
        int livro_paginas = 0;

        livro |= 9;
        livro |= (10 << 4);
        livro |= (11 << 8);
        livro |= (12 << 12);
        livro |= (13 << 16);
        livro |= (14 << 20);
        livro |= (15 << 24);
        System.out.println(livro);

        livro_paginas = livro;
        for(int i = 0; i < 7; i++){
            int valor = ( livro_paginas >> (4 * i)) & 15;
            System.out.println("Valor binário : " + valor);
        }

        System.out.println(" ");

        int runa = 0;
        int atual_runa = 0;

        runa |= 9;
        runa |= (10 << 4);
        runa |= (11 << 8);
        runa |= (12 << 12);
        runa |= (13 << 16);
        System.out.println(runa);

        atual_runa = runa;
        for(int i = 0; i < 5; i++){
            int valor = ( atual_runa >> (4 * i)) & 15;
            System.out.println("Valor binário : " + valor);
        }

    }
}
