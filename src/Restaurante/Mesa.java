
package Restaurante;


import java.io.Serializable;

/**
 * @author Fabian Montes
 */

public class Mesa implements Serializable {
    
    private Factura factura =new Factura();
    private int numero;
    private boolean disponibilidad;
    private Pedido pedido = new Pedido() ;
    
    public Mesa() {
    }

    public Mesa(Factura factura, int numero, boolean disponibilidad) {
        this.factura = factura;
        this.numero = numero;
        this.disponibilidad = disponibilidad;
    }

     
    
   
    
    
    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

   

   
   
}
