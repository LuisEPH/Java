package cl.generationf20221028;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Estudiante estudiante1 = new Estudiante("Luis", null, 0, null, null, null);
		System.out.println(estudiante1.toString());
		estudiante1.setEdad(20);
		System.out.println(estudiante1.toString());*/
		// instanciar a Estudiante
				/*Estudiante estudiante = new Estudiante("Mijail","Loren","27868123-4");
				System.out.println(estudiante.toString());
				estudiante.setEdad(3);
				estudiante.setCorreo("m@m.cl");
				estudiante.setCurso("1A");
				System.out.println(estudiante.toString());*/
				
		Scanner sc = new Scanner(System.in);
		//arrelo de estudiantes
		ArrayList<Estudiante> estudiantes= new ArrayList<Estudiante>();
		//String nombre= "";
				
		int continuar=2;
		do {
					
			System.out.println("Ingrese el nombre del estudiante");
			String nombre = sc.nextLine();// israel alexis
			System.out.println("Ingrese el apellido del estudiante");
			String apellido = sc.nextLine();
			//instancia al objeto estudiante 
			//Estudiante estudiante = new Estudiante(nombre,apellido);
			Estudiante estudiante = new Estudiante();
			estudiante.setNombre(nombre);
			estudiante.setApellido(apellido);
					
			estudiantes.add(estudiante);
					
					
			System.out.println("Quiere agregar otro estudiante");
			System.out.println("(1)SI  (2)NO");
			continuar= sc.nextInt();
			sc.nextLine();//corrige el error de capturar un numero y despues solicitar un string
					
		} while (continuar==1);
		
			/*for (type variableName : arrayName) {
			  // code block to be executed
			}*/
			for (Estudiante estudiante : estudiantes) {
					//System.out.println("Nombre: "+estudiante.getNombre());
					//System.out.println("Apellido: "+estudiante.getApellido());
					//System.out.println("Estudiante: "+estudiantes.get(0));//Solo imprime la posicion 0 del arreglo
					//System.out.println("Estudiante: "+estudiantes.get(1));//Solo la posicion 1
					
				}
				
			}	
}

//get(0) = obtener dato de la posicion 0
//for(Estudiante estudiante : estudiantes)
//tipo de dato variable : 