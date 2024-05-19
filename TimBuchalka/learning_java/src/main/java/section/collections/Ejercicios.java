package section.collections;

public class Ejercicios {

	public static void main(String[] args) {
		// Dimensiones de la piscina
		double largo = 8.0;
		double ancho = 6.0;
		double profundidad = 1.5;

		// Costo por metro cuadrado de pintura
		double costoPorMetroCuadrado = 131;

		// Calcular el área de cada superficie
		double areaFondo = largo * ancho;
		System.out.println("Área del fondo: " + areaFondo + " metros cuadrados");
		double areaParedLarga = largo * profundidad;
		System.out.println("Área de la pared larga: " + areaParedLarga + " metros cuadrados");
		double areaParedCorta = ancho * profundidad;
		System.out.println("Área de la pared corta: " + areaParedCorta + " metros cuadrados");

		// Calcular el área total a pintar
		double areaTotal = areaFondo + 2 * areaParedLarga + 2 * areaParedCorta;

		// Calcular el costo total de pintar la piscina
		double costoTotal = areaTotal * costoPorMetroCuadrado;

		// Imprimir los resultados
		System.out.println("Área total a pintar: " + areaTotal + " metros cuadrados");
		System.out.println("Costo total de pintar la piscina: $" + costoTotal);
	}
}
