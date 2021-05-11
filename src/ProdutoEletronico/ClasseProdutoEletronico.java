package ProdutoEletronico;
//Crie uma classe produto eletrônico e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto produto eletrônico, 
//defina as instancias deste objeto e apresente as informações deste objeto no console.

public class ClasseProdutoEletronico {
	
	private String Dispositivo;
	private String Marca;
	private String Modelo;
	private String Cor;
	private int Capacidade;
	private int Processador;
	private int AnoDeLancamento;
	
	public String getDispositivo() {
		return Dispositivo;
	}
	public void setDispositivo(String dispositivo) {
		Dispositivo = dispositivo;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public String getCor() {
		return Cor;
	}
	public void setCor(String cor) {
		Cor = cor;
	}
	public int getCapacidade() {
		return Capacidade;
	}
	public void setCapacidade(int capacidade) {
		Capacidade = capacidade;
	}
	public int getProcessador() {
		return Processador;
	}
	public void setProcessador(int processador) {
		Processador = processador;
	}
	public int getAnoDeLancamento() {
		return AnoDeLancamento;
	}
	public void setAnoDeLancamento(int anoDeLancamento) {
		AnoDeLancamento = anoDeLancamento;
	}
	
	

}
