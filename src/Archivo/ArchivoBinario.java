
package Archivo;


import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import Restaurante.Restaurante;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 * @author Fabian Montes
 */
public class ArchivoBinario {

    private static final String RUTA_ARCHIVO = "datos.dat";

    public static void escribir(Restaurante restaurante) {

        try {
            try (ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream(ArchivoBinario.RUTA_ARCHIVO))) {
                file.writeObject(restaurante);
                file.close();

                System.out.println("Archivo escrito exitosamente!!!");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static Restaurante leer(Restaurante restaurante) {
        try {
            try (ObjectInputStream file = new ObjectInputStream(new FileInputStream(ArchivoBinario.RUTA_ARCHIVO))) {

                restaurante = (Restaurante) file.readObject();
                file.close();
                System.out.println("Archivo recuperado exitosamente!!!");

            }
        } catch (ClassNotFoundException | IOException ex) {
            System.out.println(ex);
        }
        return restaurante;
    }
    
}