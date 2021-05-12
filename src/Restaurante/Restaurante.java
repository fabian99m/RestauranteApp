
package Restaurante;

import static Ventana.Main.r;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * @author Fabian Montes
 */
public class Restaurante implements Descuento,Serializable{

    public Menú menu = new Menú();
    public  List<ClientePreferencial> cPrefe = new ArrayList<>();
    public List<Mesa> mesa = new ArrayList<>();
    
    
    public Restaurante() {
    }

    public List<ClientePreferencial> getcPrefe() {
        return cPrefe;
    }

    public void setcPrefe(List<ClientePreferencial> cPrefe) {
        this.cPrefe = cPrefe;
    }

    public List<Mesa> getMesa() {
        return mesa;
    }

    public void setMesa(List<Mesa> mesa) {
        this.mesa = mesa;
    }

    
    public Menú getMenu() {
        return menu;
    }

    public void setMenu(Menú menu) {
        this.menu = menu;
    }
    
    public void AñadirPlatos(String nombre,float precio,int cont, boolean dispo) {
       
        menu.getPlatos().add(new Plato());
        menu.getPlatos().get(cont).setTipo(nombre);
        menu.getPlatos().get(cont).setDisponibilidad(dispo);
        menu.getPlatos().get(cont).setPrecio(precio);
        menu.getPlatos().get(cont).generarID(cont);
        
         JOptionPane.showMessageDialog(null, "Plato en el menú añadido satisfactoriamente.");
    }
    public void EliminarPlatos(int pos){
         r.menu.getPlatos().remove(pos);
         JOptionPane.showMessageDialog(null, " Plato eliminado con exito.");
        
    }
    public void AñadirProductos(String nombre,float precio,int cont, boolean dispo) {
       
        menu.getProducto().add(new Producto());
        menu.getProducto().get(cont).setTipo(nombre);
        menu.getProducto().get(cont).setPrecio(precio);
        menu.getProducto().get(cont).setDisponibilidad(dispo);
        menu.getProducto().get(cont).generarID(cont);
       
         JOptionPane.showMessageDialog(null, "Producto en el menú añadido satisfactoriamente.");
    }
    public void EliminarProducto(int pos){
         r.menu.getProducto().remove(pos);
         JOptionPane.showMessageDialog(null, " Producto eliminado con exito.");
        
    }
     
    public void AñadirClientePrefe(String nombre, String telefono,int pos) {
       
        cPrefe.add(new ClientePreferencial());
        cPrefe.get(pos).setNombre(nombre);
        cPrefe.get(pos).setTelefono(telefono);
        cPrefe.get(pos).getTarjeta().generarId(pos);
        JOptionPane.showMessageDialog(null, "Cliente preferencial agregado correctamente. \n *** Su ID es " + cPrefe.get(cPrefe.size()-1).getTarjeta().getCodigo());
        
       
    }
    
    public float crearSubtotal(int mesa) {
        float total = 0;
        for (int j = 0; j < this.mesa.get(mesa).getPedido().getPlatito().size(); j++) {
            total += this.mesa.get(mesa).getPedido().getPlatito().get(j).getCantidad() * this.mesa.get(mesa).getPedido().getPlatito().get(j).getPrecio();
        }
        for (int i = 0; i < this.mesa.get(mesa).getPedido().getProduc().size(); i++) {
            total+=this.mesa.get(mesa).getPedido().getProduc().get(i).getCantidad()*this.mesa.get(mesa).getPedido().getProduc().get(i).getPrecio();
        }
        this.mesa.get(mesa).getFactura().setTotalcuenta(total);
        return this.mesa.get(mesa).getFactura().getTotalcuenta();
    }
    
    @Override
    public float descontar(int mesa) {
        float descuento=0;
        descuento=(float) (this.mesa.get(mesa).getFactura().getTotalcuenta()*0.15);
        return descuento;
     }
    
    public String masvendidoPlato()
    {
      int mayor=0,aux=0;
      mayor=menu.getPlatos().get(0).getVendidos();
      
        for (int i = 0;i<menu.getPlatos().size(); i++) {
           if(menu.getPlatos().get(i).getVendidos()>mayor)
           {
               mayor=menu.getPlatos().get(i).getVendidos();
               aux=i;
           }
        }
     return menu.getPlatos().get(aux).getTipo()+" con "+menu.getPlatos().get(aux).getVendidos()+" ventas";
    }
   public String menosvendidoPlato()
    {
      int menor=0,aux=0;
      menor=menu.getPlatos().get(0).getVendidos();
      
        for (int i = 0;i<menu.getPlatos().size(); i++) {
           if(menu.getPlatos().get(i).getVendidos()<menor)
           {
               menor=menu.getPlatos().get(i).getVendidos();
               aux=i;
           }
        }
     return menu.getPlatos().get(aux).getTipo()+" con "+menu.getPlatos().get(aux).getVendidos()+" ventas";
    
    }
    public String masvendidoProd() {
        int mayor = 0, aux = 0;

        for (int i = 0; i < menu.getProducto().size(); i++) {
            if (menu.getProducto().get(i).getVendidos() > mayor) {
                mayor = menu.getProducto().get(i).getVendidos();
                aux = i;
            }
        }
        return menu.getProducto().get(aux).getTipo() + " con " + menu.getProducto().get(aux).getVendidos() + " ventas";
    }
}