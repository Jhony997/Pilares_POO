package Nivel0.JavaCore.POO8.metodo;
//Ainda está confuso estou misturando : Valor X Retorno X Condiçao X Exceçao
//Se retirar da carcaça que chamo de pc, pensar fora e voltar com a mente fria dps!
//Estudar melhor isso que to praticando e ir a fundo!

public class PessoaF {
private boolean sedePessoa;
private String statusPessoa;

    public PessoaF(boolean estadoPessoa) {
        this.sedePessoa = estadoPessoa;
    }

    public boolean temSede(){
        if(sedePessoa){
            System.out.println("Pessoa com sede");
        }
        if(!sedePessoa){
            System.out.println("Pessoa não ta com sede");
        }
        return sedePessoa;
    }

    public boolean bebeAgua(String statusPessoa){
        FiltroDeAgua fl = new FiltroDeAgua(0);
        if(fl.getQuantidadeAgua() <= 0){
            throw new FiltroAguaException("Filtro está sem água");
        }

        switch (statusPessoa){
            case "SEDE":
                fl.setQuantidadeAgua(fl.getQuantidadeAgua() - 1);
                System.out.println("Bebeu água | Total de água : " + fl.getQuantidadeAgua());
                return true;
            case "PERTO_FILTRO":
                System.out.println("Perto do filtro | Quantidade de água filtro : " + fl.getQuantidadeAgua());
                return true;
            case "SEM_SEDE":
                System.out.println("Vôce está sem sede home!");
                return false;
            case "PREGUICA":
                System.out.println("Krl, mo preguiça de toma água ( causa da morte pedra no rim )");
                return false;
            default:
                System.out.println("Case invalido! | Validos  : SEDE, PERTO_FILTRO, SEM_SEDE, PREGUICA: ");
                return false;
        }
    }
}
