package br.edu.infnet.tests;

import br.edu.infnet.dominio.Confederacao;

public class TConfederacao {
	
	public static void main(String[] args) {
		
		Confederacao c1 = new Confederacao("NBA - League");
		c1.setWebsite("www.nba.com");
		c1.setNacionalidade("EUA");
		
		System.out.println(c1);
		
	}
}
