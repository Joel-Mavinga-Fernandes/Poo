package Clientes;

public class Cliente {
	
	private String nome;
	private int salario;
	private int id;
	
	public Cliente(String nome, int salario, int id) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", salario=" + salario + ", id=" + id + "]";
	}
	
	
	
	
	
	

}
