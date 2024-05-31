package classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class SemestreLetivo {

    private int ano;
    private int semestre;
    private Date dataFim;
    private List<Disciplina> lista;

    public SemestreLetivo(int ano, int semestre, Date dataFim, List<Disciplina> lista) {
        this.ano = ano;
        this.semestre = semestre;
        this.dataFim = dataFim;
        //cria lista de disciplinas deste semestre
        this.lista = new LinkedList<>();
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    //operações com a lista disciplinas do semestre
    public List<Disciplina> getLista() {
        //retorna a lista
        return lista;
    }

    public Disciplina getDisciplinaSemestre(int i){
        //retorna a disciplina do indice i da lista de disciplinas do semestre
        return lista.get(i);
    }

    public void addLista(Disciplina disciplina) {
        this.lista.add(disciplina);
    }
}
