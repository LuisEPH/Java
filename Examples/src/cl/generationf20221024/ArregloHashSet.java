package cl.generationf20221024;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ArregloHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashSet<TIPODATO> nombre_array = new HashSet<TIPODATO>();
		/*HashSet<String> Integrantes = new HashSet <String>();
		Integrantes.add("Daniel");//Agregar
		Integrantes.add("Cynthia");
		Integrantes.add("Kiara");
		Integrantes.add("Pablo");
		System.out.println(Integrantes);
		boolean verificacionName = Integrantes.contains("Cynthia");//Verificacion
		System.out.println("Existe ? "+verificacionName);
		Integrantes.remove("Pablo");
		System.out.println(Integrantes);
		System.out.println(Integrantes.size());
				//Hasmap , Hash
				//como recorrer un arreglo con while y con iterator (set y dinamico listo)*/
		
		
		//While 1
		HashMap<Integer,String> TakeFive = new HashMap<Integer, String>();
        int i=0;
		while(i<5) {
        	TakeFive.put(i+1,"Integrante ");
        	i+=1;
        	//System.out.println(TakeFive);
        }
		//System.out.println(TakeFive);
		//System.out.println(TakeFive.entrySet());
		
		//Ej 2
		for (Entry<Integer, String> set: TakeFive.entrySet()) {
	           System.out.println(set.getKey() + " = " + set.getValue());
		}
		
		//Declaracion y push de datos
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(21, "Kiara");
        hmap.put(30, "Cynthia");
        hmap.put(28, "Daniel");
        hmap.put(29, "Pablo");
        hmap.put(20, "Luis");
		
        //While con itinerator
        
        //Devuelve el siguiente elemento en una iteracción.itinerator.next();
        //objeto que permite al programador recorrer un arreglo
        Iterator iterator = hmap.entrySet().iterator();
        while (iterator.hasNext()) {//Método que devuelve true si existe un siguiente elemento a la hora de iterar sobre una colección.
             Map.Entry me2 = (Map.Entry) iterator.next();//The Map.entrySet method returns a collection-view of the map
          System.out.println("Nombre: "+me2.getKey() + " & Edad: " + me2.getValue());
        }
	}
	//Interfaz de mapa
	//No permite llaves duplicadas
}
