import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Lector  {

    private String file;


    public Lector(String file) {
        this.file = file;
    }

    public String[] readCSV() {
        ArrayList<String> palabras = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Separar palabras por comas y diagonales
                String[] palabrasLinea = linea.split("[,/]");
                palabras.addAll(Arrays.asList(palabrasLinea));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return palabras.toArray(new String[0]);
    }

}
