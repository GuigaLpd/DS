/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2;

/**
 *
 * @author Admin
 */
public class teste {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        Hospede hospede = new Hospede();
 
        hospede.nome = "Luiza";
        hospede.dataCheckin = "07/11/2024";
        hospede.valorQuarto = 200.0;
       
        
        hospede.adicionarDia(5);
        
        System.out.println("Nome: " + hospede.nome);
        System.out.println("Valor total da estadia: " + hospede.totalEstadia);
        
        Hospede hospede1 = new Hospede();
 
        hospede1.nome = "Guilherme";
        hospede1.dataCheckin = "01/08/2025";
        hospede1.valorQuarto = 249.99;
       
        
        hospede1.adicionarDia(5);
        
        System.out.println("Nome: " + hospede1.nome);
        System.out.println("Valor total da estadia: " + hospede1.totalEstadia);
        
        
    }

}
