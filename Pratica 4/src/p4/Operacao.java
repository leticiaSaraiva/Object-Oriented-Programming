package p4;

public class Operacao {
	private String descricao;
	private float valor;
	private float saldoParcial;
	
	public Operacao(String desc, float val, float saldo) {
		descricao = desc;
		valor = val;
		saldoParcial = saldo;
	}
	public String toString(){
		return descricao + " " + valor + " " + saldoParcial + "\n";
	}
}