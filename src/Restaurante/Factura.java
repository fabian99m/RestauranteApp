
package Restaurante;

import java.io.Serializable;


public class Factura  implements Serializable{
    
    
    private float totalcuenta;
   
    public Factura() {
    }

    public float getTotalcuenta() {
        return totalcuenta;
    }

    public void setTotalcuenta(float totalcuenta) {
        this.totalcuenta = totalcuenta;
    }

  
    
}
