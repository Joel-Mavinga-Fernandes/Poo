package patinete;
//Crie uma classe patinete e apresente os atributos e m�todos referentes esta classe, em seguida crie um objeto patinete, 
//defina as instancias deste objeto e apresente as informa��es deste objeto no console.
public class patinete {

	public static void main(String[] args) {
	
		ClassePatinete patinete = new ClassePatinete();
		
		patinete.setNome("Patinete");
		patinete.setMarca("Monster");
		patinete.setPreco(500);
		
		System.out.println("Nome: " + patinete.getNome());
		System.out.println("Marca: " + patinete.getMarca());
		System.out.println("Pre�o em Reais: " + patinete.getPreco());
		
	}

}
