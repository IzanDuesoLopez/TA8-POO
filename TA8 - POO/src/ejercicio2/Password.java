package ejercicio2;

import java.nio.charset.Charset;
import java.util.Random;

public class Password {
	
	// Definimos las variables de clase
	private int longitud;
	private String contraseña;
	
	// Constructor por defecto
	public Password() {
		this.longitud = 8;
		this.contraseña = "";
	}
	
	// Constructor que recibe por parámetro la longitud, y a partir de esta genera una contraseña aleatoria
	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = contraseñaAleatoriaAlfanumerica(longitud);
	}
	
	// Método que pasada una longitud nos devuelve una String con caracteres alfanuméricos aleatorios.
	// He optado por generar una contraseña alfanumérica aleatoria, ya que creo que es lo más seguro.
	public String contraseñaAleatoriaAlfanumerica(int longitud) {
		
		// El número 48 equivale al carácter '0' en la tabla ASCII
		int numeroCeroAscii = 48;
		
		// El número 122 equivale al carácter 'z' en la tabla ASCII
		int letraZetaAscii = 122;
		
		// Limite de los caracteres ASCII
		int limiteCaracterNueve = 57, limiteCaracterSesentaYCinco = 65, limiteCaracterZeta = 90, limiteCaracterA = 97;
		
		// Creamos un objeto tipo random con el que generaremos los enteros aleatorios que iremos
		// concatenando para finalmente pasarlo a String y generar la contraseña alfanumérica.
		Random random = new Random();

		/* En la String randomContraseña concatenaremos caracteres de la tabla ASCII alfanuméricos
		 que se encuentren dentro del rango de los caracteres equivalentes a números, y que se
		 encuentren dentro del rango de los caracteres equivalentes a letras. Finalmente
		 hacemos un toString para pasar estos números enteros a una String que podamos retornar, siendo
		 una contraseña alfanumérica totalmente aleatoria. 
		 
		 Este sería el estilo de contraseñas que utiliza por ejemplo Google al generar contraseñas aleatorias
		 para los diferentes sitios Web*/
		String randomContraseña = random.ints(numeroCeroAscii, letraZetaAscii + 1)
				.filter(i -> (i <= limiteCaracterNueve || i >= limiteCaracterSesentaYCinco)
						&& (i <= limiteCaracterZeta || i >= limiteCaracterA))
				.limit(longitud).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
				.toString();
		
		// Devolvemos la contraseña aleatoria
		return randomContraseña;
	}

	// Getters y Setters
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	// Método toString que nos retorna una String con los parámetros de la instancia
	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contraseña=" + contraseña + "]";
	}
	
	
	
	
}
