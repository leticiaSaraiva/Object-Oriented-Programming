//Prática 2 - Letícia Saraiva Chaves
package Projeto;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Agenda contact = new Agenda();
		Scanner s = new Scanner(System.in);
		int escolha;
		String nome, email;
		Contato cont = new Contato();
		while(true){
			System.out.println("Digite: ");
			System.out.println("1 - Adicionar novo contato");
			System.out.println("2 - Buscar um contato");
			System.out.println("3 - Remover um contato");
			
			escolha = s.nextInt();
			
			if(escolha == 1){
				System.out.println("Nome: ");
				nome = s.next();
				System.out.println("Email: ");
				email = s.next();
				contact.adicionar(nome, email);
			}else if(escolha == 2){
				System.out.println("Nome: ");
				nome = s.next();
				cont = contact.buscar(nome);
				if(cont != null){
					System.out.println("Nome: " + cont.getNome());
					System.out.println("Email: " + cont.getEmail());
				}
				
			}else if(escolha == 3){
				System.out.println("Nome: ");
				nome = s.next();
				contact.remover(nome);
			}
		}
		
	}
}