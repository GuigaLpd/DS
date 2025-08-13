/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex4;

/**
 *
 * @author Admin
 */
public class carros {
    String modelo;
    double valorAluguel;
    double valorTotal;
    
    public void adicionarDia(double valorDias){
         valorTotal = valorDias * valorAluguel;
    }
           
}
