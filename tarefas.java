/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3;

/**
 *
 * @author Admin
 */
public class tarefas {
    
    String nome;
    String descricao;
    String prazo;
    String status;
    
    public void concluir(){
        status = "Concluído";
    } public void pendente(){
        status = "Pendente";
    }
    
}
