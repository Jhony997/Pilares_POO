package Nivel0.JavaCore.POO10.dominio;

public class HubSalas {
    private final SalasObjeto s1 = new SalasObjeto("ROOM 1",false);
    private final SalasObjeto s2 = new SalasObjeto("ROOM 2",true);
    private final SalasObjeto s3 = new SalasObjeto("ROOM 3",true);
    private final SalasObjeto s4 = new SalasObjeto("ROOM 4",false);
    private final SalasObjeto s5 = new SalasObjeto("ROOM 5",false);

    public void metodos(){
        s1.pessoaSala();
        s2.pessoaSala();
        s3.pessoaSala();
        s4.pessoaSala();
        s5.pessoaSala();
    }

}
