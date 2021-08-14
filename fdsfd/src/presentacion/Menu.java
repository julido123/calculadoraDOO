package presentacion;

import static utilitarios.Impresor.imprimirSalidaNormal;

public class Menu {

	private Menu() {
	}

	public static void mostrarMenuInicial() {
		imprimirSalidaNormal("¿Qué desea hacer?");
		imprimirSalidaNormal("1-Sumar");
		imprimirSalidaNormal("2-Restar");
		imprimirSalidaNormal("3-Dividir");
		imprimirSalidaNormal("4-Multiplicar");
		imprimirSalidaNormal("5-Division de enteros");
		imprimirSalidaNormal("6-Validar si numero es primo");
		imprimirSalidaNormal("7-Hallar minimo comun  multiplo");
		imprimirSalidaNormal("8-Hallar maximo comun divisor");
		imprimirSalidaNormal("9-Salir");
	}
}
