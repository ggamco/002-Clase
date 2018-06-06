package com.cice.clases.ejercicios;

public class Contador {

    private int cuenta;

    public void incrementar(int numero){
        cuenta+=numero;
    }

    public void decrementar(int numero){
        cuenta-=numero;
    }

    public void setCuenta(int numero) {
        cuenta = numero;
    }

    public int getCuenta(){
        return cuenta;
    }
}
