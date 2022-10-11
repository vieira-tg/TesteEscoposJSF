package br.com.tiago;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class RequestScopedTeste {
	public RequestScopedTeste() {
		System.out.println("Construtor classe RequestScopedTeste");
	}

	public String getTeste() {
		return "Eu sou o ResquestScoped, meu tempo de vida é durante cada request no servidor.";
	}
}
