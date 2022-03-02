/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bono;

/**
 *
 * @author Miguel
 */
public class Bono {

    private int viajes;
    private int precio;
    private String propietario;
    private int viajes_max;

/*Constructor por defecto*/
public Bono(){}

/*Constructor por parámetros*/
public Bono(int viaje, int precio, String propietario,int viajes_max){
    this.viajes=viaje;
    this.precio=precio;
    this.propietario=propietario;
    this.viajes_max=viajes_max;
}


/**
 * Método obtenerViajes
 */

public int obtenerViajes(){return viajes;}


/**
 * Método actualizarViajes
 */
public void actualizarViajes(int viajes){this.viajes=viajes;}

/**
 * Método pagarViajes
 */
public void pagarViajes(int viajes) throws Exception{  
    if (this.viajes < viajes) {
            throw new Exception("No hay suficientes viajes en el bono");
        }
    this.viajes=this.viajes - viajes;
}

/**
 * Método recargarBono
 */
public void recargarBono(int viajes, int dinero) throws Exception{
    if (dinero<=0){
        throw new Exception("Se necesita una cantidad positiva de dinero");
    }
    if (viajes<=0){
        throw new Exception("Es necesaria una cantidad positiva de viajes");
    }
    if (this.viajes + viajes > viajes_max) {
            throw new Exception("No se puede superar el número máximo de viajes del bono");
        }
    if (dinero < viajes * dinero){
            throw new Exception("No tiene dinero suficiente");
    }
    this.viajes=this.viajes+viajes;
    }
}


