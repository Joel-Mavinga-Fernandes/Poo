package Paciente1;

import java.util.Scanner;

public class paciente {
	
	private String nome;
	private int idade;
	private String genero;
	
	public paciente(String nome, int idade, String genero) {
		this.nome = nome;
		this.idade = idade;
		this.genero  = genero;
	}

	public String getnome() {
		return nome;
	}

	public void setnome(String nome) {
		this.nome = nome;
	}

	public int getidade() {
		return idade;
	}

	public void setidade(int idade) {
		this.idade = idade;
	}

	public String getgenero() {
		return genero;
	}

	public void setgenero(String genero) {
		this.genero = genero;
	}
	
	public void cadastrarpaciente() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o nome do paciente: ");
		setnome(input.nextLine());
		
		System.out.println("Digite a idade do paciente: ");
		setidade(input.nextInt());
		
		System.out.println("Digite o genero do paciente: ");
		setgenero(input.next());	
		
		dadosPaciente();
	}
	
	public void dadosPaciente() {
		
		System.out.println("O nome do paciente é: " + nome);
		System.out.println("A idade do paciente é: " + idade);
		System.out.println("O genero do paciente é: " + genero);

	}
	
	

}
