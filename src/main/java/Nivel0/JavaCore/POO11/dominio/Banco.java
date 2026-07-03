package Nivel0.JavaCore.POO11.dominio;

import java.util.List;

public class Banco {
    private int valorPessoaBanco;
    private String cadastro = "";
    private final Pessoa p;
    private String nomeBanco;
    private List<Pessoa> listCadastro;

    public Banco(String nomeBanco ,Pessoa p,List<Pessoa> listCadastro) {
        this.p = p;
        this.nomeBanco = nomeBanco;
        this.listCadastro = listCadastro;
    }

    public List<Pessoa> CadastroPesoas(int index,Pessoa p){
        try {
            listCadastro.add(index,p);
            System.out.println(nomeBanco+ " criando seu registro | " + listCadastro.get(index));
        }catch (Exception e){
            e.printStackTrace();
        }

        return listCadastro;
    }

    public void loginBancoV2(int index){
        System.out.println("Acessando as informaçao Bancarias");
        System.out.println("Nome : "+listCadastro.get(index));
    }

    public Pessoa CadastrarPessoa(){
        valorPessoaBanco += p.getDinheiro();
        cadastro += p.getNome();
        System.out.println(nomeBanco+ " criando seu registro | Nome : " + cadastro + " | Valor : " + valorPessoaBanco + "$");
        return p;
    }

    public void loginBancoV1(){
        System.out.println("Acessando as informaçao Bancarias");
        System.out.println("Nome : "+cadastro + " | Dinheiro : "+valorPessoaBanco +"$");
    }

    public int getValorPessoaBanco() {
        return valorPessoaBanco;
    }

    public void setValorPessoaBanco(int valorPessoaBanco) {
        this.valorPessoaBanco = valorPessoaBanco;
    }

    public List<Pessoa> getListCadastro() {
        return listCadastro;
    }
}
