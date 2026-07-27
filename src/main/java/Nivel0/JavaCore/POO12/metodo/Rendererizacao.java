package Nivel0.JavaCore.POO12.metodo;

public class Rendererizacao {
    public static String casa1 ="1";
    public static String casa2 ="2";
    public static String casa3 ="3";
    public static String casa4 ="4";
    public static String casa5 ="5";
    public static String casa6 ="6";
    public static String casa7 ="7";
    public static String casa8 ="8";
    public static String casa9 ="9";

    public static boolean vencerX(){
        boolean venceu = false;
        if(casa1.equalsIgnoreCase("X")&& casa2.equalsIgnoreCase("X") && casa3.equalsIgnoreCase("X")){
            System.out.println("Jogador 1 Venceu");
            venceu = true;
        }

        if(casa4.equalsIgnoreCase("X")&& casa5.equalsIgnoreCase("X") && casa6.equalsIgnoreCase("X")){
            System.out.println("Jogador 1 Venceu");
            venceu = true;
        }

        if(casa7.equalsIgnoreCase("X")&& casa8.equalsIgnoreCase("X") && casa9.equalsIgnoreCase("X")){
            System.out.println("Jogador 1 Venceu");
            venceu = true;
        }

        if(casa1.equalsIgnoreCase("X")&& casa5.equalsIgnoreCase("X") && casa9.equalsIgnoreCase("X")){
            System.out.println("Jogador 1 Venceu");
            venceu = true;
        }

        if(casa3.equalsIgnoreCase("X")&& casa5.equalsIgnoreCase("X") && casa7.equalsIgnoreCase("X")){
            System.out.println("Jogador 1 Venceu");
            venceu = true;
        }
        return venceu;
    }

    public static boolean vencerO(){
        boolean venceu = false;
        if(casa1.equalsIgnoreCase("O")&& casa2.equalsIgnoreCase("O") && casa3.equalsIgnoreCase("O")){
            System.out.println("Jogador 2 Venceu");
            venceu = true;
            return true;
        }

        if(casa4.equalsIgnoreCase("O")&& casa5.equalsIgnoreCase("O") && casa6.equalsIgnoreCase("O")){
            System.out.println("Jogador 2 Venceu");
            venceu = true;
        }

        if(casa7.equalsIgnoreCase("O")&& casa8.equalsIgnoreCase("O") && casa9.equalsIgnoreCase("O")){
            System.out.println("Jogador 2 Venceu");
            venceu = true;
        }

        if(casa1.equalsIgnoreCase("O")&& casa5.equalsIgnoreCase("O") && casa9.equalsIgnoreCase("O")){
            System.out.println("Jogador 2 Venceu");
            venceu = true;
        }

        if(casa3.equalsIgnoreCase("O")&& casa5.equalsIgnoreCase("O") && casa7.equalsIgnoreCase("O")){
            System.out.println("Jogador 2 Venceu");
            venceu = true;
        }
        return venceu;
    }

    public static void grid() {
        System.out.println("Tabuleiro Jogo da velha : ");
        System.out.print("[ " + casa1 + " ]" + "[ " + casa2 + " ]" + "[ " + casa3 + " ]\n");
        System.out.print("[ " + casa4 + " ]" + "[ " + casa5 + " ]" + "[ " + casa6 + " ]\n");
        System.out.print("[ " + casa7 + " ]" + "[ " + casa8 + " ]" + "[ " + casa9 + " ]");
    }

    public static void jogarO(int input) {
        switch (input){
            case 1:
                casa1 = "O";
                break;
            case 2:
                casa2 = "O";
                break;
            case 3:
                casa3 = "O";
                break;
            case 4:
                casa4 = "O";
                break;
            case 5:
                casa5 = "O";
                break;
            case 6:
                casa6 = "O";
                break;
            case 7:
                casa7 = "O";
                break;
            case 8:
                casa8 = "O";
                break;
            case 9:
                casa9 = "O";
                break;
        }
    }

    public static void jogarX(int input) {
        switch (input){
            case 1:
                casa1 = "X";
                break;
            case 2:
                casa2 = "X";
                break;
            case 3:
                casa3 = "X";
                break;
            case 4:
                casa4 = "X";
                break;
            case 5:
                casa5 = "X";
                break;
            case 6:
                casa6 = "X";
                break;
            case 7:
                casa7 = "X";
                break;
            case 8:
                casa8 = "X";
                break;
            case 9:
                casa9 = "X";
                break;
        }
    }
}

