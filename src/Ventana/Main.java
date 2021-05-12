
package Ventana;

import Restaurante.Restaurante;
import Archivo.ArchivoBinario;


/**
 * @author Fabian Montes
 */
public class Main {

   public static Restaurante r = new Restaurante();
   
    public static void main(String[] args) {
      
      // crear objecto de Inicio para iniciar programa
      Inicio ventana = new Inicio();
      ventana.setVisible(true);
      ventana.setLocationRelativeTo(null); // centrar ventana
      r = ArchivoBinario.leer(r); // leer objecto para abrir evitar perdida de datos
      
      
    
      
    }
}
    

