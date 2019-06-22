package Questao1;

public class Gerente extends Funcionario{
	
	public Gerente(String nome, 
			int matricula,
			String cpf, 
			double salario, 
			int jornadaDeTrabalho, 
			int tempoDeTrabalho){
		
		super(nome, matricula, cpf, salario, jornadaDeTrabalho, tempoDeTrabalho);
	}
	
	public void gerencia(){
		System.out.println("Metodo Gerencia - Gerente");
	}
	
	public void trabalha(){
		System.out.println("Metodo Trabalha - Gerente");
	}
	
	public double exibeSalario() {
		return getSalario();
	}
}
