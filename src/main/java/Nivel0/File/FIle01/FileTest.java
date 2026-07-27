package Nivel0.File.FIle01;

import java.io.*;

public class FileTest {
    public static void main(String[] args) throws IOException {
        File file = new File("file.txt");

        boolean isCreated = file.createNewFile();
        boolean isWrite = file.canWrite();
        boolean isRead = file.canRead();
        long length = file.length();
        System.out.println("File bytes : [ " + length + " ]");
        System.out.println("File criado ? [ " + isCreated + " ]");
        System.out.println("File pode ser escrito ? [ " + isWrite + " ]");
        System.out.println("File pode ser lido ? [ " + isRead + " ]");
        System.out.println("AbsolutePath : " + file.getAbsoluteFile());

        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Hello world in file\n");
        bw.write("Hello world in file2\n");
        bw.write("Meu teste para ver o tamanho do byte, não continuou a mesma bosta\n");
        bw.write("");
        bw.flush();


        System.out.println("--- Read Line ---");
        FileReader fl = new FileReader(file);
        BufferedReader br = new BufferedReader(fl);

        br.readLine();
        String linha;

        while ((linha = br.readLine()) !=null){
            System.out.println(linha);
        }
    }
}
