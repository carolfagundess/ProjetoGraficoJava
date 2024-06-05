package view;

import classes.Disciplina;
import classes.ListaDeDisciplinas;
import classes.ListaSemestreLetivo;
import classes.SemestreLetivo;
import java.time.Month;
import java.time.YearMonth;

/**
 *
 * @author carol
 */
public class Main {

    public static ListaDeDisciplinas listaD;
    public static ListaSemestreLetivo listaS;

    public static void main(String[] args) {

        listaD = new ListaDeDisciplinas();
        listaS = new ListaSemestreLetivo();

        //aqui iniciaremos as configuraçoes necessarias
        //criando Disciplinas
        Disciplina d = new Disciplina("Introdução a informatica", "Geison", 75, 1);
        Disciplina d2 = new Disciplina("Arquitetura e organização de computadores", "Hermann", 60, 2);
        Disciplina d3 = new Disciplina("Linguagem de programção II", "Hermann", 30, 3);
        Disciplina d4 = new Disciplina("Redes de Computadores", "Daniel", 75, 4);
        
        listaD.add(d);
        listaD.add(d2);
        listaD.add(d3);
        listaD.add(d4);
        //System.out.println(listaD);

        //criando Semestres
        //1 semestre letivo//2semestre letivo///3 semestre letivo
        SemestreLetivo semestre1 = new SemestreLetivo(2024, 1, YearMonth.of(2024, Month.FEBRUARY), YearMonth.of(2024, Month.JULY));
        SemestreLetivo semestre2 = new SemestreLetivo(2024, 2, YearMonth.of(2024, Month.AUGUST), YearMonth.of(2024, Month.DECEMBER));
        SemestreLetivo semestre3 = new SemestreLetivo(2025, 1, YearMonth.of(2025, Month.FEBRUARY), YearMonth.of(2025, Month.JULY));

        listaS.addSemestreLista(semestre1);
        listaS.addSemestreLista(semestre2);
        listaS.addSemestreLista(semestre3);

        //adicionando disciplinas no semestre conforme SEMESTRE da disciplina   
        listaS.addDisciplina(d, 0);
        listaS.addDisciplina(d2, 1);
        listaS.addDisciplina(d3, 2);
        listaS.addDisciplina(d4, 1);
        
        TelaLogin telaLogin = new TelaLogin();
        telaLogin.setVisible(true);

    }
}
