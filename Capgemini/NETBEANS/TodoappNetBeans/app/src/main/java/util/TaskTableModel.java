/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Task;

/**
 *
 * @author aquino
 */
public class TaskTableModel extends AbstractTableModel {

    String[] columns = {"Nome", "Descrição", "Prazo", "Tarefa Concluída", "Editar", "Excluir"}; 
    List<Task> tasks = new ArrayList();
    
    @Override
    public int getRowCount() {
        
    }

    @Override
    public int getColumnCount() {
    
    }

    @Override
    public Object getValueAt(int i, int i1) {
        
    }
    
}
