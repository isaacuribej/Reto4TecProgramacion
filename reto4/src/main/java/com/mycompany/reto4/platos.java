package com.mycompany.reto4;

import java.util.HashMap;


/**
 *
 * @author ACER
 */
public class platos {
    private String almuerzos="Panini pollo chipotle,Carne teriyaki,Arroz con pollo-bambu y pollo,Pescado a la plancha,Bandeja Paisa";
    String [] almuerzos1= almuerzos.split(",");
    private String desayunos="Arepa con carne desmechada,Huevos al gusto,Chilaquiles al caballo,Enchiladas gratinadas,Huevos benedictos,Rolls Rellenos,Pancakes";
    String[] desayunos1=desayunos.split(",");
    private String comidas="Espagueti al gusto,Filete de pollo,Lazagna,Ensalada Benedicta,Paella a la valenciana,Pizza con peperoni";
    String[]comidas1= comidas.split(",");
    
    private String[] almuerzosDescripcion={"Pollo a la plancha,queso mozarella,tomate,salsa chipotle","Carne estilo teriyaki,queso tico,hongos y semillas de ajonjoli","bambu y coco-Pollo,hierbas, coco y palmito con arroz al estilo crazy monkey","Filet del dia acompañado con arroz con coco y vegetales","Chicharron, Arroz, platano frito con frijoles y un huevo acompañado con especies y ensalada."};
    private String[] desayunosDescripcion={"Arepa rellena de queso con carne de bufalo desmechada","Huevos, Rancheros, Divorsiados con: Jamon,salchicha, tocino o chorizo","Huevos estrellados, montados sobre chulaquiles, bañados con salsa ranchera","En tortillas de maiz rellenas de polllo, coronadas con una estupenda salsa verde al gratin","Huevos escalfados,aguacate,espinacas y pan tostado","Con bacon, pollo, salchicha o vegetales","Elige entre chocolate, platano, bacon y sirope o yogurt con arandanos"};
    private String[] comidasDescripcion={"Con pollo, camaron pacotilla y salsa a elegir","pollo a la plancha con vegetales de primera calidad","","aguacate,tomate huevo, pepino y kiwi","",""};
    
    private double[] precioAlmuerzos={20.00,16.00,15.00,15.00,15.00};
    private double[] precioDesayunos={7.50,10.00,11.00,15.00,10.00,9.00,14.00};
    private double[] precioComidas={15.00,15.00,15.00,7.00,12.00,12.00};

    
  
    
    public void getAlmuerzos(){
        for (int i=0;i<=4;i++){
            System.out.println((i) + ". "+ almuerzos1[i]+" - "+ almuerzosDescripcion[i]+" - $" + precioAlmuerzos[i]);
        }
    }
    public void getDesayunos(){
        for (int i=0;i<=6;i++){
            System.out.println((i)+". " + desayunos1[i] + " - " + desayunosDescripcion[i] + " - $" + precioDesayunos[i]);
        }
    }
    public void getComida(){
        for (int i=0;i<=5;i++){
            System.out.println((i)+". " + comidas1[i] + " - " + comidasDescripcion[i] + " - $" + precioComidas[i]);
        }
        
    }
}
