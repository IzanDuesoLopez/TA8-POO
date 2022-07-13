package ejercicio3;

public class Electrodomestico {

	// Atributos de la clase
	private double precioBase;
	private String color;
	private String consumoEnergetico;
	private double peso;
	
	// Constantes para el constructor por defecto
	private final String colorDefault = "blanco";
	private final String consumoEnergeticoDefault = "F";
	private final double precioBaseDefault = 100.0;
	private final double pesoDefault = 5.0;
	
	// Constructor de la clase por defecto
	public Electrodomestico() {
		this.color = colorDefault;
		this.consumoEnergetico = consumoEnergeticoDefault;
		this.precioBase = precioBaseDefault;
		this.peso = pesoDefault;
	}
	
	// Constructor con el precio y peso, el resto por defecto
	public Electrodomestico(double precioBase, double peso) {
		this.color = colorDefault;
		this.consumoEnergetico = consumoEnergeticoDefault;
		this.precioBase = precioBase;
		this.peso = peso;
	}
	
	// Constructor con todos los atributos
	public Electrodomestico(double precioBase, String color, String consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = elegirColorElectrodomestico(color);
		this.consumoEnergetico = elegirConsumoElectrodomestico(consumoEnergetico);
		this.peso = peso;
	}

	// Método que recibe un color por parámetro, lo comprueba en un switch y devuelve una string con el color disponible
	public String elegirColorElectrodomestico(String colorElectrodomestico) {
		
		String colorFinal;
		
		switch (colorElectrodomestico) {
		case "blanco":
			colorFinal = "blanco";
			break;
		case "negro":
			colorFinal = "negro";
			break;
		case "rojo":
			colorFinal = "rojo";
			break;
		case "azul":
			colorFinal = "azul";
			break;
		case "gris":
			colorFinal = "gris";
			break;
		default:
			colorFinal = "blanco"; // El color por defecto será el blanco
			break;
		}
		
		return colorFinal;
		
	}
	
	// Método que recibe un consumo eléctrico por parámetro, lo comprueba en un switch y devuelve una string con el consumo eléctrico disponible
		public String elegirConsumoElectrodomestico(String consumoElectrico) {
			
			String consumo;
			
			switch (consumoElectrico) {
			case "A":
				consumo = "A";
				break;
			case "B":
				consumo = "B";
				break;
			case "C":
				consumo = "C";
				break;
			case "D":
				consumo = "D";
				break;
			case "E":
				consumo = "E";
				break;
			case "F":
				consumo = "F";
				break;
			default:
				consumo = "F"; // El consumo por defecto será F
				break;
			}
			
			return consumo;
			
		}

	// Getters y Setters
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(String consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	// Método toString que devuelve una String con los atributos de la instancia
	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + "€ " + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "Kg " + "]";
	}
	
	
	
}
