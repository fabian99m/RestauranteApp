
package Restaurante;

import java.io.Serializable;

public class Tarjeta implements Serializable {
    
    private int codigo;
    
    public Tarjeta() {
    }

    public Tarjeta(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
   public void generarId(int pos) {
        
        this.codigo = 2500+pos;
    }
    
}
