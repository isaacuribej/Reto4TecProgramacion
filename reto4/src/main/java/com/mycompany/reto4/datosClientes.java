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
public class datosClientes {
    private String nombreCliente;
    private int numeroDocumento;
    private String tipoDocumento;
    
    public void setNombre(String name){
        nombreCliente=name;
    }
    public String getNombre(){
        return nombreCliente;
    }
    public void setDocumento(int number){
        numeroDocumento=number;
    }
    public int getDocumento(){
        return numeroDocumento;
    }
    public void setTipoDocumento(String Doc){
        tipoDocumento=Doc;
    }
    public String getTipoDocumento(){
        return tipoDocumento + " :" + numeroDocumento ;
    }
    
}
