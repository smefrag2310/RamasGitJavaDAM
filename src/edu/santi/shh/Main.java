package edu.santi.shh;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Investiga el uso de random y genera por pantalla los números de la lotería primitiva.
        Random random = new Random();
        int n,i;
        System.out.println("Números de la Lotería Primitiva:");
        // Genera 5 números principales
        for(i=1;i<=5;i++) {
        n=random.nextInt(99)+1;
        System.out.printf("%d ",n);
        }
        // Número complementario
        n=random.nextInt(99)+1;
        System.out.printf("\nEl número complementario: %d\n",n);
        
        System.out.println("¡Buena suerte en el sorteo!");
        System.out.println("Cambio realizado desde GitHub.");
    }
}
