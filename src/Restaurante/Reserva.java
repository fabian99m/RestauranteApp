
package Restaurante;

//import java.util.Date;

import java.io.Serializable;

public class Reserva  implements Serializable{
    
    private String  fecha;
    private String hora;
    private int mesa;

    public Reserva() {
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    

   
   
   
}
