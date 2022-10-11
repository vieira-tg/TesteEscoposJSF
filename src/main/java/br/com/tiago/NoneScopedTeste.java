package br.com.tiago;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.NoneScoped;

@ManagedBean
@NoneScoped
public class NoneScopedTeste {
	public NoneScopedTeste() {
		System.out.println("Construtor classe NoneScopedTeste");
	}

	public String getTeste() {
		return "Eu sou o NoneScoped, e o meu tempo de vida é a cada busca de dados(cada campo)";
	}	
}
