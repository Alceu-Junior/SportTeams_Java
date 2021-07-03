package br.edu.infnet.dominio;

public class Usuario {
	
	private String nome;
	private String email;
	private String senha;
	private boolean admin;
	
	public Usuario(String nome, String email, String senha, boolean admin) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.admin = admin;
	}
	
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}




	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", email=" + email + ", admin=" + admin + "]";
	}

	
	
}

	