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


		System.out.println("Has decidido salvar a Ingrid, tu hermano no ha conseguido sobrevivir al parto.");
		System.out.println("");
		System.out.println("3 a�os despu�s�");	
		System.out.println("");

		System.out.println("Desde que eras peque�a, el doctor Nathan Dawkins y tu madre vieron algo especial en ti, no eras como las dem�s ni�as. Comenzaron a ver sucesos extra�os que ocurr�an a tu alrededor. Ten�as un amigo �imaginario� llamado Aiden."
				+ "	Ingrid muri� debido a una depresi�n tras la muerte de tu hermano.");
		System.out.println("A partir de ese entonces, Nathan se hizo de cargo de tu custodia.");
		System.out.println("");
		System.out.println("15 a�os despu�s�");
		System.out.println("");


		System.out.println("Con el paso del tiempo Nathan descubri� que Aiden, es una entidad vinculada a ti. Es un ser inmaterial, con poderes telequin�ticos que hace que tengas contacto con el mundo de los espir�tus.");
		System.out.println("");
		System.out.println("Al ser �un peligro para la sociedad�, la CNP est� informada sobre su existencia.");
		System.out.println("La CNP han encontrando un portal multidimensional en unas instalaciones abandonas, en el que parec�a haber entidades malignas."
				+ "Debido a ello, la CNP contact� contigo para que pudieses ayudar a la exterminaci�n del portal.");
		System.out.println("");
		System.out.println("Decides:");
		System.out.println("1.-Colaborar para que se cierre el portal.");
		System.out.println("2.-No colaborar.");

		int eleccion1 = scanner.nextInt();

		if (eleccion1 == 1){

			opcion3();
		} else {

			opcion4();
		}

	}

	static void opcion3() {}
	static void opcion4() {}

	static void opcion2() {


	}

}
