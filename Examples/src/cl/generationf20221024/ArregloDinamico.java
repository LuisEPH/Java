package cl.generationf20221024;

import java.util.ArrayList;

public class ArregloDinamico {

	public static void main(String[] args) {//array static with for
		// TODO Auto-generated method stub //arreglos Estatico lenght        arreglos dinamicos size  
		ArrayList<String> TakeFive = new ArrayList<String>();
		TakeFive.add("Daniel");//Agregar
		TakeFive.add("Cynthia");
		TakeFive.add("Kiara");
		TakeFive.add("Pablo");
		//System.out.println(TakeFive);
		System.out.println(TakeFive.size());//Tamaño
		System.out.println(TakeFive.get(3));//Obtiene el ultimo dato del array
		System.out.println(TakeFive.remove(0));//Eliminar
		//System.out.println(TakeFive);
		for(int i = 0; i<TakeFive.size();i++){
			System.out.println("Integrantes: "+TakeFive.get(i));
		}

		for(String relator: TakeFive ){
			System.out.println(relator);
		}
	}

}
