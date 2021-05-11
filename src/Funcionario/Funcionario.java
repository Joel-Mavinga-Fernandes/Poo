package Funcionario;
//Crie uma classe funcionário e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto funcionário, 
//defina as instancias deste objeto e apresente as informações deste objeto no console.

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
