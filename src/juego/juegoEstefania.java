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
		
		System.out.println("1.- Ingrid sobreviva al parto pero eso involucrar�a que tu hermano fallezca.");
		System.out.println("2.- Decidir salvar a tu hermano, tendr� como consecuencia la muerte de Ingrid.");
		System.out.println();
		System.out.println("Decide");
		int eleccion = scanner.nextInt();
		
		if (eleccion == 1){
			
			opcion1();
			
		} else {
			
			opcion2();
		}
		
	}
	
	static void opcion1() {
		
		
	}
	
	static void opcion3() {
		
		System.out.println("Decides colaborar con la CNP");
		System.out.println();
		System.out.println("Est�s en la ubicaci�n donde se sit�a el portal. Una vez all�, entras junto con los agentes del GEO a las instalaciones, de camino all� al portal, hay complicaciones.");
		System.out.println();
		System.out.println("Las entidades van matando poco a poco a todos los agentes.");
		System.out.println();
		System.out.println("Huyendo de las entidades consigues llegar hasta el portal, gracias a Aiden.");
		System.out.println();
		System.out.println("Una vez all�, encuentras un centro de controles, en el que hay un bot�n grande y rojo.");
		System.out.println();
		System.out.println("1.- Pulsar el bot�n y arriesgarte a que cierre el portal");
		System.out.println("2.- No pulsar el bot�n e intentar buscar una manera de cerrarlo por ti misma.");
		System.out.println();
		System.out.println("Decides: ");
		int eleccion = scanner.nextInt();
		
		if(eleccion == 1) {
			
			opcion5();
		}else {
			
			opcion6();
		}
	}
	
	
	static void opcion4() {
		
		System.out.println("Decides no colaborar con la CNP, por ese motivo, deciden investigarte para cerrar el portal sin tu ayuda.");
		System.out.println();
		System.out.println("En una de las investigaciones Aiden se corrompe y debido a ello, tu cuerpo no es capaz de soportarlo y entras en un coma en el que nunca volver�s a despertar.");
	}
	
	static void opcion5() {
		
		System.out.println("Decides pulsar el bot�n y el portal se comienza a cerrar, se inicia una cuenta atr�s durante la cu�l tienes que decidir entre:");
		System.out.println();
		System.out.println("1.- Permanecer en el mundo de los vivos y desvincularte definitivamente de Aiden");
		System.out.println("2.- Acompa�ar a Aiden al inframundo y convertirte en una entidad");
		System.out.println();
		System.out.println("Decides: ");
		int eleccion = scanner.nextInt();
		
		if(eleccion == 1) {
			
			opcion7();
		}else {
			
			opcion8();
		}
	}
	
	
	static void opcion6() {
		
		System.out.println("Mientras que intentas buscar la manera de cerrarlo, las entidades destuyen el centro de control generando una explosi�n, causando tu muerte.");
		System.out.println();
		System.out.println("Debido a esto, el inframundo conquista el mundo de los vivos.");
	}
	
	static void opcion7() {
		
		System.out.println("Al cerrar el portal Aiden se despide de ti y descubres que era el esp�ritu de tu hermano.");
		System.out.println();
		System.out.println("Has conseguido sobrevivir y salvar el mundo, decides vivir tu vida con la mayor normalidad posible y teniendo a Aiden en tu recuerdo");
	}
	
	static void opcion8() {
		
		System.out.println("Aiden te confiesa que es tu hermano y decides morir e ir al inframundo, permaneciendo con �l eternamente");
	}
	
	static void opcion2() {
		
		
	}
	
	

}
