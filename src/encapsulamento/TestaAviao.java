package encapsulamento;
//Crie uma classe avião e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto avião, 
//defina as instancias deste objeto e apresente as informações deste objeto no console.

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
		System.out.println("Capacidade Máxima: " + Aviao.getCapacidadeMaxima());
		
	}

}
