/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.util;

import classes.SemestreLetivo;
import java.time.format.DateTimeFormatter;
import javax.swing.table.AbstractTableModel;
import view.Main;

/**
 *
 * @author carol
 */

public class SemestreTableModel extends AbstractTableModel {

    @Override
    public int getRowCount() {
        return Main.listaS.getSize();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/yyyy");
        System.out.println("Row Index: " + rowIndex);
        System.out.println("Column index: " + columnIndex);
        SemestreLetivo s = Main.listaS.get(rowIndex);
        System.out.println("SemestreLetivo: " + s);
        return switch (columnIndex) {
            case 0 ->
                s.getAno();
            case 1 ->
                s.getSemestre();
            case 2 ->
                s.getDataInicio().format(formatter);
            case 3 ->
                s.getDataFim().format(formatter);
            case 4 -> s.getNomeDisciplina();
            default ->
                "[ERRO]";
        };
    }
    

    @Override
    public String getColumnName(int column) {
        return switch (column) {
            case 0 ->
                "Ano";
            case 1 ->
                "Semestre";
            case 2 ->
                "Data Inicio";
            case 3 ->
                "Data Final";
            case 4 ->
                "Disciplinas";
            default ->
                "[ERRO]";
        };
    }
}
