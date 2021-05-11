package encapsulamento;
//1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto cliente, 
//defina as instancias deste objeto e apresente as informações deste objeto no console.

public class ClasseCliente1 {
	
	private String nome;
	private int CPF;
	private String pagamento;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int cPF) {
		CPF = cPF;
	}
	public String getpagamento() {
		return pagamento;
	}
	public void setpagamento(String pagamento) {
		this.pagamento = pagamento;
	}
	

}
