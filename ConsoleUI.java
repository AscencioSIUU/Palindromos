import java.util.Scanner;

public class ConsoleUI {
	    CSVCreator csvCreator = new CSVCreator();
		Palindromos palindromos;
		String[] palabras;
		Lector lector = new Lector("palabras.csv");
		
		public void showMenu() {

			
			String opt;
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

					for (String palabra : lector.readCSV()) {
						palindromos = new Palindromos(palabra);
						if (palindromos.isPalindrome()) {
							palabras = new String[] {palabra};
						}
					}

					System.out.println("Modificar archivo csv");
				} else if (opt.equals("3")) {
					csvCreator.crearArchivoCSV(palabras);
					
					System.out.println("Resultados");
				}else if (opt.equals("4")) {

					System.out.println("Adios");
				} else {
					System.out.println("Opci�n no valida");
				}
				
				
			}while(!opt.equals("4"));
		}
}


