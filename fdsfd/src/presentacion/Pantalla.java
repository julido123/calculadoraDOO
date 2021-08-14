package presentacion;

import static presentacion.Menu.mostrarMenuInicial;
import static presentacion.Operaciones.operar;
import static utilitarios.Impresor.imprimirSalidaError;
import static utilitarios.Lector.leerNumeroEntero;

import excepcion.OperacionesExcepcion;

public class Pantalla {

	private static void correrAplicacion() {

		do {
			mostrarMenuInicial();
			try {
				operar(leerNumeroEntero());
			} catch (OperacionesExcepcion excepcion) {
				imprimirSalidaError(excepcion.getMessage());
			}
		} while (true);

	}

	public static void main(String[] args) {
		correrAplicacion();
	}
}
