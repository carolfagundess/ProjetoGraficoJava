/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.LinkedList;
import java.util.List;

public class ListaSemestreLetivo {

    private List<SemestreLetivo> lista;

    public ListaSemestreLetivo() {
        lista = new LinkedList<>();
    }

    //---------LISTA---------//
    public List<SemestreLetivo> getLista() {
        return lista;
    }

    public int getSize() {
        return lista.size();
    }

    public void alterarLista(SemestreLetivo semestreLetivo, int i) {
        lista.get(i).setSemestre(semestreLetivo.getSemestre());
        lista.get(i).setAno(semestreLetivo.getAno());
        lista.get(i).setDataInicio(semestreLetivo.getDataInicio());
        lista.get(i).setDataFim(semestreLetivo.getDataFim());
    }
    
    //---------SEMESTRES----------//

    public SemestreLetivo get(int i) {
        return lista.get(i);
    }

    public void addSemestreLista(SemestreLetivo semestreLetivo) {
        lista.add(semestreLetivo);
    }

    public void removeSemestreLista(int i) {
        lista.remove(i);
    }

    //------------------DISCIPLINAS---------------///
    public void addDisciplina(Disciplina d, int i) {
        lista.get(i).getListaDisciplina().add(d);
    }

    public void removeDisciplina(int semestre, int idD) {
        //nao entendi//verificar
    }

    public int getQtdDisciplinas(int i) {
        return lista.get(i).getListaDisciplina().size();
    }

    @Override
    public String toString() {
        return "ListaSemestreLetivo{" + "lista=" + lista + '}';
    }

}
