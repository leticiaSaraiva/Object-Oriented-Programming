//Prática 2 - Letícia Saraiva Chaves
package Projeto;

import java.util.ArrayList;

public class Agenda extends Contato{
	
	public Agenda() {
		
	}
	
	ArrayList<Contato> contatos = new ArrayList<Contato> ();	
	
	public void adicionar(String nome, String email){
		Contato c = new Contato();
		c.setNome(nome);
		c.setEmail(email);
		
		contatos.add(c);
		
		System.out.println("Contato " + c.getNome() + " adicionado com sucesso!");
	
	}
	
	public Contato buscar(String nome){
		for(Contato c:contatos) {
			if(nome.equals(c.getNome())){
				return c;
			}
		}
		System.out.println("Contato não encontrado!");
		return null;
			
	}
	
	public void remover(String nome){
		Contato cont = buscar(nome);
		if(cont != null){
			contatos.remove(cont);
			System.out.println("Contato removido com sucesso!");
		}
	}
}