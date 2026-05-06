package Nivel0.JavaCore.POO3.Event;

import Nivel0.JavaCore.POO3.metodo.Elemento;

public interface Reacao {

    /*
    Junta "Atomos"
     */
    void fusao(Elemento e);

    /*
    Cria um novo "Objeto" ou seja um objeto temporario
     */
    void novoElemento();
}
