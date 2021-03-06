package ejercicios.bloque1.ejercicio5;

/*Crea la clase Oculto que contiene un n�mero oculto. 
 Cuando se crea un objeto de esta clase, se crea internamente un n�mero aleatorio entre 1 y 100, 
 o entre los n�meros que se le pasan por par�metros (m�nimo y m�ximo). 
 Esta clase entr� el m�todo: pruebaNumero(int n), que devolver� 0 si el n�mero es el oculto, 
 -1 si el n�mero oculto es menor y +1 si el n�mero oculto es mayor. 
 Utiliza esta clase para crear la aplicaci�n Adivina el n�mero.*/

public class Oculto {

	private int numeroOculto;
	
	Oculto() {numeroOculto=(int)(Math.random() * 100 + 1);}

	public int pruebaNumero(int n) {
		
		int resultado = 1;
		
		if(n == numeroOculto) {
			resultado = 0;
		}else if(n > numeroOculto) {
			resultado = -1;
		}else if(n < numeroOculto) {
			resultado = 1;
		}
		return resultado;
	}
	
}
