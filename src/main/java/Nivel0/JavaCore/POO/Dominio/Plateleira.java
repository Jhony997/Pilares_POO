package Nivel0.JavaCore.POO.Dominio;

import java.util.ArrayList;

public class Plateleira {
    private String nome;
    public static final String ANSI_RED = "\u001B[31m";

    public Plateleira(String nome) {
        this.nome = nome;
        System.out.println(nome);
    }

    public void produtos() {
        Produto pw = new Produto(new ArrayList<>(), new ArrayList<>());
        pw.getName().add(0, "Macarrão");
        pw.getPrice().add(0, 2);

        pw.getName().add(1, "Feijão");
        pw.getPrice().add(1, 5);

        pw.getName().add(2, "Frutas");
        pw.getPrice().add(2, 7);

        pw.getName().add(3, "Doces");
        pw.getPrice().add(3, 12);

        try {
            for(int i = 0; i < 5; i++){
                System.out.println(pw.getName().get(i) + " | " + pw.getPrice().get(i) + "$");
            }
        }catch (Exception e){
            System.out.println(ANSI_RED + "⚠\uFE0F AVISO : Valor do LOOP Estourou! ⚠\uFE0F | Causa : " + e.getCause());
        }

    }
}
