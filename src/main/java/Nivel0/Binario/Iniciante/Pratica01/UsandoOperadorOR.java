package Nivel0.Binario.Iniciante.Pratica01;
/*
https://www.digikey.com.br/pt/resources/conversion-calculators/conversion-calculator-number-conversion
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
 */

public class UsandoOperadorOR {
    public static void main(String[] args) {
        int decimal = 32; // 32 bit um int
        int maskInt = 145;

        decimal |= maskInt;
        System.out.println("int : " + decimal);

        byte dec = 48; // 1 byte -> 8 bits , 127 decimal / -128 negativo = 255 valores distintos
        byte maskByte = 64;
        dec |= maskByte;
        System.out.println("byte : " + dec);
    }
}
