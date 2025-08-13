/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4;

/**
 *
 * @author Admin
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

 
        carros Carro = new carros();
 
        Carro.valorAluguel = 250;
        Carro.modelo = "Fiat Pulse";
        
        Carro.adicionarDia(15);
        
        carros Carro1 = new carros();
 
        Carro1.valorAluguel = 150;
        Carro1.modelo = "Fiat Uno";
        
        Carro1.adicionarDia(7);
        
        carros Carro2 = new carros();
 
        Carro2.valorAluguel = 190;
        Carro2.modelo = "Fiat Sandero";
        
        Carro2.adicionarDia(10);
        
        System.out.println("Modelo: " + Carro.modelo);
        System.out.println("Diaria: " + Carro.valorAluguel);
        System.out.println("Total: " + Carro.valorTotal);
        
        System.out.println("Modelo: " + Carro1.modelo);
        System.out.println("Diaria: " + Carro1.valorAluguel);
        System.out.println("Total: " + Carro1.valorTotal);
        
        System.out.println("Modelo: " + Carro2.modelo);
        System.out.println("Diaria: " + Carro2.valorAluguel);
        System.out.println("Total: " + Carro2.valorTotal);
        
    }

}
