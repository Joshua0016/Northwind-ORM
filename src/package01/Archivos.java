package package01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Archivos {

    public static void guardarArchivo(IGuardar objeto) {
        File file = new File(objeto.getFileName());
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(objeto.toFileString() + "\n");
            System.out.println("Archivo guardado: " + file.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

}
