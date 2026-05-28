package Nivel0.JavaCore.POO7.metodo;

import java.util.Scanner;

public class Computador {
    private String nome;
    private int valor;
    private int poder;
    int estadoPc = 0;

    public Computador(String nome, int valor, int poder, int estadoPc) {
        this.nome = nome;
        this.valor = valor;
        this.poder = poder;
        this.estadoPc = estadoPc;
    }

    public void ligar(){
        estadoPc = 1;
        System.out.println(this.nome + " Ligou !");
        System.out.println("Comportamentos : ");
        System.out.println("web | jogo | chat | java");
    }

    public void acessandorPC(){
        switch (estadoPc){
            case 2:
                System.out.println("Você está na web");
                break;
            case 3:
                System.out.println("Você está jogando");
                break;
            case 4:
                System.out.println("Logado no chat");
                break;
            case 5:
                System.out.println("Codando em java");
                break;
            default:
                System.out.println("Estado inválido");
                break;
        }
    }

    public void mexendoPC(String input){
        switch (input){
            case "web":
                estadoPc = 2;
                break;
            case "jogo":
                estadoPc = 3;
                break;
            case "chat":
                estadoPc = 4;
                break;
            case "java":
                estadoPc = 5;
                break;
            default:
                System.out.println("Input inválido");
                break;
        }
    }

    @Override
    public String toString() {
        return "Computador{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                ", poder=" + poder +
                '}';
    }
}
