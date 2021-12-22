package student;

import java.util.Scanner;

public class Student {
	
	public String nome;
	
	public void calcNotaFinal() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do aluno");
		nome = sc.nextLine();
		
		System.out.println("Digite as 3 notas do aluno");
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		
		double soma = n1 + n2 + n3;
		
		if(soma >= 60) {
			System.out.println("FINAL GRADE = "+ soma);
			System.out.println("PASS");
		}else {
			System.out.println("FINAL GRADE = "+ soma);
			System.out.println("FAILED");
			double falta = 60 - soma;
			System.out.println("MISSING "+ falta + "POINTS");
			
		}
	}

}
