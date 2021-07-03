package br.edu.infnet.dominio;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class Time {

	private ArrayList<Profissional> profissionais;
	private Confederacao confederacao;
	private String nome;
	private String nacionalidade;
	private boolean ligaProfissional;
	private LocalDateTime data;
	
	
	public Time() {
		data = LocalDateTime.now();
	}
	
	public Time(String nome) {
		this();
		this.nome = nome;
	}
	
	
	@Override
	public String toString() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		return String.format("%s; %s; %b; %s; %s",
				this.getNome(),
				this.getNacionalidade(),
				this.isLigaProfissional() ? "S" : "N",
				this.data.format(formato),
				this.confederacao.toString()
			);
	}

	public ArrayList<Profissional> getProfissionais() {
		return profissionais;
	}

	public void setProfissionais(ArrayList<Profissional> profissionais) {
		this.profissionais = profissionais;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public boolean isLigaProfissional() {
		return ligaProfissional;
	}

	public void setLigaProfissional(boolean ligaProfissional) {
		this.ligaProfissional = ligaProfissional;
	}

	public Confederacao getConfederacao() {
		return confederacao;
	}

	public void setConfederacao(Confederacao confederacao) {
		this.confederacao = confederacao;
	}
	
	public void adicionaProfissional(Profissional profissional) {
		profissionais.add(profissional);
	}
	
	public void adicionaProfissional(ArrayList<Profissional> profissional) {
		profissionais.addAll(profissional);
	}

}
