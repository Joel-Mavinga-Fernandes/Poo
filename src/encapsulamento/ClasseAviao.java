package encapsulamento;
//Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe, em seguida crie um objeto avi�o, 
//defina as instancias deste objeto e apresente as informa��es deste objeto no console.

public class ClasseAviao {
	
	private String Modelo;
	private String cor;
	private int AnoDeFabrico;
	private String TipoDeVoos;
	private int CapacidadeMaxima;
	
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAnoDeFabrico() {
		return AnoDeFabrico;
	}
	public void setAnoDeFabrico(int anoDeFabrico) {
		AnoDeFabrico = anoDeFabrico;
	}
	public String getTipoDeVoos() {
		return TipoDeVoos;
	}
	public void setTipoDeVoos(String tipoDeVoos) {
		TipoDeVoos = tipoDeVoos;
	}
	public int getCapacidadeMaxima() {
		return CapacidadeMaxima;
	}
	public void setCapacidadeMaxima(int capacidadeMaxima) {
		CapacidadeMaxima = capacidadeMaxima;
	}
}
