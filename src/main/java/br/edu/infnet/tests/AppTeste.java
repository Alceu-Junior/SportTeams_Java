package br.edu.infnet.tests;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import br.edu.infnet.dominio.Confederacao;
import br.edu.infnet.dominio.Dirigente;
import br.edu.infnet.dominio.Jogador;
import br.edu.infnet.dominio.Profissional;
import br.edu.infnet.dominio.Tecnico;
import br.edu.infnet.dominio.Time;
import br.edu.infnet.exceptions.EspecialidadeNuloException;
import br.edu.infnet.exceptions.IdadeNuloException;
import br.edu.infnet.exceptions.InvestimentoNuloException;
import br.edu.infnet.exceptions.NomeNuloException;
import br.edu.infnet.exceptions.PosicaoNuloException;
import br.edu.infnet.exceptions.ScoreNuloException;

public class AppTeste {
		
	static ArrayList<Profissional> profissionais = new ArrayList<Profissional>();
	static Time time = new Time();
	static Confederacao confederacao = new Confederacao();
	


	public static void main(String[] args) {
		try {
			String dir = "C:\\Users\\junin\\OneDrive\\Documentos\\";
			String arq = "times.txt";
	
			try {
				FileWriter fileW = new FileWriter(dir+"out_"+arq);
				BufferedWriter escrita = new BufferedWriter(fileW);
				
				FileReader file = new FileReader(dir+arq);
				BufferedReader leitura = new BufferedReader(file);
				
				String linha = leitura.readLine();
				
				while(linha != null) {
					
				String[] campos = linha.split(";");
				
				switch (campos[0].toUpperCase()) {
					
					case "A":
						Time time = new Time(campos[1]);
						time.setNacionalidade(campos[2]);
						time.setLigaProfissional("S".equalsIgnoreCase(campos[3]));
						
						Confederacao confederacao = new Confederacao(campos[4]);
						confederacao.setWebsite(campos[5]);
						confederacao.setNacionalidade(campos[6]);
						
						time.setConfederacao(confederacao);
												
						
						break;
				
					case "J":	
						Jogador jogador = new Jogador(campos[1]);
						jogador.setScore(Float.valueOf(campos[2]));
						jogador.setIdade(Integer.valueOf(campos[3]));
						jogador.setCamisa(Integer.valueOf(campos[4]));
						jogador.setPontosPorJogo(Float.valueOf(campos[5]));
						jogador.setPosicao(campos[6]);
						
						escrita.write(jogador.retornaProfissional());
						profissionais.add(jogador);
						System.out.println(jogador);
						
						break;
						
					case "D":
						Dirigente dirigente = new Dirigente(campos[1]);
						dirigente.setScore(Float.valueOf(campos[2]));
						dirigente.setIdade(Integer.valueOf(campos[3]));
						dirigente.setTimeResponsavel(campos[4]);
						dirigente.setCoDirigente(campos[5]);
						dirigente.setInvestimentoAplicado(Float.valueOf(campos[6]));
	
						escrita.write(dirigente.retornaProfissional());
						profissionais.add(dirigente);
						
						break;
						
					case "T":
						Tecnico tecnico = new Tecnico(campos[1]);
						tecnico.setScore(Float.valueOf(campos[2]));
						tecnico.setIdade(Integer.valueOf(campos[3]));
						tecnico.setEspecialidade(campos[4]);
						tecnico.setAnosDeExperiencia(Integer.valueOf(campos[5]));
						tecnico.setHistoricoProfissional(campos[6]);
												
						escrita.write(tecnico.retornaProfissional());
						profissionais.add(tecnico);
						
						break;

					default:
						break;
					}
				
				time.adicionaProfissional(profissionais);
				confederacao.adicionaTime(time);
				
				linha = leitura.readLine();	
				}
				
				
				file.close();
				leitura.close();
				escrita.close();
				fileW.close();
				
								

			} catch (IOException | NomeNuloException | IdadeNuloException | ScoreNuloException | PosicaoNuloException | InvestimentoNuloException | EspecialidadeNuloException e) {
				System.out.println(e.getMessage());
			}

		} finally {
			System.out.println("Processamento finalizado!!!");
		}
	}
}
