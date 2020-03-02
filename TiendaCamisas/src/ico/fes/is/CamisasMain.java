/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.is;

import java.util.Scanner;

/**
 *
 * @author Vannie
 */
public class CamisasMain {
    public static void main(String[] args) {
        
        CamisasShop tienda = new CamisasShop();
        Scanner leer = new Scanner(System.in);
        
        int cant1;
        int cant2;
        int cant3;
        
        System.out.println("Tienda de camisas");
        System.out.println("¿Cuantas camisas de manga corta?");
        cant1 = leer.nextInt();
        System.out.println("¿Cuantas camisas casuales de manga larga?");
        cant2 = leer.nextInt();
        System.out.println("¿Cuantas camisas formales de manga larga?");
        cant3 = leer.nextInt();
        
        tienda.setCantidad1(cant1);
        tienda.setCantidad2(cant2);
        tienda.setCantidad3(cant3);
        
        double total = tienda.calcularConDesc();
        System.out.println("Su total es de: "+total);
        
        
    }
}
