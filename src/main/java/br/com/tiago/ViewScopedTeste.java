package br.com.tiago;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ViewScopedTeste {
	public ViewScopedTeste() {
		System.out.println("Construtor classe ViewScopedTeste");
	}

	public String getTeste() {
		return "Eu sou o ViewScopedTeste, meu tempo de vida é enquanto existir uma tela.";
	}
}
