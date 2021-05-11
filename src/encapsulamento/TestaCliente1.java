package encapsulamento;
//1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto cliente, 
//defina as instancias deste objeto e apresente as informações deste objeto no console.

public class TestaCliente1 {

	public static void main(String[] args) {
		
		ClasseCliente1 Cliente = new ClasseCliente1();
		
		Cliente.setNome("Joel");
		Cliente.setCPF(244910858);
		Cliente.setpagamento("Débito");
		
		System.out.println("Nome: " + Cliente.getNome());
		System.out.println("CPF: " + Cliente.getCPF());
		System.out.println("Foma de pagamento: " + Cliente.getpagamento());

	}

}
