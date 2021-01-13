import javax.swing.JOptionPane;

public class Fabrica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche car1 = new Coche();
		Coche car2 = new Coche("5678-AG");
		Coche car3 = new Coche(5,5);
		Coche car4 = new Coche("VW", "Caddy", "blanco");
		
		car1.matricular("1234-DF");
		car1.setModelo("Toledo");
		car1.setColor("azul");
		car1.avanzar(200);
		car1.setNumPuertas(3);
		car1.setNumPlazas(5);
		
		car2.setMarca("Fiat");
		car2.setModelo("Uno");
		car2.tunear("rojo");
		car2.avanzar(300);
		car2.setNumPuertas(3);
		car2.setNumPlazas(2);
		
		car3.matricular("9012-HH");
		car3.setMarca("BMW");
		car3.setModelo("850");
		car3.setColor("gris");
		car3.setTechoSolar(false);
		car3.avanzar(400);
		
		car4.matricular("3456-XS");
		car4.setTechoSolar(true);
		car4.avanzar(500);
		car4.setNumPuertas(5);
		car4.setNumPlazas(7);
		
		Coche cars[] = new Coche[4];
		cars[0] = car1;
		cars[1] = car2;
		cars[2] = car3;
		cars[3] = car4;
		
		String textoSalida = "variable, matricula, marca, modelo, color, techo solar, km, num puertas, num plazas\n";
		for (int i = 0; i < cars.length; i++) {
			textoSalida += "car" + (i+1) + ", ";
			textoSalida += caracteristicas(cars[i]);
		}
		
		JOptionPane.showMessageDialog(null, textoSalida);
	}
	
	static String caracteristicas(Coche car) {
		String salida = "";
		salida += car.getMatricula() + ", ";
		salida += car.getMarca() + ", ";
		salida += car.getModelo() + ", ";
		salida += car.getColor() + ", ";
		salida += car.hasTechoSolar() + ", ";
		salida += car.getKilometros() + ", ";
		salida += car.getNumPuertas() + ", ";
		salida += car.getNumPlazas() + "\n";
		return salida;
		
	}

}
