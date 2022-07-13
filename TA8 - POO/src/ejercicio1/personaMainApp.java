package ejercicio1;

public class personaMainApp {

	public static void main(String[] args) {

		// Creamos un array de objetos de tipo Persona
		Persona arrayPersonas[] = new Persona[3];
		
		// Creamos 3 objetos, cada uno de ellos utilizará un constructor distinto
		arrayPersonas[0] = new Persona("49937642M");
		arrayPersonas[1] = new Persona("Izan", 21, "39937642M", "H");
		arrayPersonas[2] = new Persona("Lena", 30, "64783672Q", "M", 65.5, 1.68);
		
		// Bucle FOR en el que recorremos el array de personas, e imprimimos cada instancia con el método toString()
		for(int i = 0; i < arrayPersonas.length; i++) {
			System.out.println(arrayPersonas[i].toString());
		}
		
	}

}
