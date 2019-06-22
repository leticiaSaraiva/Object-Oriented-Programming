package p4;

import java.util.ArrayList;

public class Conta {
	private float saldo;
	private int numero;
	private ArrayList<Operacao> extrato = new ArrayList<Operacao>();
	private boolean ativa;
	
	public Conta(int Nconta) {
		setNumero(Nconta);
		setAtiva(true);
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public float getSaldo() {
		return numero;
	}
	
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	public boolean getAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}	
	
	public ArrayList<Operacao> getExtrato(){
		return extrato;
	}
	
	public String toString() {
		return "Número da conta: " + Integer.toString(numero);
	}
	
	public boolean depositar(float valor) {
		Operacao op;
		if(valor <= 0) {
			return false;
		}else {
			saldo += valor;
			op = new Operacao("deposito", valor, saldo);
			extrato.add(op);
			return true;
		}
	}
	public boolean sacar(float valor) {
		Operacao op1;
		if(valor > saldo) {
			return false;
		}else {
			saldo -= valor;
			op1 = new Operacao("saque", valor, saldo);
			extrato.add(op1);
			return true;
		}
	}
	
	public boolean transferir(Conta conta, float valor) {
		Operacao op1;
		if(valor < saldo) {
			return false;
		}else {
			saldo -= valor;
			op1 = new Operacao("transferência", valor, saldo);
			extrato.add(op1);
			return true;
		}
	}
	
	public void encerrar() {
		setAtiva(false);
		System.out.println("Conta " + getNumero() + " encerrada!");
	}
	
	
}