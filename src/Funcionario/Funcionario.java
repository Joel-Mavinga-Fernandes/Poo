package Funcionario;
//Crie uma classe funcion�rio e apresente os atributos e m�todos referentes esta classe, em seguida crie um objeto funcion�rio, 
//defina as instancias deste objeto e apresente as informa��es deste objeto no console.

public class Funcionario {
public static void main(String[] args) {
	
	ClasseFuncionario Funcionario = new ClasseFuncionario();
	
	Funcionario.setNome("Paulo");
	Funcionario.setIdade(23);
	Funcionario.setCargo("Dev Jr.");
	Funcionario.setEmpresa("McKinsey");
	
	System.out.println("Nome: " + Funcionario.getNome());
	System.out.println("Idade: " + Funcionario.getIdade());
	System.out.println("Cargo: " + Funcionario.getCargo());
	System.out.println("Empresa: " + Funcionario.getEmpresa());
	
}
}
