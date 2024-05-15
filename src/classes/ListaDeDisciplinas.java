/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author carol
 */
public class ListaDeDisciplinas {

    private List<Disciplina> list;

    public ListaDeDisciplinas() {
        list = new LinkedList<>();
    }

    public void add(Disciplina d) {
        list.add(d);
    }

    public Disciplina get(int i) {
        return list.get(i);
    }

    public List<Disciplina> getList() {
        return list;
    }

    public void remove(int i){
        list.remove(i);
    }
    
    public int size(){
        return list.size();
    }
    
    public void alterar(Disciplina d, int i){
        list.get(i).setNome(d.getNome());
        list.get(i).setProfessor(d.getProfessor());
        list.get(i).setHoras(d.getHoras());
        list.get(i).setSemestre(d.getSemestre());
    }

    @Override
    public String toString() {
        return "ListaDeDisciplinas{" + "list=" + list + '}';
    }
    
    
}
