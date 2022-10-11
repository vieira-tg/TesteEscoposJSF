package br.com.tiago;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class SessionScopedTeste {
	public SessionScopedTeste() {
		System.out.println("Construtor classe SessionScopedTeste");
	}

	public String getTeste() {
		return "Eu sou o SessionScope, meu tempo de vida é durante a sessão do usuário.";
	}
}
