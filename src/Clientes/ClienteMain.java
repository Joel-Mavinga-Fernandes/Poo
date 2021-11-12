package Clientes;

import java.util.ArrayList;
import java.util.List;

public class ClienteMain {

	public static void main(String[] args) {
		
		
		Cliente_Add_Remover_Mostrar_Procurar cliente = new Cliente_Add_Remover_Mostrar_Procurar();
		
		
		
		Cliente cliente1 = new Cliente ("Jay", 1000, 1);
		cliente.addCliente(cliente1);
		
		Cliente cliente2 = new Cliente ("Paulo", 2000, 2);
		cliente.addCliente(cliente2);
		
		Cliente cliente3 = new Cliente ("Rosa", 2500, 3);
		cliente.addCliente(cliente3);
		
		Cliente cliente4 = new Cliente ("Júlia", 3000, 2);
		cliente.addCliente(cliente4);
		
		//cliente.removerClienteId(1);
		
//		cliente.mostrarListaClientes();
		
		cliente.procurarClientePeloNome("Rosa");
		
		

	}

}
