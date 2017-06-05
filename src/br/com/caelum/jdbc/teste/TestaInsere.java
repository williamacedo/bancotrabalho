package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.CorreioDao;
import br.com.caelum.jdbc.modelo.Estados;

public class TestaInsere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Estados estados = new Estados();
		estados.setUf("CA");
		estados.setNome("Caelum");
		
		CorreioDao bd = new CorreioDao();
		
		bd.adiciona(estados);
		
		System.out.println("Gravado!");

	}
}
