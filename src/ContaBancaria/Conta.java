package ContaBancaria;

public class Conta {
	public static void main(String[] args) {
		
		ContaB Conta = new ContaB();
		
		Conta.setNome("Carlos");
		Conta.setBanco("Ita�");
		Conta.setNumeroConta(323768907);
		Conta.setSaldo(9000);
		
		System.out.println("Nome: " + Conta.getNome());
		System.out.println("Banco: " + Conta.getBanco());
		System.out.println("N�mero de Conta: " + Conta.getNumeroConta());
		System.out.println("Saldo em Reais: " + Conta.getSaldo());
	}

}
