package encapsulamento;
//Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe, em seguida crie um objeto avi�o, 
//defina as instancias deste objeto e apresente as informa��es deste objeto no console.

public class TestaAviao {

	public static void main(String[] args) {
		
		ClasseAviao Aviao = new ClasseAviao();
		
		Aviao.setModelo("Boeing777");
		Aviao.setCor("Branca");
		Aviao.setAnoDeFabrico(1993);
		Aviao.setTipoDeVoos("Longos");
		Aviao.setCapacidadeMaxima(301);
		
		System.out.println("Modelo: " + Aviao.getModelo());
		System.out.println("Cor: " + Aviao.getCor());
		System.out.println("Ano de Fabrico: " + Aviao.getAnoDeFabrico());
		System.out.println("Capacidade M�xima: " + Aviao.getCapacidadeMaxima());
		
	}

}
