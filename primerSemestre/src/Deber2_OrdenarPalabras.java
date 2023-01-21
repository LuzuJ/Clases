import java.util.Iterator;
import java.util.Scanner;

public class Deber2_OrdenarPalabras {

	public static void main(String[] args) {
		// Asignar y Definir variables
		String palabraIngresada1, palabraIngresada2, palabraIngresada3;
		char caracter1, caracter2, caracter3;
		int contador1, contador2 = 0;
		char operadorC1, operadorC2, operadorC3;
		int posicion1 = 0, posicion2 = 0, posicion3 = 0;

		// Ingreso de datos
		System.out.println("Ingrese tres palabras por favor:");
		Scanner ingresoDatos = new Scanner(System.in);
		palabraIngresada1 = ingresoDatos.nextLine().toLowerCase();
		palabraIngresada2 = ingresoDatos.nextLine().toLowerCase();
		palabraIngresada3 = ingresoDatos.nextLine().toLowerCase();

		// Elegir la primera letra que sera analisada
		caracter1 = palabraIngresada1.charAt(0);
		caracter2 = palabraIngresada2.charAt(0);
		caracter3 = palabraIngresada3.charAt(0);

		// Para cuando dos palabras son iguales //palabraIngresada1 = palabraIngresada2
		if (palabraIngresada1.equals(palabraIngresada2) && palabraIngresada1 != palabraIngresada3) {
			if (caracter1 < caracter3) {
				System.out.println(
						"El orden es: " + palabraIngresada1 + " " + palabraIngresada2 + " " + palabraIngresada3);
			} else {
				System.out.println(
						"El orden es: " + palabraIngresada3 + " " + palabraIngresada1 + " " + palabraIngresada2);
			}
		} else {// Para cuando dos palabras son iguales //palabraIngresada1 = palabraIngresada3
			if (palabraIngresada1.equals(palabraIngresada3) && palabraIngresada1 != palabraIngresada2) {
				if (caracter1 < caracter2) {
					System.out.println(
							"El orden es: " + palabraIngresada1 + " " + palabraIngresada3 + " " + palabraIngresada2);
				} else {
					System.out.println(
							"El orden es: " + palabraIngresada2 + " " + palabraIngresada1 + " " + palabraIngresada3);
				}
			}
			// Para cuando dos palabras son iguales //palabraIngresada2 = palabraIngresada3
			if (palabraIngresada2.equals(palabraIngresada3) && palabraIngresada2 != palabraIngresada1) {
				if (caracter2 < caracter1) {
					System.out.println(
							"El orden es: " + palabraIngresada2 + " " + palabraIngresada3 + " " + palabraIngresada1);
				} else {
					System.out.println(
							"El orden es: " + palabraIngresada1 + " " + palabraIngresada2 + " " + palabraIngresada3);
				}
			} else {// Para cuando las 3 palabras son iguales //palabraIngresada1 =
					// palabraIngresada2 = palabraIngresada3
				if (palabraIngresada1 == palabraIngresada2 && palabraIngresada1 == palabraIngresada3
						&& palabraIngresada2 == palabraIngresada3) {
					System.out.println(
							"El orden es: " + palabraIngresada1 + " " + palabraIngresada2 + " " + palabraIngresada3);
				}
				// Para cuando las palabras son totalmente distintas.

				if (caracter1 != caracter2 && caracter1 != caracter3 && caracter2 != caracter3) {
					for (contador1 = 97; contador1 <= 122; contador1++) {
						if (caracter1 == contador1) {
							posicion1 = contador1;
						} else {
							if (caracter2 == contador1) {
								posicion2 = contador1;
							} else {
								if (caracter3 == contador1) {
									posicion3 = contador1;
								}
							}
						}
					}
					// Para imprimir el orden de las palabras cuando son totalmente distintas
					if (posicion1 < posicion2 && posicion2 < posicion3) {
						System.out.println("El orden es: " + palabraIngresada1 + " " + palabraIngresada2 + " "
								+ palabraIngresada3);
					} else {
						if (posicion2 < posicion1 && posicion1 < posicion3) {
							System.out.println("El orden es: " + palabraIngresada2 + " " + palabraIngresada1 + " "
									+ palabraIngresada3);
						} else {
							if (posicion3 < posicion1 && posicion1 < posicion2) {
								System.out.println("El orden es: " + palabraIngresada3 + " " + palabraIngresada1 + " "
										+ palabraIngresada2);
							} else {
								if (posicion1 < posicion3 && posicion3 < posicion2) {
									System.out.println("El orden es: " + palabraIngresada1 + " " + palabraIngresada3
											+ " " + palabraIngresada2);
								} else {
									if (posicion2 < posicion3 && posicion3 < posicion1) {
										System.out.println("El orden es: " + palabraIngresada2 + " " + palabraIngresada3
												+ " " + palabraIngresada1);
									} else {
										System.out.println("El orden es: " + palabraIngresada3 + " " + palabraIngresada2
												+ " " + palabraIngresada1);
									}
								}
							}
						}
					}
				} else {

					// Para cuando las palabras 1, 2 y 3 son semejantes
					if (caracter1 == caracter2 && caracter1 == caracter3 && caracter2 == caracter3) {
						for (contador2 = 1; contador2 <= palabraIngresada1.length(); contador2++) {
							// Operamos para probar con los demas caracteres de la palabra
							operadorC1 = palabraIngresada1.charAt(contador2);
							operadorC2 = palabraIngresada2.charAt(contador2);
							operadorC3 = palabraIngresada3.charAt(contador2);
							// Para que la condicion finalice, una vez se encuentre las tres letras
							// diferentes.
							if (operadorC2 != operadorC3 && operadorC1 != operadorC3 && operadorC1 != operadorC2) {
								contador2 = (palabraIngresada1.length());
							}
							// Impresion de resultados
							if (operadorC1 < operadorC2 && operadorC2 < operadorC3) {
								System.out.println("El orden es: " + palabraIngresada1 + " " + palabraIngresada2 + " "
										+ palabraIngresada3);
							} else {
								if (operadorC1 < operadorC2 && operadorC3 < operadorC2 && operadorC3 < operadorC1) {
									System.out.println("El orden es: " + palabraIngresada3 + " " + palabraIngresada1
											+ " " + palabraIngresada2);
								} else {
									if (operadorC1 < operadorC2 && operadorC3 < operadorC2 && operadorC1 < operadorC3) {
										System.out.println("El orden es: " + palabraIngresada1 + " " + palabraIngresada3
												+ " " + palabraIngresada2);
									}
								}
							}
							if (operadorC2 < operadorC1 && operadorC1 < operadorC3) {
								System.out.println("El orden es: " + palabraIngresada2 + " " + palabraIngresada1 + " "
										+ palabraIngresada3);
							} else {
								if (operadorC2 < operadorC1 && operadorC3 < operadorC1 && operadorC3 < operadorC2) {
									System.out.println("El orden es: " + palabraIngresada3 + " " + palabraIngresada2
											+ " " + palabraIngresada1);
								} else {
									if (operadorC2 < operadorC1 && operadorC3 < operadorC1 && operadorC2 < operadorC3) {
										System.out.println("El orden es: " + palabraIngresada2 + " " + palabraIngresada3
												+ " " + palabraIngresada1);
									}
								}
							}
							// Cuando se encuentre 2 caracteres similares en la palabra.//operadorC1 =
							// operador C2
							if (operadorC1 == operadorC2 && operadorC1 != operadorC3 && operadorC2 != operadorC3) {
								// Se les reasignará en los caractes para que el siguiente bloque de codigo se
								// ocupe de este caso.
								caracter1 = operadorC1;
								caracter2 = operadorC2;
								caracter3 = operadorC3;
								contador2 = (palabraIngresada1.length());// Para salir del for, porque este bloque no le
																			// corresponde este caso.
							}
							// Cuando se encuentre 2 caracteres similares en la palabra.//operadorC1 =
							// operador C3
							if (operadorC1 != operadorC2 && operadorC1 == operadorC3 && operadorC2 != operadorC3) {
								// Se les reasignará en los caractes para que el siguiente bloque de codigo se
								// ocupe de este caso.
								caracter1 = operadorC1;
								caracter2 = operadorC2;
								caracter3 = operadorC3;
								contador2 = (palabraIngresada1.length());// Para salir del for, porque este bloque no le
																			// corresponde este caso.
							}
							// Cuando se encuentre 2 caracteres similares en la palabra.//operadorC2 =
							// operador C3
							if (operadorC1 != operadorC2 && operadorC1 != operadorC3 && operadorC2 == operadorC3) {
								// Se les reasignará en los caractes para que el siguiente bloque de codigo se
								// ocupe de este caso.
								caracter1 = operadorC1;
								caracter2 = operadorC2;
								caracter3 = operadorC3;
								contador2 = (palabraIngresada1.length());// Para salir del for, porque este bloque no le
																			// corresponde este caso.
							}
						}
					}

					// Para palabras 1 y 2 semejantes
					if (caracter1 == caracter2 && caracter1 != caracter3 && caracter2 != caracter3) {
						for (contador2 = 1; (contador2 <= palabraIngresada1.length()); contador2++) {
							// Operamos para probar con los demas caracteres de la palabra
							operadorC1 = palabraIngresada1.charAt(contador2);
							operadorC2 = palabraIngresada2.charAt(contador2);
							// Para que la condicion finalice, una vez se encuentre las letras diferentes.
							if (operadorC1 != operadorC2) {
								contador2 = palabraIngresada1.length();
							}
							// Impresion de resultados
							if (operadorC1 < operadorC2) {// operadorC1 < operadorC2
								if (caracter1 < caracter3) {
									System.out.println("El orden es: " + palabraIngresada1 + " " + palabraIngresada2
											+ " " + palabraIngresada3);
								} else {
									System.out.println("El orden es: " + palabraIngresada3 + " " + palabraIngresada1
											+ " " + palabraIngresada2);
								}
							} else {// operadorC2 < operadorC1
								if (caracter1 < caracter3 && operadorC2 < operadorC1) {
									System.out.println("El orden es: " + palabraIngresada2 + " " + palabraIngresada1
											+ " " + palabraIngresada3);
								} else {
									if (operadorC2 < operadorC1)
										System.out.println("El orden es: " + palabraIngresada3 + " " + palabraIngresada2
												+ " " + palabraIngresada1);
								}
							}
						}
					}
					// Para palabras 1 y 3 semejantes
					if (caracter1 != caracter2 && caracter1 == caracter3 && caracter2 != caracter3) {
						for (contador2 = 1; contador2 <= palabraIngresada1.length(); contador2++) {
							// Operamos para probar con los demas caracteres de la palabra
							operadorC1 = palabraIngresada1.charAt(contador2);
							operadorC3 = palabraIngresada3.charAt(contador2);
							// Para que la condicion finalice, una vez se encuentre las letras diferentes.
							if (operadorC1 != operadorC3) {
								contador2 = palabraIngresada1.length();
							}
							// Impresion de resultados
							if (operadorC1 < operadorC3) {// operadorC1 < operadorC3
								if (caracter1 < caracter2) {
									System.out.println("El orden es: " + palabraIngresada1 + " " + palabraIngresada3
											+ " " + palabraIngresada2);
								} else {
									System.out.println("El orden es: " + palabraIngresada2 + " " + palabraIngresada1
											+ " " + palabraIngresada3);
								}
							} else {// operadorC3 < operadorC1
								if (caracter3 < caracter2 && operadorC3 < operadorC1) {
									System.out.println("El orden es: " + palabraIngresada3 + " " + palabraIngresada1
											+ " " + palabraIngresada2);
								} else {
									if (operadorC3 < operadorC1) {
										System.out.println("El orden es: " + palabraIngresada2 + " " + palabraIngresada3
												+ " " + palabraIngresada1);
									}
								}
							}
						}
					}
					// Para palabras 2 y 3 semejantes
					if (caracter1 != caracter2 && caracter1 != caracter3 && caracter2 == caracter3) {
						for (contador2 = 1; contador2 <= palabraIngresada2.length(); contador2++) {
							// Operamos para probar con los demas caracteres de la palabra
							operadorC2 = palabraIngresada2.charAt(contador2);
							operadorC3 = palabraIngresada3.charAt(contador2);
							// Para que la condicion finalice, una vez se encuentre las letras diferentes.
							if (operadorC2 != operadorC3) {
								contador2 = palabraIngresada2.length();
							}
							// Impresion de resultados
							if (operadorC2 < operadorC3) {// operadorC2 < operadorC3
								if (caracter2 < caracter1) {
									System.out.println("El orden es: " + palabraIngresada2 + " " + palabraIngresada3
											+ " " + palabraIngresada1);
								} else {
									System.out.println("El orden es: " + palabraIngresada1 + " " + palabraIngresada2
											+ " " + palabraIngresada3);
								}
							} else {// operadorC3 < operadorC2
								if (caracter3 < caracter1 && operadorC3 < operadorC2) {
									System.out.println("El orden es: " + palabraIngresada3 + " " + palabraIngresada2
											+ " " + palabraIngresada1);
								} else {
									if (operadorC3 < operadorC2) {
										System.out.println("El orden es: " + palabraIngresada1 + " " + palabraIngresada3
												+ " " + palabraIngresada2);
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
