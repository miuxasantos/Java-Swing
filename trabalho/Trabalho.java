/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author miuxa
 */
public class Trabalho extends AbstractTableModel {

    private static final long serialVersionUID = 1L;
    
    List<Aluno> listaAlunos = new ArrayList<>();
    
    String[] colunas = {"Nome", "Nota 1", "Nota 2", "Média", "Situação"};
    
    double somaNotas = 0d;
    double media = 0d;
    
    public void salvarAluno(Aluno aluno){
        aluno.calculaMedia();
        aluno.aprovado();
        
        somaNotas += aluno.getMedia();
        listaAlunos.add(aluno);
        Collections.sort(listaAlunos);
        this.fireTableDataChanged();
        System.out.println(aluno);
    }
    
    public void mediaTurma(){
        media = somaNotas/listaAlunos.size();
    }
    
    @Override
    public int getRowCount() {
        return listaAlunos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    @Override
    public String getColumnName(int column){
        return colunas[column];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0 -> {
                return listaAlunos.get(rowIndex).getNome();
            }
               
            case 1 -> {
                return listaAlunos.get(rowIndex).getNotaUm();
            }
                
            case 2 -> {
                return listaAlunos.get(rowIndex).getNotaDois();
            }
            
            case 3 -> {
                return listaAlunos.get(rowIndex).getMedia();
            }
            
            case 4 -> {
                return listaAlunos.get(rowIndex).getSituacao();
            }
        }
            return null;
    }    
    
}
