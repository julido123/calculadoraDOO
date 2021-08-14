package presentacion;

import static utilitarios.Impresor.imprimirSalidaNormal;
import static utilitarios.Lector.leerNumeroDecimal;
import static utilitarios.Impresor.imprimirSalidaError;
import static utilitarios.Lector.leerNumeroEntero;


import calculo.Calculadora;
import excepcion.CalculadoraExcepcion;
import excepcion.OperacionesExcepcion;

public class Operaciones {

	public static void operar(long opcion) {

		switch ((int) opcion) {
		case 1: {
			sumar();
			break;
		}
		case 2: {
			restar();
			break;
		}
		case 3: {
			dividir();
			break;
		}
		case 4: {
			multiplicar();
			break;
		}
		case 5: {
			dividirEntero();
			break;
		}
		case 6: {
			validarSiNumeroEsPrimo();
			break;
		}
		case 7: {
			hallarMinimoComunMultiplo();
			break;
		}
		case 8: {
			hallarMaximoComunDivisor();
			break;
		}
		case 9: {
			salir();
			break;
		}
		
		default:
			throw new OperacionesExcepcion("Opción " + opcion + " no válida... ");
		}

	}

	private static void sumar() {
		imprimirSalidaNormal("==========INICIO OPERACIÓN SUMAR=========");
		imprimirSalidaNormal("Por favor ingrese el número uno: ");
		double numeroUno = leerNumeroDecimal();

		imprimirSalidaNormal("Por favor ingrese el número dos: ");
		double numeroDos = leerNumeroDecimal();

		double resultado = Calculadora.sumar(numeroUno, numeroDos);

		imprimirSalidaNormal(numeroUno + "+" + numeroDos + "=" + resultado);
		imprimirSalidaNormal("==========FIN OPERACIÓN SUMAR=========");
	}

	private static void restar() {
		imprimirSalidaNormal("==========INICIO OPERACIÓN RESTAR=========");
		imprimirSalidaNormal("Por favor ingrese el número uno: ");
		double numeroUno = leerNumeroDecimal();

		imprimirSalidaNormal("Por favor ingrese el número dos: ");
		double numeroDos = leerNumeroDecimal();

		double resultado = Calculadora.restar(numeroUno, numeroDos);

		imprimirSalidaNormal(numeroUno + "-" + numeroDos + "=" + resultado);
		imprimirSalidaNormal("==========FIN OPERACIÓN RESTAR=========");
	}

	private static void dividir() {
		imprimirSalidaNormal("==========INICIO OPERACIÓN DIVIDIR=========");
		imprimirSalidaNormal("Por favor ingrese el número uno: ");
		double numeroUno = leerNumeroDecimal();

		imprimirSalidaNormal("Por favor ingrese el número dos: ");
		double numeroDos = leerNumeroDecimal();
		
		try {
			double resultado=Calculadora.dividir(numeroUno, numeroDos);
			imprimirSalidaNormal(numeroUno + "/" + numeroDos + "=" + resultado);
		}catch(CalculadoraExcepcion excepcion){
			imprimirSalidaError(excepcion.getMessage());
		}
		
		imprimirSalidaNormal("==========FIN OPERACIÓN DIVIDIR=========");
	}

	private static void multiplicar() {
		imprimirSalidaNormal("==========INICIO OPERACIÓN MULTIPLICAR=========");
		imprimirSalidaNormal("Por favor ingrese el número uno: ");
		double numeroUno = leerNumeroDecimal();

		imprimirSalidaNormal("Por favor ingrese el número dos: ");
		double numeroDos = leerNumeroDecimal();

		double resultado = Calculadora.multiplicar(numeroUno, numeroDos);

		imprimirSalidaNormal(numeroUno + "*" + numeroDos + "=" + resultado);
		imprimirSalidaNormal("==========FIN OPERACIÓN MULTIPLICAR=========");
	}
	
	private static void dividirEntero() {
		imprimirSalidaNormal("==========INICIO OPERACIÓN DIVIDIR ENTEROS=========");
		imprimirSalidaNormal("Por favor ingrese el número uno: ");
		long numeroUno = leerNumeroEntero();

		imprimirSalidaNormal("Por favor ingrese el número dos: ");
		long numeroDos = leerNumeroEntero();

		try {
			long resultado=(long)Calculadora.dividir(numeroUno, numeroDos);
			imprimirSalidaNormal(numeroUno + "/" + numeroDos + "=" + resultado);
		}catch(CalculadoraExcepcion excepcion){
			imprimirSalidaError(excepcion.getMessage());
		}
		imprimirSalidaNormal("==========FIN OPERACIÓN DIVIDIR ENTEROS=========");
	}
	private static void validarSiNumeroEsPrimo() {
		imprimirSalidaNormal("==========INICIO OPERACIÓN VALIDAR SI NUMERO ES PRIMO=========");
		imprimirSalidaNormal("Por favor ingrese el número : ");
		long numero = leerNumeroEntero();

		boolean resultado = Calculadora.esNumeroPrimo(numero);

		imprimirSalidaNormal("¿"+ numero +"es primo? "+(resultado ? "SI":"NO"));
		imprimirSalidaNormal("==========FIN OPERACIÓN VALIDAR SI NUMERO ES PRIMO=========");
	}
	
	private static void hallarMinimoComunMultiplo() {
		imprimirSalidaNormal("==========INICIO OPERACIÓN MINIMO COMUN MULTIPLO=========");
		imprimirSalidaNormal("Por favor ingrese el número uno: ");
		long numeroUno = leerNumeroEntero();

		imprimirSalidaNormal("Por favor ingrese el número dos: ");
		long numeroDos = leerNumeroEntero();

		long resultado = Calculadora.hallarMinimoComunMultiplo(numeroUno, numeroDos);

		imprimirSalidaNormal("El minimo comun multiplo entre"+numeroUno+" y "+numeroDos+"es: "+resultado);
		imprimirSalidaNormal("==========FIN OPERACIÓN HALLAR MINIMO COMUN MULTIPLO=========");
	}
	private static void hallarMaximoComunDivisor() {
		imprimirSalidaNormal("==========INICIO OPERACIÓN MAXIMO COMUN DIVISOR=========");
		imprimirSalidaNormal("Por favor ingrese el número uno: ");
		long numeroUno = leerNumeroEntero();

		imprimirSalidaNormal("Por favor ingrese el número dos: ");
		long numeroDos = leerNumeroEntero();

		long resultado = Calculadora.hallarMaximoComunDivisor(numeroUno, numeroDos);

		imprimirSalidaNormal("El minimo comun multiplo entre"+numeroUno+" y "+numeroDos+"es: "+resultado);
		imprimirSalidaNormal("==========FIN OPERACIÓN HALLAR MAXIMO COMUN DIVISOR=========");
	 	

	private static void salir() {
		imprimirSalidaNormal("Hasta pronto");
		System.exit(0);
	}
}
