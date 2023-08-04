import java.util.Scanner;

public class ConsoleUI {
    public void showMenu() {
        
        
        String opt = "";
		do {
			System.out.println("¡Bienvenido a Palíndromos Finder!");
			System.out.println("Seleccione su opcion");
			System.out.println("1. Leer Archivo");
			System.out.println("2. Gestionar Archivo");
			System.out.println("3. Resultado Palindromos");
            System.out.println("4. Salir");
			
			Scanner in = new Scanner(System.in); //Lectura de datos desde la consola Entrada Estandar
			opt = in.nextLine();
			
			if (opt.equals("1")) {
                System.out.println("El archivo csv dice...");
			} else if (opt.equals("2")) {
				System.out.println("Modificar archivo csv");
			} else if (opt.equals("3")) {
				System.out.println("Resultados");
			}else if (opt.equals("4")) {
				System.out.println("Adios");
			} else {
				System.out.println("Opci�n no valida");
			}
			
			
		}while(!opt.equals("4"));
	}
    }


