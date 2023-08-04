import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CSVCreator {


    public void crearArchivoCSV(String[] Palabras) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("palindromas.csv"))) {
            for (String palabra : Palabras) {
                writer.write(palabra);
                writer.newLine();
            }
            System.out.println("Archivo CSV de palabras palíndromas creado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al crear el archivo CSV de palabras palíndromas.");
        }
    }

    // Puedes agregar otros métodos o atributos a esta clase según tus necesidades.
}
