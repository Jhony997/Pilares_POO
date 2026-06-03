package Nivel0.Exception.Nivel0;

public class Test01 {
    public static void main(String[] args) {
        byte a = 10;
        int b = 0;


        try {
            a /= b;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("Erro  na conta ! | " + e.getMessage() + " | " + e.getCause());
        }


    }

    public boolean valor() throws Exception {

        return false;
    }

}
