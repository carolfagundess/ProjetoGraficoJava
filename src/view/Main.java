package view;

import classes.Disciplina;
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
        
        listaD.add(new Disciplina("Arquitetura e organização de computadores", "Hermann", 60, 2));
        listaD.add(new Disciplina("Ingles II", "Debora", 30, 2));
        listaD.add(new Disciplina("Linguagem de programção II", "Hermann", 30, 3));
        listaD.add(new Disciplina("Banco de dados", "Marlon", 75, 3));
        listaD.add(new Disciplina("Introdução a informatica", "Geison", 75, 1 ));
        
        System.out.println("Inicializando sistema... Lista de disciplinas criada.");
        
        TelaLogin telaLogin = new TelaLogin();
        telaLogin.setVisible(true);
        
        
    }
}
