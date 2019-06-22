package Questao1;

public class Funcionario {
	
	private String nome;
	private int matricula;
	private String cpf;
	private double salario;
	private int jornadaDeTrabalho;
	private int tempoDeTrabalho;
	
	public Funcionario(String nome, 
			int matricula, 
			String cpf, 
			double salario, 
			int jornadaDeTrabalho, 
			int tempoDeTrabalho){
		
		this.setNome(nome);
		this.setMatricula(matricula);
		this.setCpf(cpf);
		this.setSalario(salario);
		this.setJornadaDeTrabalho(jornadaDeTrabalho);
		this.setTempoDeTrabalho(tempoDeTrabalho);
	}
	
	public void trabalha() {
		System.out.println("Metodo Trabalha - Funcionario");
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getJornadaDeTrabalho() {
		return jornadaDeTrabalho;
	}
	public void setJornadaDeTrabalho(int jornadaDeTrabalho) {
		this.jornadaDeTrabalho = jornadaDeTrabalho;
	}
	public int getTempoDeTrabalho() {
		return tempoDeTrabalho;
	}
	public void setTempoDeTrabalho(int tempoDeTrabalho) {
		this.tempoDeTrabalho = tempoDeTrabalho;
	}
	
}
