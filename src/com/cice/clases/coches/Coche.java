package com.cice.clases.coches;

public class Coche {

    //atributos de la clase normalmente privados...
    private String color;
    private int potencia;
    private String modelo;
    private String bastidor;
    private String marca;


    public void arrancar(){
        System.out.println("Estoy arrancando...");
        System.out.println("Motor arrancado...");
    }

    public void acelerar(){
        String cadena = "Acelerand";
        int numeros = potencia/10;
        for(int i = 0; i <= numeros; i++){
            cadena+="o";
        }
        System.out.println(cadena+"...");
    }

    public void frenar(){
        System.out.println("Frenando...");
    }

    public void parar(){
        System.out.println("Apagando motor...");
        System.out.println("Motor parado...");
    }

    public void setPotencia(int potenciaDada) {
        if(potenciaDada > 0) {
            potencia = potenciaDada;
        }
    }

}
