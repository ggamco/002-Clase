package com.cice.clases;

import com.cice.clases.coches.Coche;

public class Main {

    public static void main(String[] args) {

        Coche coche = new Coche();
        coche.setPotencia(40);

        coche.arrancar();
        coche.acelerar();
        coche.frenar();
        coche.parar();

        Coche coche2 = new Coche();
        coche2.setPotencia(50);

        coche2.arrancar();
        coche2.acelerar();
        coche2.frenar();
        coche2.parar();


        Coche coche3 = new Coche();
        coche3.setPotencia(90);

        coche3.arrancar();
        coche3.acelerar();
        coche3.frenar();
        coche3.parar();

        //System.out.println(coche);
        //System.out.println(coche2);
        //System.out.println(coche3);

    }
}
