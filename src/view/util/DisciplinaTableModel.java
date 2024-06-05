/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.util;

import classes.Disciplina;
import javax.swing.table.AbstractTableModel;
import view.Main;

/**
 *
 * @author carol
 */
public class DisciplinaTableModel extends AbstractTableModel {

    @Override
    public int getRowCount() {
        return Main.listaD.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Disciplina d = Main.listaD.get(rowIndex);
        return switch (columnIndex) {
            case 0 ->
                d.getNome();
            case 1 ->
                d.getProfessor();
            case 2 ->
                d.getHoras();
            case 3 ->
                d.getSemestre();
            default ->
                "[ERRO]";
        };
    }

    @Override
    public String getColumnName(int column) {
        return switch (column) {
            case 0 -> "Nome";
            case 1 -> "Professor";
            case 2 -> "Horas";
            case 3 -> "Semestre";
            default -> "[ERRO]";
        };
    }

}
