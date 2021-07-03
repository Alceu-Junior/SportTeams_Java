package br.edu.infnet.tests;

import br.edu.infnet.dominio.Jogador;
import br.edu.infnet.exceptions.EspecialidadeNuloException;
import br.edu.infnet.exceptions.IdadeNuloException;
import br.edu.infnet.exceptions.InvestimentoNuloException;
import br.edu.infnet.exceptions.NomeNuloException;
import br.edu.infnet.exceptions.PosicaoNuloException;
import br.edu.infnet.exceptions.ScoreNuloException;

public class TJogador {
	public static void main(String[] args) {
		
		Jogador j = new Jogador("Jordan");
		j.setCamisa(23);
		j.setPosicao("ala");
		j.setPontosPorJogo(34);
		
		
		Jogador j2 = new Jogador("Jordan");
		j2.setCamisa(12);
		j2.setPosicao("pivo");
		j2.setPontosPorJogo(16);
		
		
		Jogador j3 = new Jogador("Jordan");
		j3.setCamisa(23);
		j3.setPontosPorJogo(34);
		j3.setCamisa(14);
		j3.setIdade(14);
		j3.setScore(15);
		j3.setPosicao("ala");
		
		
		try {
			System.out.println(j3.retornaProfissional());
			
		}catch (NomeNuloException | IdadeNuloException | ScoreNuloException | PosicaoNuloException | InvestimentoNuloException | EspecialidadeNuloException e) {
			System.out.println(e.getMessage());
		}
	}
}
