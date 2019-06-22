package p4;

import java.util.ArrayList;

public class Cliente {
	private String idCliente;
	private ArrayList<Conta> contas = new ArrayList<Conta>();
	
	public Cliente(String idClient) {
		setIdCliente(idClient);
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public ArrayList<Conta> getContas() {
		return contas;
	}

	public void setContas(ArrayList<Conta> contas) {
		this.contas = contas;
	}
	
	public boolean addConta(Conta conta) {
		if(conta == null) {
			return false;
		}else {
			contas.add(conta);
			return true;
		}
	}
	
	public boolean encerrarConta(int numero) {
		for (Conta cont : contas) {
			if (cont.getNumero() == numero) {
				contas.remove(cont);
				return true;
			}
		}
		return false;
	}
}