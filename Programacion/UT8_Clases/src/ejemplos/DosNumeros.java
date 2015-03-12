package ejemplos;

public class DosNumeros {
	// atributos (datos)
	private int numero1;
	private int numero2;
	// m�todos
	public int suma() {
		return numero1+numero2;
	}
	
	public int multiplicacion () {
		return numero1*numero2;
	}
	
	// se puede referenciar a los 2 n�meros en un mismo m�todo, 
	// en lugar de hacerlo por separado.
	public void setNumeros(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	public int getNumero1() {
		return numero1;
	}
	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}
	public int getNumero2() {
		return numero2;
	}
	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
	
}
