
package com.mycompany.reto4;
import java.util.HashMap;


/**
 *
 * @author ACER
 */
public class clasePrincipalReto4 {
    public static void main (String[] args){
        
        mesas ocho=new mesas();
        ocho.setMesa8Reservada(true);
        System.out.println(ocho.getMesa8Reservada());
        System.out.println(ocho.getMesa8());
        platos plato=new platos();
        plato.getComida();

        
        
        
    }//cierro llave del main   
}//cierro llave clase principal
