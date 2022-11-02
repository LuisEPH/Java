package cl.generationf20221024;

import java.util.Arrays;

public class Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Funciones o metodos
				// Static es un accesador
				// Siempre después de definir el método con los public, recuerda llamarlo aquí arriba.
				
				nombreMetodo();
				metodo2("Juan");   // Cada vez que llamamos al método 2 debemos indicarle un String
				metodo2("Perez");
				metodo3(380);
				metodo4(12, 3.14f);
				String[] metodo5 = {"a","e","i","o","u"};  // Necesario indicar antes de llamarlo para poder imprimirlo.
				metodo5(metodo5);
				// metodos con llamados o return
				System.out.println(retorno1());
				Integer valorRetornado = retorno1();
				System.out.println(valorRetornado/7); // 35/7 = 5
				System.out.println(valorRetornado/5);// 35/5 = 7
				String nombreCompleto = obtenerNombreCompleto("Daniel", "Alvarado", "Moya");
				System.out.println("El nombre completo es: " + nombreCompleto);
				// Aprender a usar Swagger (Documentación para enlazar API)
				llamadaAOtroMetodo();
			}
			// Definicion o estructura de un método
			// void = El metodo no retornará ningun valor
			
			public static void nombreMetodo() {
				System.out.println("Hola mundo");
			}
			
			public static void metodo2(String nombre) {    // Parámetro es = variable + tipo de variable
				System.out.println("Soy " + nombre);
			}
			
			public static void metodo3(Integer numero) {
				System.out.println("Soy el numero  " + numero);
			}
			
			public static void metodo4(Integer numero1, Float numero2) {
				System.out.println("Soy el numero int  " + numero1);
				System.out.println("Soy el numero float " + numero2);
			}
			
			public static void metodo5(String[] arreglito) {
				System.out.println("Soy el arreglo  " + Arrays.toString(arreglito));
				
			}
			
			// Funciones con retorno  
			// cambiamos void por el tipo de dato que quieres retornar
			// retornar es =  resultado
			
			public static int retorno1() {
				Integer totalAlumnos = 35;
				return totalAlumnos;
				
			}
			/* Metodo que une todos los datos
			 * @param nombre 
			 * @param apeMaterno
			 * @param apePaterno
			 * @return nombreCompleto;
			 */
			
			public static String obtenerNombreCompleto(String nombre, String apePaterno, String apeMaterno){
				String nombreCompleto = nombre+" "+apeMaterno+" "+apePaterno;
				return nombreCompleto;  // Retornamos el contenido de la variable
			}
			// metodo que une todos los datos
			
			public static void llamadaAOtroMetodo() {
				System.out.println("llamada a otro metodo desde un metodo");
				metodo4(1234,3f);
				
			}
			

	}

