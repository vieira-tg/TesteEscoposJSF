package br.com.tiago;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class ApplicationScopedTeste {
	
	public ApplicationScopedTeste() {
		System.out.println("Construtor classe ApplicationScopedTeste");
	}
	
	public String getTeste() {
		return "Eu sou o ApplicationScoped e o meu tempo de vida é enquanto a aplicação estar rodando, eu compartilho meus dados com todos usuários.";
	}
}
