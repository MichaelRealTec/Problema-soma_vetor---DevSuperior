package application;

import java.util.Locale;
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		// Problema_Alturas
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numPessoas = 0, menor16 = 0;
		double alturaMedia = 0;
		
		
		System.out.print("Quantas pessoas serao digitadas?");
		numPessoas = sc.nextInt();
		
		String[] vectName = new String[numPessoas];
		int[] vectIdade = new int[numPessoas];
		double[] vectDouble = new double[numPessoas];
		
		sc.nextLine();
		for(int i = 0; i < numPessoas; i++) {
			//
			System.out.printf("Dados da %da pessoa: \n", i+1);
			System.out.print("Nome: ");
			vectName[i] = sc.next();
			System.out.print("Idade: ");
			vectIdade[i] = sc.nextInt();
			System.out.print("Altura: ");
			vectDouble[i] = sc.nextDouble();
			alturaMedia += vectDouble[i];
			if(vectIdade[i] < 16) {
				menor16++;
			}
		}
		
		double percentualMenores = ((double)menor16 / numPessoas) * 100.00 ;
		System.out.println();
		System.out.printf("Altura média: %.2f\n",alturaMedia / numPessoas);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);
		
		for (int i = 0; i < numPessoas; i++) {
			if(vectIdade[i] < 16) {
				System.out.println(vectName[i]);	
			}
		}
		sc.close();
	}

}
