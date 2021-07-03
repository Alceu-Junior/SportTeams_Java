package br.edu.infnet.dominio;

import java.util.ArrayList;

public class Confederacao {

		private ArrayList<Time> times;
		private String nome;
		private String website;
		private String nacionalidade;

		public Confederacao() {
			
		}

		public Confederacao(String nome) {
			this.nome = nome;
		}
		
		@Override
		public String toString() {
			
			StringBuilder sb = new StringBuilder();
			sb.append(this.nome);
			sb.append(";");
			sb.append(this.website + ";" + this.nacionalidade);
			
			return sb.toString();
		}
		
		public String getNome() throws Exception {
			if(this.nome == null) {
				throw new Exception("A Confedera��o est� sem nome!");
			}
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public String getWebsite() {
			return website;
		}

		public void setWebsite(String website) {
			this.website = website;
		}

		public String getNacionalidade() {
			return nacionalidade;
		}

		public void setNacionalidade(String nacionalidade) {
			this.nacionalidade = nacionalidade;
		}
		
		public void adicionaTime(Time time) {
			times.add(time);
		}
			
}
