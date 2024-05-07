package view;

import classes.ListaDeDisciplinas;

/**
 *
 * @author carol
 */
public class Main {

    public static ListaDeDisciplinas listaD;

    public static void main(String[] args) {
        //aqui iniciaremos as configuraçoes necessarias
        listaD = new ListaDeDisciplinas();
        System.out.println("Inicializando sistema... Lista de disciplinas criada.");
        
        TelaLogin telaLogin = new TelaLogin();
        telaLogin.setVisible(true);
        
        
    }
}
