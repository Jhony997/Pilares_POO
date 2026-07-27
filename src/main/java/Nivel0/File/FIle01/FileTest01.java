package Nivel0.File.FIle01;

import java.io.File;
import java.io.IOException;

public class FileTest01 {
    public static void main(String[] args) throws IOException {
        File diretory = new File("pasta1");
        boolean isDirectoryCreated = diretory.mkdir();
        System.out.println("Diretorio criado? " + isDirectoryCreated);

        File subdiretory = new File(diretory,"subPasta");
        boolean isSubCreated = subdiretory.mkdir();
        System.out.println("sub diretorio criado? " + isSubCreated);

        File subsubdiretory = new File(subdiretory,"subsubPasta");
        boolean isSubSubCreated = subsubdiretory.mkdir();
        System.out.println("sub-sub diretorio criado? " + isSubSubCreated);

        File file2 = new File(subsubdiretory,"file02.txt");
        boolean isCreated2 = file2.createNewFile();
        System.out.println("File 2 foi criada? " + isCreated2);

        File file = new File(diretory,"file01.txt");
        boolean isCreated = file.createNewFile();
        System.out.println("File foi criada? " + isCreated);
    }
}
