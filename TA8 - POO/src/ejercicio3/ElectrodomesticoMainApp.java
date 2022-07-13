package ejercicio3;

import java.util.Iterator;

public class ElectrodomesticoMainApp {

	public static void main(String[] args) {

		// Creamos un array de objetos de tipo Electrodomestico
		Electrodomestico electrodomestico[] = new Electrodomestico[3];
		
		// Creamos 3 objetos, cada uno de ellos utilizará un constructor distinto
		electrodomestico[0] = new Electrodomestico();
		electrodomestico[1] = new Electrodomestico(200.5, 400.0);
		electrodomestico[2] = new Electrodomestico(300.0, "azul", "B", 300.0);
		
		// Bucle FOR en el que recorremos el array de electrodomesticos, e imprimimos cada instancia con el método toString()
		for (int i = 0; i < electrodomestico.length; i++) {
			System.out.println(electrodomestico[i].toString());
		}

	}

}
