package Questao1;

public class Tecnico extends Funcionario{
	
	double bonusSalarial;
	
	public Tecnico(String nome, 
			int matricula,
			String cpf, 
			double salario, 
			int jornadaDeTrabalho, 
			int tempoDeTrabalho){
		
		super(nome, matricula, cpf, salario, jornadaDeTrabalho, tempoDeTrabalho);
		bonusSalarial = 150.00;
	}
	
	public double exibeSalario() {
		return getSalario() + bonusSalarial;
	}
}
