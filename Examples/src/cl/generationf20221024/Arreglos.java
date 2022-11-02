package cl.generationf20221024;

import java.util.Arrays;
import java.util.Scanner;

public class Arreglos {


	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] arreglo = new int [3];
		arreglo[0]=4;
		System.out.println(arreglo);
		System.out.println(arreglo.toString());
		System.out.println(Arrays.toString(arreglo));
		System.out.println(arreglo[0]);
		
		int [] sinNum = {};
		System.out.println(sinNum.length);
		
		String [] vocales = {"a","e","i","o","u"};
		System.out.println(vocales.length);
		
		//Crear array de numeros de tamaño 6
		float[] array = new float [6];
		
		//Crear arreglo de enteros tamaño 100 y agregar valores dinamicamente.
		int [] array2 = new int [100];
		int [] array3 = new int [100];
		for(int i=0;i<100;i++) {
			array2[i]= i;
			//System.out.println(Arrays.toString(array2));
		}
		/*for(int j=100;j>0;j++) {
			array3[j]= j;
		}*/
		
		/*int[] arreglo100a1 = new int[100];
		//{100,99,98,97...0}
		for(int i =arreglo100a1.length; i>0  ;i-- ) {
			arreglo100a1[arreglo100a1.length - i]= i;
			//System.out.println(arreglo100a1);
		}*/
		
		//1.Escribir un arreglo de tamaño de 10 ,con números positivos y negativos , capturar en máximo y mínimo
		int[] ejercicio = {-3,-5, 4,12, 3,35, -35,77,-1, 0};
		int mayor=0;
		int menor=0;
		 for(int conta=0;conta < ejercicio.length;conta++) {
			 if(ejercicio[conta] > mayor) {
				 mayor = ejercicio[conta];
			 }
			 else if(ejercicio[conta] < menor){
				 menor = ejercicio[conta];
			 }
		
		 }
		 System.out.println(mayor);
		 System.out.println(menor); 
		 
		 
		 //2. El mismo arreglo crear otros 2 arreglos, uno con solo los pares y otro arreglo solo con los impares
		 float[] par = new float [ejercicio.length];
		 float[] impar = new float [ejercicio.length];
		 for(int i=0;ejercicio.length > i ; i++) {
			 if(ejercicio[i]%2==0) {
				 par[i]=ejercicio[i];
			 }
		 	else {
		 		impar[i]=ejercicio[i];
		 	}
		 }
		 System.out.println(Arrays.toString(par));
		 System.out.println(Arrays.toString(impar));
		 
		 //3. Para el mismo arreglo, sacar el promedio de los números.
		 float[] ejercicio3 = {3,5, -4,-12, -3,-35, 35,-77,1, 111};
		 float prom=0,sum=0;
		 for(int i=0;ejercicio3.length > i;i++) {
			 sum+=ejercicio3[i];
		 }
		 prom=sum/10;
		 System.out.println(prom); 
	}
	
	/*
	 float [] a = {-3,-5, 4,12, 3,35, -35,77,-1, 0};
		 float [] b = {1,-2,3,-5,6,7,-8,9,10};
		 float [] c = {};
		 float[] par = new float [a.length];
		 float[] impar = new float [b.length];
		 int j=0;
		 for(int k=0;k<10;k++){
			 c[j] = a[k];
			 j++;
			 c[j] = b[k];
			 j++;
		 }
		 for(int i=0;i<10;i++){
			if(c[i]%2==0){
				par[i] = c[i];
			}
			else {
				impar[i] = c[i];
			}
		 }
		 System.out.println(Arrays.toString(a));
		 System.out.println(Arrays.toString(b)); */
}
