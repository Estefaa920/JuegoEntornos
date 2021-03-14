package juego;
import java.util.Scanner;
public class juegoEstefania {

 static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Bienvenido a la historia donde tú eres el protagonista!");
		System.out.println("");

		System.out.println("Podrás elegir entre varias opciones para decidir el rumbo de tu aventura.");
		System.out.println("");
		
		System.out.println("La historia comienza a las 9 de la mañana del 15 de diciembre de 1995 en el hospital Infanta Sofía de Madrid, "
				+ "hacia un frio helador y aún no había salido el sol.");
		System.out.println("Hoy era un día especial, Ingrid Baker estaba a punto de dar a luz. El médico anteriormente le había avisado que iba a tener dos mellizos, un niño y una niña.");
		System.out.println("");
		
		System.out.println("Debido a esta situación, el padre; Richard Williams, decidió dejar a Ingrid y cortar el contacto con ella y sus futuros hijos.");
		System.out.println("");

		System.out.println("El embarazo iba muy bien, pero iba a suceder un imprevisto desafortunado que cambiaría drásticamente el devenir de la historia, "
				+ "y eres tú quién debe decidir qué rumbo tomar. Este día marcará tu vida y a partir de ahí depende de ti y de tus actos en quién tú decidas ser.");
		System.out.println("");
		
		System.out.println("Llega el momento de tomar tu primera decisión. Estas en la una encrucijada antes de nacer.");
		System.out.println("");
		
		System.out.println("1.- Ingrid sobreviva al parto pero eso involucraría que tu hermano fallezca.");
		System.out.println("2.- Decidir salvar a tu hermano, tendrá como consecuencia la muerte de Ingrid.");
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
		System.out.println("Estás en la ubicación donde se sitúa el portal. Una vez allí, entras junto con los agentes del GEO a las instalaciones, de camino allí al portal, hay complicaciones.");
		System.out.println();
		System.out.println("Las entidades van matando poco a poco a todos los agentes.");
		System.out.println();
		System.out.println("Huyendo de las entidades consigues llegar hasta el portal, gracias a Aiden.");
		System.out.println();
		System.out.println("Una vez allí, encuentras un centro de controles, en el que hay un botón grande y rojo.");
		System.out.println();
		System.out.println("1.- Pulsar el botón y arriesgarte a que cierre el portal");
		System.out.println("2.- No pulsar el botón e intentar buscar una manera de cerrarlo por ti misma.");
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
		System.out.println("En una de las investigaciones Aiden se corrompe y debido a ello, tu cuerpo no es capaz de soportarlo y entras en un coma en el que nunca volverás a despertar.");
	}
	
	static void opcion5() {
		
		System.out.println("Decides pulsar el botón y el portal se comienza a cerrar, se inicia una cuenta atrás durante la cuál tienes que decidir entre:");
		System.out.println();
		System.out.println("1.- Permanecer en el mundo de los vivos y desvincularte definitivamente de Aiden");
		System.out.println("2.- Acompañar a Aiden al inframundo y convertirte en una entidad");
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
		
		System.out.println("Mientras que intentas buscar la manera de cerrarlo, las entidades destuyen el centro de control generando una explosión, causando tu muerte.");
		System.out.println();
		System.out.println("Debido a esto, el inframundo conquista el mundo de los vivos.");
	}
	
	static void opcion7() {
		
		System.out.println("Al cerrar el portal Aiden se despide de ti y descubres que era el espíritu de tu hermano.");
		System.out.println();
		System.out.println("Has conseguido sobrevivir y salvar el mundo, decides vivir tu vida con la mayor normalidad posible y teniendo a Aiden en tu recuerdo");
	}
	
	static void opcion8() {
		
		System.out.println("Aiden te confiesa que es tu hermano y decides morir e ir al inframundo, permaneciendo con él eternamente");
	}
	
	static void opcion2() {
		
	}
		static void opcion9() {
			
			System.out.println("Decides salir a buscar a Aiden. Tras seguir sus pisadas por el bosque, le encuentras.");
			System.out.println("");
			System.out.println("Comenzáis a dar un paseo y a hablar sobre lo que ha ocurrido.");
			System.out.println("En mitad de la charla, cerca de un precipicio, una manada de ciervos os empiezan a acorralar.");
			System.out.println("Aiden se tropieza y se queda colgando de una rama.");
			System.out.println("");
			System.out.println("Decides:");
			System.out.println("1.- Ayudarle");
			System.out.println("2.- No ayudarle");
			
			int eleccionBosque=scanner.nextInt();
			
			if(eleccionBosque==1) {
				opcion11();
			} else {
				opcion12();
			}
		}
		
		static void opcion11() {
		
			System.out.println("Decides ir a ayudarle, la rama en la que estaba sujeto Aiden se rompe, provocando que os caigáis los dos por el precipicio.");
			System.out.println("Tras la caída, Aiden tiene un muerte instantánea y tú sobrevives.");
		}
		
		static void opcion12() {
			
			System.out.println("Decides no ayudar a tu hermano, por tanto tu hermano muere.");
			System.out.println("Tras su caída, los ciervos te empiezan a acorralar más y terminas cayendo, provocando tu muerte también.");
		}

		static void opcion10() {
			
			System.out.println("Decides esperar que vuelva tu hermano. ");
			System.out.println("Al siguiente día la policía acude al orfanato para comunicarte una terrible noticia, tu hermano a fallecido tras caerse por un barranco.");
			System.out.println("");
		}
		
	}
	
	

}
