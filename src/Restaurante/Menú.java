
package Restaurante;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fabian Montes
 */
public class Menú implements Serializable {
    
    private  List<Plato> plato= new ArrayList<>();
   private List<Producto> producto = new ArrayList<>();

    public Menú() {
    }

    public List<Producto> getProducto() {
        return producto;
    }

    public void setProducto(List<Producto> producto) {
        this.producto = producto;
    }

    
    
    public List<Plato> getPlatos() {
        return plato;
    }

    public void setPlatos(List<Plato> platos) {
        this.plato = platos;
    }
   
    
}
