package ejercicio4;

public class SerieMainApp {

	public static void main(String[] args) {

		// Creamos un array de objetos de tipo Serie
		Serie serie[] = new Serie[3];
		
		// Creamos 3 objetos, cada uno de ellos utilizará un constructor distinto
		serie[0] = new Serie();
		serie[1] = new Serie("Dragon Ball", "Akira Toriyama");
		serie[2] = new Serie("One Piece", 35, "Aventuras", "Eichiro Oda");
		
		// Bucle FOR en el que recorremos el array de serie, e imprimimos cada instancia con el método toString()
		for (int i = 0; i < serie.length; i++) {
			System.out.println(serie[i].toString());
		}

	}

}
