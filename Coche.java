import javax.swing.JOptionPane;

public class Coche {
	// propiedades
	private String matricula = null;
	private String marca = "Seat";
	private String modelo = "ALTEA";
	private String color = "blanco";
	private boolean techoSolar = false;
	private float kilometros = 0;
	private int numPuertas = 3;
	private int numPlazas = 5;
	
	// Constructores
	public Coche() {
		
	}
	
	public Coche(String matricula) {
		this.matricula = matricula;
	}
	
	public Coche (int numPuertas, int numPlazas) {
		setNumPuertas(numPuertas);
		setNumPlazas(numPlazas);
	}
	
	public Coche(String marca, String modelo, String color) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}
	
	
	
	// Setters y Getters
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean hasTechoSolar() {
		return techoSolar;
	}
	public void setTechoSolar(boolean techoSola) {
		this.techoSolar = techoSola;
	}
	public float getKilometros() {
		return kilometros;
	}
	public void setKilometros(float kilometros) {
		if (kilometros < 0) { // para que siempre sea positivo
			kilometros = 0;
			System.out.println("Los kilómetros no pueden ser negativos! Establecido a 0 kilómetros");
		}
		this.kilometros = kilometros;
	}
	public int getNumPuertas() {
		return numPuertas;
	}
	public void setNumPuertas(int numPuertas) {
		if (numPuertas > 5) { // para que no supere 5
			numPuertas = 5;
			System.out.println("Límite de puertas excedido! Establecido a 5 puertas");
		}
		this.numPuertas = numPuertas;
	}
	public int getNumPlazas() {
		return numPlazas;
	}
	public void setNumPlazas(int numPlazas) {
		if (numPlazas > 7) { // para que no supere 7
			numPlazas = 7;
			System.out.println("Límite de plazas excedido! Establecido a 7 plazas");
		}
		this.numPlazas = numPlazas;
	}
	
	// Métodos
		public void avanzar(float km) {
			float kmIniciales = this.kilometros;
			setKilometros(this.kilometros + km);
			JOptionPane.showMessageDialog(null, kmIniciales + " + " + km + " = " + this.kilometros );
		}
		
		public void tunear() {
			setKilometros(0);
			String operaciones = "Se han reseteado los kilómetros";
			if (!techoSolar) {
				techoSolar = true;
				operaciones += " y se ha instalado un techo solar";
			}
			JOptionPane.showMessageDialog(null, operaciones);
		}
		
		public void tunear(String color) {
			this.color = color;
			JOptionPane.showMessageDialog(null, "Se ha cambiado el color del coche a " + color);
			tunear();
		}
		
		public void matricular(String matricula) {
			this.matricula = matricula;
			JOptionPane.showMessageDialog(null, "Se ha cambiado la matricula a " + matricula);
		}
}
