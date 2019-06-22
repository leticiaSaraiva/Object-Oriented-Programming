package Questao1;

public class Main {
	public static void main(String[] args){
		Gerente g = new Gerente("Gerente", 01, "00000000011", 5000, 8, 8);
		Tecnico t = new Tecnico("Tecnico", 02, "00000000022", 3000, 8, 8);
		AssistenteAdministrativo a = new AssistenteAdministrativo("Assistente", 03, "00000000033", 2000, 8, 8);
	
		g.trabalha();
		double z = g.exibeSalario();
		if(z != 0){
			System.out.println("Gerente: R$ " + z);
		}
		
		t.trabalha();
		double i = (double) t.exibeSalario();
		if(i != 0){
			System.out.println("Tecnico: R$ " + i);
		}
		
		a.trabalha();
		double y = a.exibeSalario();
		if(y != 0){
			System.out.println("Assistente: R$ " + y);
		}else {
			System.out.println("Assistente: R$ " + y);
		}
	
	}
}
