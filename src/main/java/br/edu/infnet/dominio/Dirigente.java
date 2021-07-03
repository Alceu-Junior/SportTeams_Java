package br.edu.infnet.dominio;

import br.edu.infnet.exceptions.EspecialidadeNuloException;
import br.edu.infnet.exceptions.IdadeNuloException;
import br.edu.infnet.exceptions.InvestimentoNuloException;
import br.edu.infnet.exceptions.NomeNuloException;
import br.edu.infnet.exceptions.PosicaoNuloException;
import br.edu.infnet.exceptions.ScoreNuloException;

public class Dirigente extends Profissional {
	//precisa ter uma exceção em cada classe filha de Profissional
	
	private String timeResponsavel;
	private String coDirigente;
	private float investimentoAplicado;
	

	public Dirigente(String nome) {
		super(nome);
	}

	@Override
	public float calcularScore() {
		float scoreDirigente = super.score * this.investimentoAplicado;
		return scoreDirigente;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(this.timeResponsavel);
		sb.append(";");
		sb.append(this.coDirigente);
		sb.append(";");
		sb.append(this.calcularScore());
		sb.append(";");

		
		return sb.toString();
	}
	
	@Override
	public String retornaProfissional() throws NomeNuloException, ScoreNuloException, IdadeNuloException, EspecialidadeNuloException, PosicaoNuloException, InvestimentoNuloException {
		if (this.investimentoAplicado == 0) {
			throw new InvestimentoNuloException("O investimento do dirigente nao esta definido");
			}
		String retornaDirigente = "\nTime Responsável :" + this.timeResponsavel + "\nCo-Dirigente: " + this.coDirigente + "\nInvestimento Aplicado: " + this.investimentoAplicado;
		return super.retornaProfissional() + retornaDirigente;
	}
		
		
	public String getTimeResponsavel() {
		return timeResponsavel;
	}

	public void setTimeResponsavel(String timeResponsavel) {
		this.timeResponsavel = timeResponsavel;
	}

	public String getCoDirigente() {
		return coDirigente;
	}

	public void setCoDirigente(String coDirigente) {
		this.coDirigente = coDirigente;
	}

	public float getInvestimentoAplicado() {
		return investimentoAplicado;
	}

	public void setInvestimentoAplicado(float investimentoAplicado) {
		this.investimentoAplicado = investimentoAplicado;
	}

	
}
