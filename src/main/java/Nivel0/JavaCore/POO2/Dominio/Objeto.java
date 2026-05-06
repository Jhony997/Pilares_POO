package Nivel0.JavaCore.POO2.Dominio;

public class Objeto implements ObjectFunc {
    private String nome;
    private short pacote;
    private int quantidadeProduto;

    public Objeto(String nome, short pacote, int quantidadeProduto) {
        this.nome = nome;
        this.pacote = pacote;
        this.quantidadeProduto = quantidadeProduto;
    }
    /*
    Caixa - > conceito para usar mesclagem de bit
    - Não é comportamento / Objeto
    - Conceito fictcio para mesclar bit
     */

    @Override
    public void info() throws Exception {
        System.out.println("----- Dentro da caixa : " + this.nome + " -----");
        System.out.println("Pacote atual : " + this.pacote);
        System.out.println("Quantidade dentro do pacote : " + this.quantidadeProduto);
    }

    @Override
    public void interagir() throws Exception {
        if(quantidadeProduto == 1){
            System.out.println("\u001B[31mAviso \u001B[0m: Acabou os protudo " + this.nome + " da caixa");
        }

        if(quantidadeProduto > 0) {
            quantidadeProduto -= 1;
            System.out.println("Você interagiu com " + this.nome + " dentro do pacote!" + " | restam no pacote : " + quantidadeProduto);
        }else {
            System.out.println("\u001B[31mAção invalida ! ( Sem produto na caixa )\u001B[0m");
        }
    }
}
