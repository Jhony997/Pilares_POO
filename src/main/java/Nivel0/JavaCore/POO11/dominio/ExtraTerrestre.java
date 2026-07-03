package Nivel0.JavaCore.POO11.dominio;

//https://www.devmedia.com.br/entendendo-e-aplicando-heranca-em-java/24544
public class ExtraTerrestre extends Pessoa{

    public ExtraTerrestre(int dinheiro, String nome) {
        super(dinheiro, nome);
    }

    @Override
    public int ganharDinheiro(int valor) {
        return super.ganharDinheiro(valor);
    }
}
