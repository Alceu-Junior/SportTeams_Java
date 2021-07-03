package br.edu.infnet.dominio;

import br.edu.infnet.exceptions.EspecialidadeNuloException;
import br.edu.infnet.exceptions.IdadeNuloException;
import br.edu.infnet.exceptions.InvestimentoNuloException;
import br.edu.infnet.exceptions.NomeNuloException;
import br.edu.infnet.exceptions.PosicaoNuloException;
import br.edu.infnet.exceptions.ScoreNuloException;

//J-nome;score;idade;camisa;pontosporjogo;posição
//T-nome;score;idade;especialidade;anosDeExperiencia;históticoProfissional
//D-nome;score;idade;timeResponsável;codirigente;investimentoAplicado

public abstract class Profissional {

	protected String nome;
	protected float score;
	protected int idade;
	
	//precisa obrigatóriamente criar um construtor igual a esse nas classes filhas
	public Profissional(String nome) {
		this.nome = nome;
	}
	
	public String retornaProfissional() throws NomeNuloException, ScoreNuloException, IdadeNuloException, EspecialidadeNuloException, PosicaoNuloException, InvestimentoNuloException {
		if (this.nome == null) {
			throw new NomeNuloException("O jogador esta sem nome informado");
		}
		if (this.score == 0) {
			throw new ScoreNuloException("O jogador esta sem score informado");
		}
		if (this.idade == 0) {
			throw new IdadeNuloException("O jogador esta sem idade informada");
		}
		String frase = "Nome: " + this.nome + "\nScore: " + this.score + "\nIdade: " + this.idade;
		return frase;
		
		//System.out.println("Nome: " + this.nome);
		//System.out.println("Score: " + this.score);
		//System.out.println("Idade: " + this.idade);
		
	}
	
	public abstract float calcularScore();
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(this.nome);
		sb.append(";");
		sb.append(this.score);
		sb.append(";");
		sb.append(this.idade);
		sb.append(";");
		
		return sb.toString();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}

	
	
	