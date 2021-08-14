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
			throw new OperacionesExcepcion("Opci�n " + opcion + " no v�lida... ");
		}

	}

	private static void sumar() {
		imprimirSalidaNormal("==========INICIO OPERACI�N SUMAR=========");
		imprimirSalidaNormal("Por favor ingrese el n�mero uno: ");
		double numeroUno = leerNumeroDecimal();

		imprimirSalidaNormal("Por favor ingrese el n�mero dos: ");
		double numeroDos = leerNumeroDecimal();

		double resultado = Calculadora.sumar(numeroUno, numeroDos);

		imprimirSalidaNormal(numeroUno + "+" + numeroDos + "=" + resultado);
		imprimirSalidaNormal("==========FIN OPERACI�N SUMAR=========");
	}

	private static void restar() {
		imprimirSalidaNormal("==========INICIO OPERACI�N RESTAR=========");
		imprimirSalidaNormal("Por favor ingrese el n�mero uno: ");
		double numeroUno = leerNumeroDecimal();

		imprimirSalidaNormal("Por favor ingrese el n�mero dos: ");
		double numeroDos = leerNumeroDecimal();

		double resultado = Calculadora.restar(numeroUno, numeroDos);

		imprimirSalidaNormal(numeroUno + "-" + numeroDos + "=" + resultado);
		imprimirSalidaNormal("==========FIN OPERACI�N RESTAR=========");
	}

	private static void dividir() {
		imprimirSalidaNormal("==========INICIO OPERACI�N DIVIDIR=========");
		imprimirSalidaNormal("Por favor ingrese el n�mero uno: ");
		double numeroUno = leerNumeroDecimal();

		imprimirSalidaNormal("Por favor ingrese el n�mero dos: ");
		double numeroDos = leerNumeroDecimal();
		
		try {
			double resultado=Calculadora.dividir(numeroUno, numeroDos);
			imprimirSalidaNormal(numeroUno + "/" + numeroDos + "=" + resultado);
		}catch(CalculadoraExcepcion excepcion){
			imprimirSalidaError(excepcion.getMessage());
		}
		
		imprimirSalidaNormal("==========FIN OPERACI�N DIVIDIR=========");
	}

	private static void multiplicar() {
		imprimirSalidaNormal("==========INICIO OPERACI�N MULTIPLICAR=========");
		imprimirSalidaNormal("Por favor ingrese el n�mero uno: ");
		double numeroUno = leerNumeroDecimal();

		imprimirSalidaNormal("Por favor ingrese el n�mero dos: ");
		double numeroDos = leerNumeroDecimal();

		double resultado = Calculadora.multiplicar(numeroUno, numeroDos);

		imprimirSalidaNormal(numeroUno + "*" + numeroDos + "=" + resultado);
		imprimirSalidaNormal("==========FIN OPERACI�N MULTIPLICAR=========");
	}
	
	private static void dividirEntero() {
		imprimirSalidaNormal("==========INICIO OPERACI�N DIVIDIR ENTEROS=========");
		imprimirSalidaNormal("Por favor ingrese el n�mero uno: ");
		long numeroUno = leerNumeroEntero();

		imprimirSalidaNormal("Por favor ingrese el n�mero dos: ");
		long numeroDos = leerNumeroEntero();

		try {
			long resultado=(long)Calculadora.dividir(numeroUno, numeroDos);
			imprimirSalidaNormal(numeroUno + "/" + numeroDos + "=" + resultado);
		}catch(CalculadoraExcepcion excepcion){
			imprimirSalidaError(excepcion.getMessage());
		}
		imprimirSalidaNormal("==========FIN OPERACI�N DIVIDIR ENTEROS=========");
	}
	private static void validarSiNumeroEsPrimo() {
		imprimirSalidaNormal("==========INICIO OPERACI�N VALIDAR SI NUMERO ES PRIMO=========");
		imprimirSalidaNormal("Por favor ingrese el n�mero : ");
		long numero = leerNumeroEntero();

		boolean resultado = Calculadora.esNumeroPrimo(numero);

		imprimirSalidaNormal("�"+ numero +"es primo? "+(resultado ? "SI":"NO"));
		imprimirSalidaNormal("==========FIN OPERACI�N VALIDAR SI NUMERO ES PRIMO=========");
	}
	
	private static void hallarMinimoComunMultiplo() {
		imprimirSalidaNormal("==========INICIO OPERACI�N MINIMO COMUN MULTIPLO=========");
		imprimirSalidaNormal("Por favor ingrese el n�mero uno: ");
		long numeroUno = leerNumeroEntero();

		imprimirSalidaNormal("Por favor ingrese el n�mero dos: ");
		long numeroDos = leerNumeroEntero();

		long resultado = Calculadora.hallarMinimoComunMultiplo(numeroUno, numeroDos);

		imprimirSalidaNormal("El minimo comun multiplo entre"+numeroUno+" y "+numeroDos+"es: "+resultado);
		imprimirSalidaNormal("==========FIN OPERACI�N HALLAR MINIMO COMUN MULTIPLO=========");
	}
	private static void hallarMaximoComunDivisor() {
		imprimirSalidaNormal("==========INICIO OPERACI�N MAXIMO COMUN DIVISOR=========");
		imprimirSalidaNormal("Por favor ingrese el n�mero uno: ");
		long numeroUno = leerNumeroEntero();

		imprimirSalidaNormal("Por favor ingrese el n�mero dos: ");
		long numeroDos = leerNumeroEntero();

		long resultado = Calculadora.hallarMaximoComunDivisor(numeroUno, numeroDos);

		imprimirSalidaNormal("El minimo comun multiplo entre"+numeroUno+" y "+numeroDos+"es: "+resultado);
		imprimirSalidaNormal("==========FIN OPERACI�N HALLAR MAXIMO COMUN DIVISOR=========");
	 	

	private static void salir() {
		imprimirSalidaNormal("Hasta pronto");
		System.exit(0);
	}
}
