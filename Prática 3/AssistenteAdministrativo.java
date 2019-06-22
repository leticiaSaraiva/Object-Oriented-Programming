package Questao1;

public class AssistenteAdministrativo extends Funcionario{
	
	char turno;
	
	public AssistenteAdministrativo(String nome, 
			int matricula,
			String cpf, 
			double salario, 
			int jornadaDeTrabalho, 
			int tempoDeTrabalho){
		
		super(nome, matricula, cpf, salario, jornadaDeTrabalho, tempoDeTrabalho);
		turno = 'n';
	}
	
	public double exibeSalario() {
		if(turno == 'n'){
			double adicionalNoturno = 200.00;
			return getSalario() + adicionalNoturno;
		}else{
			return getSalario();
		}
		
	}
}
