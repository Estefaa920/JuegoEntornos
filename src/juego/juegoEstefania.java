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
		
		System.out.println("Decidir salvar a tu hermano, tendr� como consecuencia la muerte de Ingrid.");
		System.out.println("");
		System.out.println("Al tomar esta decisi�n, has conseguido salvar a tu hermano Aiden. En contrapartida, tu madre Ingrid no ha logrado sobrevivir al parto.");
		System.out.println("Este tr�gico acontecimiento provoca que Aiden y tu os crieis juntos en un orfanato.");
		System.out.println("");
		System.out.println("17 a�os despu�s�");
		System.out.println("");
		System.out.println("En el orfanato, te hiciste amiga de uan chica muy similar a ti, Zoe Smith.");
		System.out.println("Era sin duda tu mejor amiga del lugar y al tener ambas un car�cter muy parecido, os apoyabais en los momentos dif�ciles. ");
		System.out.println("Zoe hab�a perdido a sus padres por un accidente de tr�fico y llevaba unos pocos a�os en el orfanato. Pero desde que entablasteis conversaci�n por primera vez, se gener� una clara complicidad y habiais forjado una fuerte y cercana amistad.");
		System.out.println("");
		System.out.println("Al principio Aiden la ve�a con ojos de rechazo ya que sent�a un distanciamiento progresivo contigo por dicha relaci�n de amistad.");
		System.out.println("Aiden era un chico introvertido, serio, independiente, que no se habr�a f�cilmente ante otras personas y en el fondo se sent�a solo. ");
		System.out.println("Por ello, ve�a a Zoe como una enemiga y a�n no hab�a hablado con ella ni una sola vez.");
		System.out.println("");
		System.out.println("Un d�a conseguiste convencer a Aiden de que Zoe no era el problema y le pediste que le diera una oportunidad para que se diera cuenta que ella tambi�n podr�a ser buena amiga de ambos y de esta manera fortalecer el v�nculo con tu hermano.");
		System.out.println("Con el paso del tiempo, tanto tu como Aiden y Zoe empezast�is a compartir buenos momentos en el orfanato y formasteis un grupo unido y c�mplice.");
		System.out.println("Pero poco a poco, Aiden se empez� a enamorar de Zoe y a tener fuertes sentimientos por ella.");
		System.out.println("");
		System.out.println("Despu�s de un largo periodo de reflexi�n por parte de tu hermano, decide confesar sus sentimientos a Zoe.");
		System.out.println("Aunque Zoe se sinti� muy halagada por las palabras tan sentidas de Aiden, ella no sent�a lo mismo por �l.");
		System.out.println("Aiden se qued� en shock. Al principio estaba totalmente paralizado y no mov�a ni un m�sculo.");
		System.out.println("Pero r�pidamente se puso a temblar, y se exclam� con un llanto desconsolado diciendo que ya no quer�a ser m�s su amigo.");
		System.out.println("Seguidamente a ello, Aiden se fue a su habitaci�n sin mirar a nadie.");
		System.out.println("");
		System.out.println("Esa misma noche, Aiden se consigue fugar del orfanato sin mirar atr�s, perdi�ndose en los entresijos del bosque.");
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
	static void opcion9() {}
	
	static void opcion10() {}

}
