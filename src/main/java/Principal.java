import java.util.InputMismatchException;
import java.util.Scanner;
public class Principal {

	public Principal(){

	}
	public void Menu() {
		Scanner sn = new Scanner(System.in);
		boolean salir = false;
		int opcion; //Guardaremos la opcion del usuario

		while (!salir) {

			System.out.println("1. Mostrar Datos del evento");
			System.out.println("2. Editar datos del evento");
			System.out.println("3. Salir");


			try {

				System.out.println("Escribe una de las opciones");
				opcion = sn.nextInt();

				switch (opcion) {
					case 1:
						Evento evento1 = new Evento("formal");
						evento1.toString();

						break;
					case 2:
						Evento evento2 = new Evento();
						System.out.println("indique el tipo");
						String tipo = sn.nextLine();
						evento2.setTipo(tipo);

						break;
					case 3:
						salir = true;

						break;
					default:
						System.out.println("Solo números entre 1 y 3");
				}
			} catch (InputMismatchException e) {
				System.out.println("Debes insertar un número");
				sn.next();
			}
		}

	}

	}
