package br.edu.infnet.tests;

import br.edu.infnet.dominio.Confederacao;
import br.edu.infnet.dominio.Time;

public class TTime {
	public static void main(String[] args) {
		
		Confederacao c = new Confederacao("Nba");
		
		Time time = new Time("bulls");
		
		time.setConfederacao(c);
		
		System.out.println(time);
		
	}
}
