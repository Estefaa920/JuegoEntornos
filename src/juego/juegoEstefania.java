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
		
		System.out.println("Decidir salvar a tu hermano, tendrá como consecuencia la muerte de Ingrid.");
		System.out.println("");
		System.out.println("Al tomar esta decisión, has conseguido salvar a tu hermano Aiden. En contrapartida, tu madre Ingrid no ha logrado sobrevivir al parto.");
		System.out.println("Este trágico acontecimiento provoca que Aiden y tu os crieis juntos en un orfanato.");
		System.out.println("");
		System.out.println("17 años después…");
		System.out.println("");
		System.out.println("En el orfanato, te hiciste amiga de uan chica muy similar a ti, Zoe Smith.");
		System.out.println("Era sin duda tu mejor amiga del lugar y al tener ambas un carácter muy parecido, os apoyabais en los momentos difíciles. ");
		System.out.println("Zoe había perdido a sus padres por un accidente de tráfico y llevaba unos pocos años en el orfanato. Pero desde que entablasteis conversación por primera vez, se generó una clara complicidad y habiais forjado una fuerte y cercana amistad.");
		System.out.println("");
		System.out.println("Al principio Aiden la veía con ojos de rechazo ya que sentía un distanciamiento progresivo contigo por dicha relación de amistad.");
		System.out.println("Aiden era un chico introvertido, serio, independiente, que no se habría fácilmente ante otras personas y en el fondo se sentía solo. ");
		System.out.println("Por ello, veía a Zoe como una enemiga y aún no había hablado con ella ni una sola vez.");
		System.out.println("");
		System.out.println("Un día conseguiste convencer a Aiden de que Zoe no era el problema y le pediste que le diera una oportunidad para que se diera cuenta que ella también podría ser buena amiga de ambos y de esta manera fortalecer el vínculo con tu hermano.");
		System.out.println("Con el paso del tiempo, tanto tu como Aiden y Zoe empezastéis a compartir buenos momentos en el orfanato y formasteis un grupo unido y cómplice.");
		System.out.println("Pero poco a poco, Aiden se empezó a enamorar de Zoe y a tener fuertes sentimientos por ella.");
		System.out.println("");
		System.out.println("Después de un largo periodo de reflexión por parte de tu hermano, decide confesar sus sentimientos a Zoe.");
		System.out.println("Aunque Zoe se sintió muy halagada por las palabras tan sentidas de Aiden, ella no sentía lo mismo por él.");
		System.out.println("Aiden se quedó en shock. Al principio estaba totalmente paralizado y no movía ni un músculo.");
		System.out.println("Pero rápidamente se puso a temblar, y se exclamó con un llanto desconsolado diciendo que ya no quería ser más su amigo.");
		System.out.println("Seguidamente a ello, Aiden se fue a su habitación sin mirar a nadie.");
		System.out.println("");
		System.out.println("Esa misma noche, Aiden se consigue fugar del orfanato sin mirar atrás, perdiéndose en los entresijos del bosque.");
		System.out.println("");
		System.out.println("Decides:");
		System.out.println("1.-Salir al bosque a buscar a Aiden.");
		System.out.println("2.-Esperar en el orfanato a que vuelva.");

		int eleccionBosque=scanner.nextInt();

		if(eleccionBosque==1) {
			opcion9();
		} else {
			opcion10();
		}
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
		}
		
	}

}
