package Clientes;


import java.util.ArrayList;
import java.util.List;

public class Cliente_Add_Remover_Mostrar_Procurar {

	
	public List<Cliente> listaClientes = new ArrayList<>();
	
	public void addCliente(Cliente cliente) {
		
		listaClientes.add(cliente);
		
	}
	
	public void removerClienteId(int id) {
		
		for(Cliente cliente: listaClientes) {
			
			if(cliente.getId() == id) {
				listaClientes.remove(cliente);	
			}else {
				System.out.println("Id inválido");
			}	
			}
		mostrarListaClientes();
	}
		
	public void mostrarListaClientes(){
		
		for(Cliente cliente: listaClientes) {
			System.out.println(cliente.getId() + "-" + cliente.getNome() + "-" + cliente.getSalario());
		}
	}
	
	public void procurarClientePeloNome(String nome) {
		
		for (Cliente cliente: listaClientes) {
		
			
			if (cliente.getNome().equals(nome)) {
				
				System.out.println("Encontre as informações do " + cliente.getNome());
				
				System.out.println(cliente.getId() + " " + cliente.getSalario());
			
			}	
			}
		
	}
}
		

//	System.out.println("Encontre as informações do " + cliente.getNome());
//	System.out.println(cliente.getId() + " " + cliente.getSalario());
		
		
	
	


