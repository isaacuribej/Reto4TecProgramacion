/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.reto4;

/**
 *
 * @author ACER
 */
public class mesas {
    //ATRIBUTOS//
    private int mesa1=3;
    private int mesa2=4;
    private int mesa3=2;
    private int mesa4=4;
    private int mesa5=3;
    private int mesa6=2;
    private int mesa7=4;
    private int mesa8=5;
    private boolean estadoMesa1;
    private boolean estadoMesa2;
    private boolean estadoMesa3;
    private boolean estadoMesa4;
    private boolean estadoMesa5;
    private boolean estadoMesa6;
    private boolean estadoMesa7;
    private boolean estadoMesa8;
    //METODOS 
    //OBTENER EL NÚMERO DE SILLAS EN UNA MESA
    
    public String getMesa1(){
        return "El numero de sillas en la mesa es de: " + mesa1;
    }
    
    public String getMesa2(){
        return "El numero de sillas en la mesa es de: " + mesa2;
    }
    public String getMesa3(){
        return "El numero de sillas en la mesa es de: " +  mesa3;
    }
    public String getMesa4(){
        return "El numero de sillas en la mesa es de: " + mesa4;
    }
    public String getMesa5(){
        return "El numero de sillas en la mesa es de: " + mesa5;
    }
    public String getMesa6(){
        return "El numero de sillas en la mesa es de: " + mesa6;
    }
    public String getMesa7(){
        return "El numero de sillas en la mesa es de: " + mesa7;
    }
    public String getMesa8(){
        return "El numero de sillas en la mesa es de: " + mesa8;
        
    }
    //SET PARA RESERVAR UNA MESA
    void setMesa1Reservada(boolean x){
        estadoMesa1=x;
        }
        
    public void setMesa2Reservada(boolean x){
        estadoMesa2=x;
        }

    public void setMesa3Reservada(boolean x){
        estadoMesa3=x;
        }
    public void setMesa4Reservada(boolean x){
        estadoMesa4=x;
        }
    public void setMesa5Reservada(boolean x){
        this.estadoMesa5=x;
        }
    public void setMesa6Reservada(boolean x){
        estadoMesa6=x;
        }
    public void setMesa7Reservada(boolean x){
        estadoMesa7=x;
        }
    public void setMesa8Reservada(boolean x){
        estadoMesa8=x;
        
        }
    //GET DEL ESTADO DE LA MESA
    public String getMesa1Reservada(){
        return "El estado libre de la mesa es igual a: " + estadoMesa1;
    }
    public String getMesa2Reservada(){
        return "El estado libre de la mesa es igual a: " + estadoMesa2;
    }
    public String getMesa3Reservada(){
        return "El estado libre de la mesa es igual a: " + estadoMesa3;
    }
    public String getMesa4Reservada(){
        return "El estado libre de la mesa es igual a: " + estadoMesa4;
    }
    public String getMesa5Reservada(){
        return "El estado libre de la mesa es igual a: " + estadoMesa5;
    }
    public String getMesa6Reservada(){
        return "El estado libre de la mesa es igual a: " + estadoMesa6;
    }
    public String getMesa7Reservada(){
        return "El estado libre de la mesa es igual a: " + estadoMesa7;
    }
    public String getMesa8Reservada(){
        return "El estado libre de la mesa es igual a: " + estadoMesa8;
    }
}