package juego;
import java.util.Scanner;
public class juegoEstefania {

	 static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Bienvenido a la historia donde t� eres el protagonista!");
		System.out.println("");

		System.out.println("Podr�s elegir entre varias opciones para decidir el rumbo de tu aventura.");
		System.out.println("");
		
		System.out.println("La historia comienza a las 9 de la ma�ana del 15 de diciembre de 1995 en el hospital Infanta Sof�a de Madrid, "
				+ "hacia un frio helador y a�n no hab�a salido el sol.");
		System.out.println("Hoy era un d�a especial, Ingrid Baker estaba a punto de dar a luz. El m�dico anteriormente le hab�a avisado que iba a tener dos mellizos, un ni�o y una ni�a.");
		System.out.println("");
		
		System.out.println("Debido a esta situaci�n, el padre; Richard Williams, decidi� dejar a Ingrid y cortar el contacto con ella y sus futuros hijos.");
		System.out.println("");

		System.out.println("El embarazo iba muy bien, pero iba a suceder un imprevisto desafortunado que cambiar�a dr�sticamente el devenir de la historia, "
				+ "y eres t� qui�n debe decidir qu� rumbo tomar. Este d�a marcar� tu vida y a partir de ah� depende de ti y de tus actos en qui�n t� decidas ser.");
		System.out.println("");
		
		System.out.println("Llega el momento de tomar tu primera decisi�n. Estas en la una encrucijada antes de nacer.");
		System.out.println("");
		System.out.println("Decides:");
		System.out.println("1.- Ingrid sobreviva al parto pero eso involucrar�a que tu hermano fallezca.");
		System.out.println("2.- Decidir salvar a tu hermano, tendr� como consecuencia la muerte de Ingrid.");
		int eleccion = scanner.nextInt();
		
		if (eleccion == 1){
			
			opcion1();
		} else {
			
			opcion2();
		}
		
	}
	
	static void opcion1() {
		

		
	}
	
	static void opcion2() {
		
		
	}

}
