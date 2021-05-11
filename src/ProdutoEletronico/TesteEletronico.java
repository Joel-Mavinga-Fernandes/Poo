package ProdutoEletronico;
//Crie uma classe produto eletrônico e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto produto eletrônico, 
//defina as instancias deste objeto e apresente as informações deste objeto no console.

public class TesteEletronico {
public static void main(String[] args) {
	

	ClasseProdutoEletronico Eletronico = new ClasseProdutoEletronico();
	
	Eletronico.setDispositivo("Telemóvel");
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