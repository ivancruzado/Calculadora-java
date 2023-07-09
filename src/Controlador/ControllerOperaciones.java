package Controlador;

import Modelo.Numeros;

import java.util.ArrayList;

public class ControllerOperaciones {

    ArrayList <Numeros> listaNumeros;
    private static ControllerOperaciones CONTROLLER = null;

    private ControllerOperaciones() {};

    public static synchronized ControllerOperaciones getInstances(){
        if(CONTROLLER == null) {
            CONTROLLER = new ControllerOperaciones();
        }
        return CONTROLLER;
    }

    public Float sumar(Float num1,Float num2){
        return num1+num2;
    }

    public Float resta(Float num1,Float num2){
        return num1-num2;
    }

    public Float multiplicar(Float num1,Float num2){
        return num1*num2;
    }
    public Float dividir(Float num1,Float num2){
        return num1/num2;
    }

}
