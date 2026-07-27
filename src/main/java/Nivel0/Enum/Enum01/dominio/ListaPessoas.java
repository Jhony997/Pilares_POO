package Nivel0.Enum.Enum01.dominio;
// usei aqui somente para sintaxe!!
public class ListaPessoas {
    protected String text;

    public enum meuEnum{
        PESSOA_A, PESSOA_B, PESSOA_C, PESSOA_D, PESSOA_E;
    }

    public static void guiaPessoas(meuEnum guia){
        switch (guia){
            case PESSOA_A :
                System.out.println("Paulo");
                break;
            case PESSOA_B :
                System.out.println("Jonas");
                break;
            case PESSOA_C :
                System.out.println("Ana");
                break;
            case PESSOA_D :
                System.out.println("Carlos");
                break;
            case PESSOA_E :
                System.out.println("Maria");
                break;
            default:
                System.out.println("Pessoa não encontrada!");
        }
    }
}
