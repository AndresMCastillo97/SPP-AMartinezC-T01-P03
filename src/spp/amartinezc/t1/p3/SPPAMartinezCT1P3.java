// Andrés de Jesús Martínez Castillo A014411447 IMT
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.amartinezc.t1.p3;
import java.util.Scanner;
/**
 *
 * @author andres
 */
public class SPPAMartinezCT1P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Cálculo de la distancia entre 2 puntos");
        double x1, y1, x2, y2, dis;
        Scanner teclado= new Scanner (System.in);
        
        System.out.println("Ingrese las coordenadas del primer punto");
        System.out.println("x1=");
        x1= teclado.nextDouble();
        System.out.println("y1=");
        y1= teclado.nextDouble();
        
        System.out.println("Ingrese las coordenadas del segundo punto");
        System.out.println("x2=");
        x2= teclado.nextDouble();
        System.out.println("y2=");
        y2= teclado.nextDouble();
        
        dis= Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2, 2));
        
        System.out.println("Distancia= "+ dis);
      
    }
    
}
