package Principal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Se creará una lista de 6 números.");
		ArrayList<Integer>Numeros;
		Numeros = new ArrayList<Integer>();
		for(int i=0; i<6; i++) {
			System.out.println("Ingrese un número:");
			Integer n = scan.nextInt();
			Numeros.add(n);
		}
		
		for(int i=0; i<Numeros.size(); i++) {
			System.out.print(Numeros.get(i) + " ");
		}
		System.out.println("\nIngrese el número de la suma:");
		Integer resultado = scan.nextInt();
		 suma_recursiva(Numeros,resultado,new ArrayList<Integer>());
	}
	
	private static void suma_recursiva(ArrayList<Integer> numeros, int resultado, ArrayList<Integer> arrayList) {
		int suma = 0;
		for(int e: arrayList) {
			suma += e;
		}
		if(suma == resultado) {
			System.out.println("sum("+Arrays.toString(arrayList.toArray())+")="+resultado);
		}
		if(suma >= resultado) {
			return;
		}
		for(int i=0; i<numeros.size();i++) {
			 ArrayList<Integer> otro = new ArrayList<Integer>();
             int n = numeros.get(i);
             for (int j=i+1; j<numeros.size();j++) otro.add(numeros.get(j));
             ArrayList<Integer> partial_rec = new ArrayList<Integer>(arrayList);
             partial_rec.add(n);
             suma_recursiva(otro,resultado,partial_rec);
		}
		
	}

}
