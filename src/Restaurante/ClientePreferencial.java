
package Restaurante;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class ClientePreferencial implements Serializable{
    
    private String nombre;
    private String telefono;
    private List<Reserva> reserva = new ArrayList();
    private Tarjeta tarjeta = new Tarjeta();

    public ClientePreferencial() {
    }

    public ClientePreferencial(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Reserva> getReserva() {
        return reserva;
    }

    public void setReserva(List<Reserva> reserva) {
        this.reserva = reserva;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }
    
    
}
