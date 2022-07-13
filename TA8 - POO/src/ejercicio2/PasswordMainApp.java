package ejercicio2;

import java.util.Iterator;

public class PasswordMainApp {

	public static void main(String[] args) {

		Password contraseña[] = new Password[3];
		
		// En la posición 0 del array guardaremos una contraseña por defecto, que en
		// este caso estará vacía
		contraseña[0] = new Password();
		
		// Ahora utilizaremos el constructor que recibe por parámetro una longitud
		// y a partir de esta genera una contraseña aleatoria
		contraseña[1] = new Password(10);
		contraseña[2] = new Password(4);
		
		// Bucle FOR en el que recorremos el array de contraseñas, e imprimimos cada instancia con el método toString()
		for (int i = 0; i < contraseña.length; i++) {
			System.out.println(contraseña[i].toString());
		}

	}

}
