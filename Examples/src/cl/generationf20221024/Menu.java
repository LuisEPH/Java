package cl.generationf20221024;

import java.util.Scanner;

public class Menu {

		public static void main(String[] args) {

			// Menu de opciones
			// terminar la ejecución
			// ofrecer opciones de repeticion (bucles)
			//menu();
			Menu2();
			// Calculadora con 4 operaciones basicas
			// solicitar y capturar 2 numeros float
			// imprimir resultados y guardar en una variable

			// definir los metodos
			// validaciones

			// limpiar las variables

		}

		/*public static void menu() {
			System.out.println("********************");
			System.out.println("*       MENU       *");
			System.out.println("********************");
			System.out.println("*1.-   SUMAR       *");
			System.out.println("*2.-   RESTAR      *");
			System.out.println("*3.-   MULTIPLICAR *");
			System.out.println("*4.-   DIVIDIR     *");
			System.out.println("*0.-   SALIR       *");
			System.out.println("********************");

			Scanner sc = new Scanner(System.in);
			int opciones = 0;
			int contadorErrores = 4;

			do {
				System.out.println("* Seleccione una opción *");
				opciones = sc.nextInt();

				// si la opcion es cero, salir del do-while
				if (opciones == 0) {
					System.out.println("Usted a salido del programa");
					break;
				}

				if (opciones < 0 || opciones > 4) {// condicion de error
					contadorErrores--;
					System.out.println("Te quedan " + contadorErrores + " intentos");
				}
				if (contadorErrores == 0) {
					System.out.println("Agoto la cantidad de intentos, chaolin!!");
					break;
				}

			} while (opciones < 0 || opciones > 4);

			if (opciones == 0 || contadorErrores == 0) {
				System.out.println("Adios!!");
			} else {// solo ingresará para opciones 1,2,3,4
				// solicitar 2 numeros
				System.out.println("Ingresa el primer numero");
				float numero1 = sc.nextFloat();
				System.out.println("Ingresa el segundo numero");
				float numero2 = sc.nextFloat();

				float resultado = 0;

				switch (opciones) {
				case 1:// SUMAR
					resultado = numero1 + numero2;
					System.out.println("El resultado es " + resultado);
					break;
				case 2:
					resultado = numero1 - numero2;
					System.out.println("El resultado es " + resultado);
					break;
				case 3:
					resultado = numero1 * numero2;
					System.out.println("El resultado es " + resultado);
					break;
				case 4:
					if (numero2 == 0) {
						System.out.println("NO SE PUEDE DIVIDIR POR CERO");
					} else {
						resultado = numero1 / numero2;
						System.out.println("El resultado es " + resultado);
					}
					break;

				default:
					System.out.println("Opción no valida");
					break;
				}

			}
		}*/

//Un programa que realice el caluculo de areas y perimetros de triangulos ,rectangulos y circunferencias //Libreria math
	public static void Menu2() {
		System.out.println("*****     MENU DE CALCULO DE PERIMETROS Y AREAS    *****");
		
		System.out.println("\n1.Triangulo");
		
		System.out.println("2.Rectangulos");
		
		System.out.println("3.Circunferencias\n");
		
		System.out.println("Indique opcion: ");
		
		Scanner scan = new Scanner(System.in);
		
		int op=scan.nextInt();
		float lado,lado2,lado3;
		float area=0;
		float perimetro=0;
		float altura,base;
		
		if(op!=0) {
			
			switch (op) {
			
			case 1:// Triangulo
				
				System.out.println("\nIndique Lado 1");
				lado=scan.nextFloat();
				
				System.out.println("\nIndique Lado 2");
				lado2=scan.nextFloat();
				
				System.out.println("\nIndique Lado 3");
				lado3=scan.nextFloat();
				
				perimetro= lado + lado2 + lado3;
				System.out.println("\nIndique Altura");
				
				altura=scan.nextFloat();
				System.out.println("\nIndique Base");
				
				base=scan.nextFloat();
				area=(float) (0.5 * base * altura);
				
				System.out.println("\nEl resultado es del perimetro es " + perimetro);
				System.out.println("El resultado es del perimetro es " + area);
				
				break;
				
			case 2://Rectangulo
				
				System.out.println("\nIndique Base: ");
				base=scan.nextFloat();
				
				System.out.println("\nIndique Altura: ");
				altura=scan.nextFloat();
				
				area=base*altura;
				perimetro= base*2 + altura*2;
				
				System.out.println("\nEl resultado es del perimetro es " + perimetro);
				System.out.println("El resultado es del area es " + area);

				break;
				
			case 3://Circunferencia
				
				System.out.println("\nIndique Radio: ");
				float radio=scan.nextFloat();
				
				perimetro=(float) (2*Math.PI * radio);
				area=(float) (Math.PI*Math.pow(radio, 2));
				
				System.out.println("\nEl resultado es del perimetro es " + perimetro);
				System.out.println("El resultado es del area es " + area);;
				
				break;
			
			default:
				
				System.out.println("\nOpción no valida, termino el programa.");
				
				break;
			}
			
		}
	
	}
}
		
