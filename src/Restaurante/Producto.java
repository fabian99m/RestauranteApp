
package Restaurante;

import java.io.Serializable;

/**
 * @author Fabian Montes
 */
public class Producto implements Serializable {
    
    private int cantidad;
    private String tipo;
    private boolean disponibilidad;
    private float precio;
    private int id;
    private int vendidos;
    
    
    public Producto() {
       
    }

    public Producto( String tipo,  float precio, int id,int cantidad) {
        this.cantidad = cantidad;
        this.tipo = tipo;
        this.precio = precio;
        this.id = id;
    }

    public void generarID(int pos)
    {
      this.id=pos+1;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVendidos() {
        return vendidos;
    }

    public void setVendidos(int vendidos) {
        this.vendidos = vendidos;
    }
   
    
 
    
}
