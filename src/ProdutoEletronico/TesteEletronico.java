package ProdutoEletronico;
//Crie uma classe produto eletr�nico e apresente os atributos e m�todos referentes esta classe, em seguida crie um objeto produto eletr�nico, 
//defina as instancias deste objeto e apresente as informa��es deste objeto no console.

public class TesteEletronico {
public static void main(String[] args) {
	

	ClasseProdutoEletronico Eletronico = new ClasseProdutoEletronico();
	
	Eletronico.setDispositivo("Telem�vel");
	Eletronico.setMarca("Iphone");
	Eletronico.setModelo("Iphone 12 Pro Max");
	Eletronico.setCor("preta");
	Eletronico.setCapacidade(512);
	Eletronico.setAnoDeLancamento(2020);
	
	System.out.println("Disposistivo: " + Eletronico.getDispositivo());
	System.out.println("Maca: " + Eletronico.getMarca());
	System.out.println("Modelo: " + Eletronico.getModelo());
	System.out.println("Cor: " + Eletronico.getCor());
	System.out.println("Capacidade: " + Eletronico.getCapacidade());
	System.out.println("AnoDeLancamento: " + Eletronico.getAnoDeLancamento());
}
}