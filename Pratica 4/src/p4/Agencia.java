package p4;

import java.util.ArrayList;

public class Agencia {
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private int x=1;
	
	public boolean addCliente(String CPF) {
		for (Cliente i : clientes)
			if (i.getIdCliente().equals(CPF))
				return false;

		clientes.add(new Cliente(CPF));
		return true;
	}
	
	public boolean abrirNovaConta(String CPF) {
	
		if(CPF == "") {
			return false;
		}else {
			for(Cliente i : clientes) {
				if (i.getIdCliente().equals(CPF)) {
					i.addConta(new Conta(x));
					x++;
					return true;
				}
			}
			return false;
		}
	}
	
	public ArrayList<Cliente> getClientes() {
		return clientes;
	} 
}