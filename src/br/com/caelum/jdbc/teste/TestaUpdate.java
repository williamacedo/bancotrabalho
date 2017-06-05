package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.CorreioDao;
import br.com.caelum.jdbc.modelo.Estados;

public class TestaUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estados estados = new Estados();
		estados.setUf("CP");
		estados.setNome("Caelumsd");
		estados.setId(29);
		
		CorreioDao bd = new CorreioDao();
		
		bd.altera(estados);
		
		System.out.println("Alterado!");
	}

}
