package br.edu.infnet.tests;

import br.edu.infnet.dominio.Tecnico;
import br.edu.infnet.exceptions.EspecialidadeNuloException;
import br.edu.infnet.exceptions.IdadeNuloException;
import br.edu.infnet.exceptions.InvestimentoNuloException;
import br.edu.infnet.exceptions.NomeNuloException;
import br.edu.infnet.exceptions.PosicaoNuloException;
import br.edu.infnet.exceptions.ScoreNuloException;

public class TTecnico {
	
	public static void main(String[] args) {
		
		Tecnico t = new Tecnico("Lulu Santos");
		t.setAnosDeExperiencia(15);
		t.setScore(1500);
		t.setEspecialidade("cantor");
		t.setHistoricoProfissional("morou no Equador");
		t.setIdade(46);
		
		try {
			System.out.println(t.retornaProfissional());
		} catch (NomeNuloException | IdadeNuloException | ScoreNuloException | PosicaoNuloException | InvestimentoNuloException | EspecialidadeNuloException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(t);
		
		
	}
}
