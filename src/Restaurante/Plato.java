package Restaurante;

import java.io.Serializable;
/**
 * @author Fabian Montes
 */
public class Plato implements Serializable {
  
    private int id;
    private String tipo;
    private boolean disponibilidad;
    private float precio;
    private int vendidos;
    private float ventas;
   private int cantidad;
    

    public Plato() {

    }

    public Plato(String tipo, float precio,int id,int cantidad) {
        this.id = id;
        this.tipo = tipo;
//        this.disponibilidad = disponibilidad;
        this.precio = precio;
        this.cantidad=cantidad;
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

    public float getVentas() {
        return ventas;
    }

    public void setVentas(float ventas) {
        this.ventas = ventas;
    }
    

    public void setVendidos(int vendidos) {
        this.vendidos = vendidos;
    }
    
    public void generarID(int pos)
    {
      this.id=pos+1;
    }

}
