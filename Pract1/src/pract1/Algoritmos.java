/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pract1;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Algoritmos {

    public static double distancia(Punto p1, Punto p2) {
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }

    public Algoritmos() {
    }

    public static ParPuntos Echaustivo(ArrayList<Punto> puntos) {
        double distanciaMinima= distancia(puntos.get(0),puntos.get(1));
        ParPuntos puntosDistMin = new ParPuntos(puntos.get(0),puntos.get(1));
        
        for (int i = 0; i < puntos.size(); i++) {
            for (int j = i+1; j < puntos.size(); j++) {
                double dist = distancia(puntos.get(i),puntos.get(j));
                if(dist < distanciaMinima){
                    distanciaMinima=dist;
                    puntosDistMin =new ParPuntos(puntos.get(0),puntos.get(1));
                }
                System.out.println("i: "+puntos.get(i).toString()+" j: "+puntos.get(j).toString()+ " distancia:" + dist );
                
                
          
            }
        }
        System.out.println("min: " + distanciaMinima + "Puntos: " + puntosDistMin);

        return null;

    }

}
