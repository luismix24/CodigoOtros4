import java.util.Scanner;
// Bienvendido al juego de papel y tijera
// Las reglas son simples:
// El jugador número 1 debe ingresar solo 3 parametros "piedra / papel / tijeras"
// Despues de ingresar el jugador 2 debe elejir un paramtro "piedra / papel / tijeras"
//Con forme a la comparación del programa dará el resultado final de quien es el ganador
// ¡Suerte!
public class Codigo4 {

	public static void main(String[] args) {//faltaba el void main
		Scanner s = new Scanner(System.in); //faltaba System.in
	    
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String j1 = s.nextLine();
	    
	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); //se agrega un 2
	    String j2 = s.nextLine();// tenia doble Scanner
	    
	    if (j1.equals(j2)) {//Se cambia por equals que funciona para comparar
	        System.out.println("Empate");
	      } else {
	        int g = 2;
	        switch(j1) {
	          case "piedra":
	            if (j2.equals("tijeras")) {
	              g = 1;
	            }
	            break; //Faltaba break

	          case "papel":
	            if (j2.equals("piedra")) {
	              g = 1;
	            } // faltaba cerrar if
	            break; //Faltaba break
	          case "tijera":
	            if (j2.equals("papel")) {
	              g = 1;
	            }
	            break;
	          default:
	        	  System.out.println("Entrada no valida");  //imprimir si algun caso no es valido  
	        }
	        System.out.println("Gana el jugador " + g);
	       }
	    s.close(); // Cerrar el scanner
	}

}//Codigo4
