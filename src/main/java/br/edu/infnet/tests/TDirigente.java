package br.edu.infnet.tests;

import br.edu.infnet.dominio.Dirigente;
import br.edu.infnet.exceptions.EspecialidadeNuloException;
import br.edu.infnet.exceptions.IdadeNuloException;
import br.edu.infnet.exceptions.InvestimentoNuloException;
import br.edu.infnet.exceptions.NomeNuloException;
import br.edu.infnet.exceptions.PosicaoNuloException;
import br.edu.infnet.exceptions.ScoreNuloException;

public class TDirigente {
	public static void main(String[] args) {
		
		Dirigente d = new Dirigente("Renato Russo");
		d.setCoDirigente("Legiao Urbana");
		d.setIdade(39);
		d.setInvestimentoAplicado(39999);
		d.setScore(100);
		d.setTimeResponsavel("Brasilia");
		
		try {
			System.out.println(d.retornaProfissional());
		}catch (NomeNuloException | IdadeNuloException | ScoreNuloException | PosicaoNuloException | InvestimentoNuloException | EspecialidadeNuloException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		System.out.println(d);
		
	}
}
